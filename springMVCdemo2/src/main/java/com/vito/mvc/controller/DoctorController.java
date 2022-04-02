package com.vito.mvc.controller;


import com.vito.mvc.bean.ResponseData;
import com.vito.mvc.bean.Doctor;
import com.vito.mvc.bean.Login;
import com.vito.mvc.bean.User;
import com.vito.mvc.dao.DoctorMapper;
import com.vito.mvc.service.DoctorService;

import com.vito.mvc.service.HttpClient;
import com.vito.mvc.service.UserService;
import com.vito.mvc.utils.JWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@CrossOrigin
@Controller
public class DoctorController {

    @Autowired
    DoctorService doctorService;
    @Autowired
    DoctorMapper doctorMapper;
    @Autowired
    UserService userService;
    @Autowired
    HttpClient hc;

    /**
     *用户
     */
    @PostMapping(value="/login", produces = "application/json; charset=utf-8")
    public @ResponseBody
    ResponseData login(HttpServletRequest request,@RequestParam("js_code") String js_code) {
        //获取session_key,openid
        String wechatApiInfo;
        System.out.println("js_code"+js_code);
        wechatApiInfo = hc.doGet("https://api.weixin.qq.com/sns/jscode2session?appid=wxeae4d653ad57dcc5&secret=d531d7a5592343794f8f897ba929e9be&js_code="+js_code+"&grant_type=authorization_code");
//        wechatApiInfo= "{\"session_key\":\"Jd+BjczJSQg2CBMoSMTYXQ==\",\"openid\":\"oSZXB5SdDSDWas6kSS3UZOShm0kI\"}";

        String session_key = getSession_key(wechatApiInfo);
        String openid = getOpen_id(wechatApiInfo);
        System.out.println("wechatApiInfo"+wechatApiInfo);
        Login login = new Login();
        login.setSession_key(session_key);
        login.setOpenid(openid);
        ResponseData responseData = ResponseData.ok();
        //先到数据库验证
        String loginId = userService.checkLogin(login.getOpenid()).getId();//这里是否是用sessionkey进行验证？？
        if(null != loginId) {
            User user = userService.getUserByLoginId(loginId);
            login.setOpenid(loginId);
            //给用户jwt加密生成token
            String token = JWT.sign(login, 60L* 1000L* 30L);
            //封装成对象返回给客户端
            responseData.putDataValue("loginId", login.getId());
            responseData.putDataValue("token", token);
            responseData.putDataValue("user", user);
        }
        else{
            responseData =  ResponseData.customerError();
            System.out.println("code错误");
        }
        return responseData;
    }

    /**
     *Test注册
     */
    @RequestMapping("/doc_register")
    @ResponseBody
    public String register(String name,String password){
        List<Doctor> docs = doctorService.getAll();
        Integer id;
        id=docs.size()+1;
        if(name == null || name.isEmpty()){
            return "Name Cannot Be Empty";
        }
        if(password == null || password.isEmpty()){
            return "Password Cannot Be Empty";
        }
        doctorMapper.insertSelective(new Doctor(id,name,password));
//        System.out.println(resultcnt);
        return "Register Success";
    }

    /**
     *Test登录
     */
    @RequestMapping("/doc_login")
    @ResponseBody
    public String login(String name,String password){
        if(name == null || name.isEmpty()){
            return "Name Cannot Be Empty";
        }
        if(password == null || password.isEmpty()){
            return "Password Cannot Be Empty";
        }
        Doctor doc = doctorService.getDoc(name);
        if(doc == null){
            return "No such register";
        }
        else {
            if(password .equals(doc.getPassword())){
                System.out.println("Input:"+password);
                System.out.println("Database:"+doc.getPassword());
                return "Welcome!"+doc.getName();
            }
            else {
                System.out.println("Input:"+password);
                System.out.println("Database:"+doc.getPassword());
                System.out.println(password == doc.getPassword());
                return "Wrong Password";
            }
        }
    }

    /**
     *Test查询信息
     * @return
     */
    @RequestMapping("/get_doc_info")
    @ResponseBody
    public Object getDocts(){
        List<Doctor> docs = doctorService.getAll();
//        departmentMapper.insertSelective(new Department(4,"运维部"));
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("doc_count", docs.size());
        map.put("deptName", docs.get(0).getName());//json
        return map;
    }

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        return "Success";
    }

    public String getSession_key(String wechatApiInfo){
        wechatApiInfo=wechatApiInfo.replace("\"", "");
        wechatApiInfo=wechatApiInfo.replace("{", "");
        wechatApiInfo=wechatApiInfo.replace("}", "");
        String[] strarray = wechatApiInfo.split(",");
        String[] SK = strarray[0].split(":");
        String[] OI = strarray[1].split(":");
        return SK[1];
    }
    public String getOpen_id(String wechatApiInfo){
        wechatApiInfo=wechatApiInfo.replace("\"", "");
        wechatApiInfo=wechatApiInfo.replace("{", "");
        wechatApiInfo=wechatApiInfo.replace("}", "");
        wechatApiInfo=wechatApiInfo.replace("\r", "");
        wechatApiInfo=wechatApiInfo.replace("\n", "");
        String[] strarray = wechatApiInfo.split(",");
        String[] OI = strarray[1].split(":");
        return OI[1];
    }

}

package com.vito.mvc.test;

import com.vito.mvc.bean.Doctor;
import com.vito.mvc.bean.Login;
import com.vito.mvc.bean.ResponseData;
import com.vito.mvc.bean.User;
import com.vito.mvc.service.HttpClient;
import com.vito.mvc.dao.DoctorMapper;
import com.vito.mvc.service.DoctorService;
import com.vito.mvc.service.UserService;
import com.vito.mvc.utils.JWT;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.springframework.asm.Type.getType;

/**
 * 测试dao层的工作：
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    DoctorMapper doctorMapper;

    @Autowired
    DoctorService doctorService;

    @Autowired
    HttpClient hc;

    @Autowired
    UserService userService;
    /**
     * 测试DoctorMapper
     */
    @Test
    public void testCRUD(){
//        //1.创建SpringIOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //2.从容器中获取mapper
        DoctorMapper bean = ioc.getBean(DoctorMapper.class);
        System.out.println("======================test======================");
        System.out.println(doctorMapper);
        String wechatApiInfo;
//        wechatApiInfo = hc.doGet("https://api.weixin.qq.com/sns/jscode2session?appid=wxeae4d653ad57dcc5&secret=d531d7a5592343794f8f897ba929e9be&js_code=003Cyb000pEFzN1AnX100zT5zy1Cyb0K&grant_type=authorization_code");

//        Doctor doc = doctorService.getDoc("Doc_1");
//        System.out.println("DoctorName:"+doc.getName());
//        System.out.println("DoctorPassword:"+doc.getPassword());
//        System.out.println("wechatApiInfo:"+wechatApiInfo);

//        Login login = new Login();
//        login.setTel("123456");
//        login.setPassword("123456");
////        Integer loginId = userService.checkLogin(login.getTel()).getId();
//        ResponseData responseData = ResponseData.ok();
//        System.out.println("loginId："+loginId);
//        if(null != loginId) {
//            User user = userService.getUserByLoginId(loginId);
//            login.setId(loginId);
//            //给用户jwt加密生成token
//            String token = JWT.sign(login, 60L* 1000L* 30L);
//            //封装成对象返回给客户端
//            responseData.putDataValue("loginId", login.getId());
//            responseData.putDataValue("token", token);
//            responseData.putDataValue("user", user);
//            login = JWT.unsign(token, Login.class);
//        }
//        System.out.println("ResponseData:"+responseData);
//        System.out.println("ResponseData-message:"+responseData.getMessage());
//        System.out.println("ResponseData-code:"+responseData.getCode());
//        System.out.println("ResponseData-loginId:"+responseData.getData().get("loginId"));
//        System.out.println("ResponseData-user:"+responseData.getData().get("user"));
//        System.out.println("ResponseData-token:"+responseData.getData().get("token"));
//        System.out.println("JWT.unsign:"+login);


        //1.插入几个部门
//        doctorMapper.insertSelective(new Doctor(1,"Doc_1","123456"));
//        System.out.println(departmentMapper.getAllDepartment());
        System.out.println("======================test======================");

    }

    @Test
    public void testSth(){
        String wechatApiInfo = "{\"session_key\":\"2vYh1z6JCUeSCOHjg3kbDg==\",\"openid\":\"oSZXB5SdDSDWas6kSS3UZOShm0kI\"}";
//        String wanger = "wxeae4d653ad57dcc5";
        wechatApiInfo=wechatApiInfo.replace("\"", "");
        wechatApiInfo=wechatApiInfo.replace("{", "");
        wechatApiInfo=wechatApiInfo.replace("}", "");
        String[] strarray = wechatApiInfo.split(",");
        String[] SK = strarray[0].split(":");
        String[] OI = strarray[1].split(":");
        System.out.println(SK[0]+"+"+SK[1]);
        System.out.println(OI[0]+"+"+OI[1]);
    }
}

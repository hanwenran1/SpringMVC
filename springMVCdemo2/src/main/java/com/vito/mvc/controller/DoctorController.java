package com.vito.mvc.controller;


import com.vito.mvc.bean.*;
import com.vito.mvc.dao.DoctorMapper;
import com.vito.mvc.dao.QuestionMapper;
import com.vito.mvc.dao.UserMapper;
import com.vito.mvc.service.DoctorService;

import com.vito.mvc.service.HttpClient;
import com.vito.mvc.service.QuestionService;
import com.vito.mvc.service.UserService;
import com.vito.mvc.utils.JWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

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
    UserMapper userMapper;
    @Autowired
    QuestionMapper questionMapper;
    @Autowired
    QuestionService questionService;
    @Autowired
    HttpClient hc;

    /**
     *用户
     */
    @PostMapping(value="/login", produces = "application/json; charset=utf-8")
    public @ResponseBody
    ResponseData login(HttpServletRequest request,@RequestBody Map<String, Object> map_front) {
        //获取session_key,openid
        String js_code = (String) map_front.get("js_code");
        String wechatApiInfo;
        System.out.println("js_code"+js_code);
        wechatApiInfo = hc.doGet("https://api.weixin.qq.com/sns/jscode2session?appid=wxeae4d653ad57dcc5&secret=d531d7a5592343794f8f897ba929e9be&js_code="+js_code+"&grant_type=authorization_code");
//        wechatApiInfo= "{\"session_key\":\"Jd+BjczJSQg2CBMoSMTYXQ==\",\"openid\":\"oSZXB5SdDSDWas6kSS3UZOShm0kI\"}";
//        wechatApiInfo= "{\"session_key\":\"Jd+BjczJSQg2CBMoSMTYXQ==\",\"openid\":\"666777\"}";     //错误Info
        String session_key = getSession_key(wechatApiInfo);
        String openid = getOpen_id(wechatApiInfo);
        System.out.println("wechatApiInfo"+wechatApiInfo);
        Login login = new Login();
        login.setSession_key(session_key);
        login.setOpenid(openid);
        ResponseData responseData = ResponseData.ok();
        //先到数据库验证
        String loginId = new String();
        try{
            loginId = userService.checkLogin(login.getOpenid()).getOpenid();//这里是否是用sessionkey进行验证？？
            System.out.println("loginID???"+loginId);
        }
        catch (Exception e){
            loginId = null;
            System.out.println("未注册的新用户");
        }
        if(null != loginId) {   //老用户直接登录
            System.out.println("老用户");
            User user = userService.getUserByLoginId(loginId);
            login.setOpenid(loginId);
            //给用户jwt加密生成token
            String token = JWT.sign(login, 60L* 1000L* 30L);
            //封装成对象返回给客户端
//            responseData.putDataValue("loginId", login.getId());
            responseData.putDataValue("token", token);
            responseData.putDataValue("user", user);
        }
        else{
            //新用户注册
            System.out.println("新用户");
            User user =new User();
            Integer id = userService.getAll().size()+1;
            user.setId(id);
            user.setOpenid(openid);
            user.setSessionKey(session_key);
            userMapper.insert(user);
            System.out.println("user::"+user);
            System.out.println("userid::"+user.getId());

            login.setOpenid(openid);
            //给用户jwt加密生成token
            String token = JWT.sign(login, 60L* 1000L* 30L);
//            responseData.putDataValue("loginId", login.getId());
            responseData.putDataValue("token", token);
            responseData.putDataValue("user", user);
//            responseData =  ResponseData.customerError();
//            System.out.println("code错误");
        }
        return responseData;
    }

    /**
     * 获取问题数据
     */
    @PostMapping(value="/question", produces = "application/json; charset=utf-8")
    @ResponseBody
    public Map question_random(@RequestBody Map<String, Object> map_front){
        //得到前端传入的token与time时间
        String token = (String) map_front.get("token");
//        String time = (String) map_front.get("time");
        //解析token获得openid
        String openid = JWT.unsign(token,String.class);

        Random random = new Random();
        Map<String, Object> map=new HashMap<String, Object>();

        String[] questionList = {"P_Sex","P_Age","P_Constellation","P_Blood_Type","P_Occupation_Risk","P_Education","P_Marriage_Status","P_Surgery_History","P_Comparison","P_Others_Satisfaction","P_Change_Life","P_Change_Destiny","P_Kinsfolk_Attitude","P_Unhappiness_Family","P_Mental_Disorder","P_Selfie","P_Appearance_Attention","D_Charm","D_Subjective","D_Modesty","D_Attention","D_Expression","D_Extreme_Emotion","D_Expectation","D_Detail","D_Comprehension","D_Internet_Research","D_Suspicious","D_Repair","D_Impulsion","D_Price","D_Slander","D_Forwardness","D_Praise","D_Quarrel","D_ Art_Detail","D_Scar","D_Fail","D_Nurse","D_Perfect","D_Paranoid","Judgement"};
        Integer[] questionAnswer = new Integer[questionList.length];
        String[] questionAnswer_String = new String[questionList.length];

        //字典
        String[] whether = {"是","否"};
        String[] sex = {"男","女"};
        String[] constellation = {"白羊座","金牛座","双子座","巨蟹座","狮子座","处女座","天秤座","天蝎座","射手座","摩羯座","水瓶座","双鱼座"};
        String[] blood_type = {"A","B","AB","O"};
        String[] education = {"高中及以下","大专","本科","硕士及以上"};
        String[] marriage = {"单身","离异","拥有恋人或已婚"};
        String[] modesty = {"善于倾听","傲慢","一般"};
        String[] expression = {"有口才","表述含糊不清","一般"};
        String[] occupation = {"法律","自媒体","演员","公务员","自由职业"};

        //问题字段与对应答案（数字格式）存入数组
        for(int i=0;i<questionList.length;i++){
            if(i==1||i==2||i==3||i==4||i==5||i==6||i==19||i==21){
                if(i==1)
                    questionAnswer[1]=random.nextInt(80);   //年龄
                if(i==2)
                    questionAnswer[2]=random.nextInt(12);   //星座：0-白羊座；1-金牛座；2-双子座；3-巨蟹座；4-狮子座；5-处女座；6-天秤座；7-天蝎座；8-射手座；9-摩羯座；10-水瓶座；11-双鱼座
                if(i==3)
                    questionAnswer[3]=random.nextInt(4);    //血型：0-A；1-B；2-AB；3-O
                if(i==4)
                    questionAnswer[4]=random.nextInt(5);    //职业：0-law；1-self_media；2-actor；3-civil_servant；4-free
                if(i==5)
                    questionAnswer[5]=random.nextInt(4);    //学历：0-高中及以下；1-大专；2-本科；3-硕士及以上
                if(i==6)
                    questionAnswer[6]=random.nextInt(3);    //婚恋：0-单身；1-离异；2-拥有恋人或已婚
                if(i==19)
                    questionAnswer[19]=random.nextInt(3);   //是否善于倾听：0-善于倾听；1-傲慢；2-一般
                if(i==21)
                    questionAnswer[21]=random.nextInt(3);   //表述能力：0-有口才；1-表述含糊不清；2-一般
            }
            else {
                questionAnswer[i]=random.nextInt(2);
            }
        }

        //存入数据库
        for(int i=0;i<questionAnswer.length;i++){
            questionAnswer_String[i]=String.valueOf(questionAnswer[i]);
        }
        Integer id;
        Question question = new Question(Byte.valueOf(questionAnswer_String[0]),Byte.valueOf(questionAnswer_String[1]),Byte.valueOf(questionAnswer_String[2]),Byte.valueOf(questionAnswer_String[3]),Byte.valueOf(questionAnswer_String[4]),Byte.valueOf(questionAnswer_String[5]),Byte.valueOf(questionAnswer_String[6]),Byte.valueOf(questionAnswer_String[7]),Byte.valueOf(questionAnswer_String[8]),Byte.valueOf(questionAnswer_String[9]),Byte.valueOf(questionAnswer_String[10]),Byte.valueOf(questionAnswer_String[11]),Byte.valueOf(questionAnswer_String[12]),Byte.valueOf(questionAnswer_String[13]),Byte.valueOf(questionAnswer_String[14]),Byte.valueOf(questionAnswer_String[15]),Byte.valueOf(questionAnswer_String[16]),Byte.valueOf(questionAnswer_String[17]),Byte.valueOf(questionAnswer_String[18]),Byte.valueOf(questionAnswer_String[19]),Byte.valueOf(questionAnswer_String[20]),Byte.valueOf(questionAnswer_String[21]),Byte.valueOf(questionAnswer_String[22]),Byte.valueOf(questionAnswer_String[23]),Byte.valueOf(questionAnswer_String[24]),Byte.valueOf(questionAnswer_String[25]),Byte.valueOf(questionAnswer_String[26]),Byte.valueOf(questionAnswer_String[27]),Byte.valueOf(questionAnswer_String[28]),Byte.valueOf(questionAnswer_String[29]),Byte.valueOf(questionAnswer_String[30]),Byte.valueOf(questionAnswer_String[31]),Byte.valueOf(questionAnswer_String[32]),Byte.valueOf(questionAnswer_String[33]),Byte.valueOf(questionAnswer_String[34]),Byte.valueOf(questionAnswer_String[35]),Byte.valueOf(questionAnswer_String[36]),Byte.valueOf(questionAnswer_String[37]),Byte.valueOf(questionAnswer_String[38]),Byte.valueOf(questionAnswer_String[39]),Byte.valueOf(questionAnswer_String[40]),null);
        questionMapper.insert(question);
        id = question.getId();

        //返回前端
        for(int i=0;i<questionList.length;i++){
            if(i==0||i==1||i==2||i==3||i==4||i==5||i==6||i==19||i==21){
                if(i==0)
                    map.put(questionList[0], sex[questionAnswer[0]]);
                if(i==1)
                    map.put(questionList[1], questionAnswer[1]);   //年龄
                if(i==2)
                    map.put(questionList[2], constellation[questionAnswer[2]]);   //星座：0-白羊座；1-金牛座；2-双子座；3-巨蟹座；4-狮子座；5-处女座；6-天秤座；7-天蝎座；8-射手座；9-摩羯座；10-水瓶座；11-双鱼座
                if(i==3)
                    map.put(questionList[3], blood_type[questionAnswer[3]]);    //血型：0-A；1-B；2-AB；3-O
                if(i==4)
                    map.put(questionList[4], occupation[questionAnswer[4]]);    //职业：0-law；1-self_media；2-actor；3-civil_servant；4-free
                if(i==5)
                    map.put(questionList[5], education[questionAnswer[5]]);    //学历：0-高中及以下；1-大专；2-本科；3-硕士及以上
                if(i==6)
                    map.put(questionList[6], marriage[questionAnswer[6]]);    //婚恋：0-单身；1-离异；2-拥有恋人或已婚
                if(i==19)
                    map.put(questionList[19], modesty[questionAnswer[19]]);   //是否善于倾听：0-善于倾听；1-傲慢；2-一般
                if(i==21)
                    map.put(questionList[21], expression[questionAnswer[21]]);   //表述能力：0-有口才；1-表述含糊不清；2-一般
            }
            else {
                map.put(questionList[i], whether[questionAnswer[i]]);
            }
        }
        map.put("id",id);
        return map;
    }

    /**
     * 接收前端判断结果
     */
    @PostMapping(value="/answer", produces = "application/json; charset=utf-8")
    @ResponseBody
    public Question answer_judgement(@RequestBody Map<String, Object> map_front){
        //得到该问题信息
        Integer id = (Integer) map_front.get("Id");
        String Judgement_I = (String) map_front.get("Judgement");
        String token = (String) map_front.get("token");
        String time = (String) map_front.get("time");
        Byte Judgement = Byte.valueOf(Judgement_I);
        Question question = questionMapper.selectByPrimaryKey(id);
        question.setJudgement(Judgement);
        questionMapper.updateByPrimaryKeySelective(question);
        return question;
    }

    /**
     * 测试Post
     */
    @PostMapping("/test11")
    @ResponseBody
    public Map test11(@RequestBody Map<String, Object> map){
        Integer id = (Integer) map.get("id");
        String name = (String) map.get("name");
        Integer age = (Integer) map.get("age");
        Map<String, Object> map1=new HashMap<String, Object>();
        map1.put("id", id);
        map1.put("name", name);
        map1.put("age", age);
        return map1;
    }
    @PostMapping("/test22")
    @ResponseBody
    public String test22(){
        return "sss";
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

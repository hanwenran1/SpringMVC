package com.vito.mvc.controller;


import com.vito.mvc.bean.*;
import com.vito.mvc.dao.DoctorMapper;
import com.vito.mvc.dao.QuestionMapper;
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
     * 获取问题数据
     */
    @PostMapping(value="/question", produces = "application/json; charset=utf-8")
    @ResponseBody
    public Map question_random(){
        Random random = new Random();
        Map<String, Object> map=new HashMap<String, Object>();

        String[] questionList = {"P_Sex","P_Age","P_Constellation","P_Blood_Type","P_Occupation_Risk","P_Education","P_Marriage_Status","P_Surgery_History","P_Comparison","P_Others’_Satisfaction","P_Change_Life","P_Change_Destiny","P_Kinsfolk_Attitude","P_Unhappiness_Family","P_Mental_Disorder","P_Selfie","P_Appearance_Attention","D_Charm","D_Subjective","D_Modesty","D_Attention","D_Expression","D_Extreme_Emotion","D_Expectation","D_Detail","D_Comprehension","D_Internet_Research","D_Suspicious","D_Repair","D_Impulsion","D_Price","D_Slander","D_Forwardness","D_Praise","D_Quarrel","D_ Art_Detail","D_Scar","D_Fail","D_Nurse","D_Perfect","D_Paranoid","Judgement"};
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

        //问题字段与对应答案（数字格式）存入数组
        for(int i=0;i<questionList.length;i++){
            if(i==1||i==2||i==3||i==5||i==6||i==19||i==21){
                if(i==1)
                    questionAnswer[1]=random.nextInt(80);   //年龄
                if(i==2)
                    questionAnswer[2]=random.nextInt(12);   //星座：0-白羊座；1-金牛座；2-双子座；3-巨蟹座；4-狮子座；5-处女座；6-天秤座；7-天蝎座；8-射手座；9-摩羯座；10-水瓶座；11-双鱼座
                if(i==3)
                    questionAnswer[3]=random.nextInt(4);    //血型：0-A；1-B；2-AB；3-O
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
        List<Question> qus = questionService.getAll();
        Integer id;
        id=qus.size()+1;
        Question question = new Question(id,questionAnswer_String[0],questionAnswer_String[1],questionAnswer_String[2],questionAnswer_String[3],questionAnswer_String[4],questionAnswer_String[5],questionAnswer_String[6],questionAnswer_String[7],questionAnswer_String[8],questionAnswer_String[9],questionAnswer_String[10],questionAnswer_String[11],questionAnswer_String[12],questionAnswer_String[13],questionAnswer_String[14],questionAnswer_String[15],questionAnswer_String[16],questionAnswer_String[17],questionAnswer_String[18],questionAnswer_String[19],questionAnswer_String[20],questionAnswer_String[21],questionAnswer_String[22],questionAnswer_String[23],questionAnswer_String[24],questionAnswer_String[25],questionAnswer_String[26],questionAnswer_String[27],questionAnswer_String[28],questionAnswer_String[29],questionAnswer_String[30],questionAnswer_String[31],questionAnswer_String[32],questionAnswer_String[33],questionAnswer_String[34],questionAnswer_String[35],questionAnswer_String[36],questionAnswer_String[37],questionAnswer_String[38],questionAnswer_String[39],questionAnswer_String[40],null);
        questionMapper.insert(question);

        //返回前端
        for(int i=0;i<questionList.length;i++){
            if(i==0||i==1||i==2||i==3||i==5||i==6||i==19||i==21){
                if(i==0)
                    map.put(questionList[0], sex[questionAnswer[0]]);
                if(i==1)
                    map.put(questionList[1], questionAnswer[1]);   //年龄
                if(i==2)
                    map.put(questionList[2], constellation[questionAnswer[2]]);   //星座：0-白羊座；1-金牛座；2-双子座；3-巨蟹座；4-狮子座；5-处女座；6-天秤座；7-天蝎座；8-射手座；9-摩羯座；10-水瓶座；11-双鱼座
                if(i==3)
                    map.put(questionList[3], blood_type[questionAnswer[3]]);    //血型：0-A；1-B；2-AB；3-O
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

        return map;
    }

    /**
     * 接收前端判断结果
     */
    @PostMapping(value="/answer", produces = "application/json; charset=utf-8")
    @ResponseBody
    public Question answer_judgement(@RequestParam("Judgement") String Judgement){
        //获取当前问题id
        long i = questionMapper.countByExample(null);
        int id = (int)i;
        //得到该问题信息
        Question question = questionMapper.selectByPrimaryKey(id);
        question.setJudgement(Judgement);
        questionMapper.updateByPrimaryKeySelective(question);
        return question;
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

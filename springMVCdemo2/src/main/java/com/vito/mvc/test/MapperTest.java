package com.vito.mvc.test;

import com.vito.mvc.bean.Question;
import com.vito.mvc.dao.QuestionMapper;
import com.vito.mvc.service.HttpClient;
import com.vito.mvc.dao.DoctorMapper;
import com.vito.mvc.service.DoctorService;
import com.vito.mvc.service.QuestionService;
import com.vito.mvc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

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

    @Autowired
    QuestionMapper questionMapper;

    @Autowired
    QuestionService questionService;
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

    @Test
    public void testRandom(){
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
        System.out.println(map);
    }

    @Test
    public void testCount(){
        String[] a = {"0","1","2","3"};

//        long i = questionMapper.countByExample(null);
//        int id = (int)i;
        System.out.println("Byte::"+Byte.valueOf(a[0])+","+Byte.valueOf(a[1])+","+Byte.valueOf(a[2])+","+Byte.valueOf(a[3]));
    }
}

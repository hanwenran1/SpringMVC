package com.vito.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Date:2022/3/22
 * Author:Vito
 * Description:
 */
//{
//////    "code": 0,1 0,1表示成功或者失败
//////        "data":返回业务数据{}
//////        }
@Controller()
public class TestController {
    @RequestMapping("/")
    @ResponseBody
    public Object index(){
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("code", 1);
        map.put("data",2 );//json
        return map;
//        return "index";
    }

    @RequestMapping("/param")
    public String param(){
        return "test_param";
    }


}

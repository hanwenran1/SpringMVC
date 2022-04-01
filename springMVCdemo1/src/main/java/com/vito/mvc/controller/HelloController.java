package com.vito.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Date:2022/3/21
 * Author:Vito
 * Description:
 */
@Controller
public class HelloController {

    //"/"-->/WEB-INF/templates/index.html
    @RequestMapping("/")
    public String index(){
        //返回视图名称
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}

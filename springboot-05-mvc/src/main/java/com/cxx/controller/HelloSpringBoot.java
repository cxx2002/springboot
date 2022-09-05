package com.cxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 陈喜喜
 * @date 2022-08-03 16:21
 */
@Controller
public class HelloSpringBoot {
    @RequestMapping("/hello")
    @ResponseBody
    public String helloSpringBoot(){
        System.out.println("hello spring boot");
        return "hello spring boot";
    }
}

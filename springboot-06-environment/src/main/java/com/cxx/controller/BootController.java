package com.cxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 陈喜喜
 * @date 2022-08-03 17:05
 */
@Controller
public class BootController {
    //设置了application配置文件后====http://localhost:8082/myboot/hello
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello springboot!!!!!!";
    }
}

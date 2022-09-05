package com.cxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 陈喜喜
 * @date 2022-08-03 17:37
 */
@Controller
public class BootController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "springboot hello 多环境配置";
    }
}

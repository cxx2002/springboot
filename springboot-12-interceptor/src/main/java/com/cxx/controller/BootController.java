package com.cxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 陈喜喜
 * @date 2022-08-04 16:14
 */
@Controller
public class BootController {
    @RequestMapping("/user/account")
    @ResponseBody
    public String account() {
        return "/user/account";
    }

    @RequestMapping("/user/login")
    @ResponseBody
    public String login() {
        return "/user/login";
    }
}

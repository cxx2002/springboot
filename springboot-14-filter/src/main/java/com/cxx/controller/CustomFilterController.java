package com.cxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 陈喜喜
 * @date 2022-08-04 17:21
 */
@Controller
public class CustomFilterController {
    @RequestMapping("/user/account")
    @ResponseBody
    public String account() {
        return "user/account";
    }
    @RequestMapping("/query")
    @ResponseBody
    public String query() {
        return "query";
    }
}

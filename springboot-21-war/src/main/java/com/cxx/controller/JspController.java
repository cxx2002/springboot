package com.cxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 陈喜喜
 * @date 2022-08-14 22:09
 * Model的作用域是request
 */
@Controller
public class JspController {
    @RequestMapping("/main")
    public String getMain(Model model) {
        model.addAttribute("data","springboot打包war文件");
        return "index";
    }
}

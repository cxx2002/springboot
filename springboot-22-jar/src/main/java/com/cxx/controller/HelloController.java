package com.cxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 陈喜喜
 * @date 2022-08-14 22:56
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView getHello() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("data","springboot打包文件为jar");
        mv.setViewName("main");
        return mv;
    }
}

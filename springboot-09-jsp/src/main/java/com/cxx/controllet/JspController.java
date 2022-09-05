package com.cxx.controllet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 陈喜喜
 * @date 2022-08-03 22:37
 */
@Controller
public class JspController {
    /**
       public String doJsp(HttpServletRequest req){
        req.setAttribute("date","SpringBoot使用Jsp");
        //视图逻辑名称
        return "index";
    }
     */
    @RequestMapping("/myJsp")
    public String doJsp(Model model){
        model.addAttribute("date","SpringBoot使用Jsp");
        //req.setAttribute("date","SpringBoot使用Jsp")
        //ModelAndView，Model的作用与是Request
        return "index";//在application.properties配置了视图解析器和端口号等等
    }
}

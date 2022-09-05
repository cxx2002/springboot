package com.cxx.controller;

import com.cxx.pojo.SchoolInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 陈喜喜
 * @date 2022-08-03 21:27
 * @Value("${}") 可以拿到外部文件的数据
 */
@Controller
public class HelloController {

    @Value("${server.port}")
    private Integer port;
    @Value("${server.servlet.context-path}")
    private String contextPath;
    @Value("${site}")
    private String site;
    @Value("${school.name}")
    private String name;
    @Value("${school.address}")
    private String address;
    @Value("${school.website}")
    private String website;

    @Resource  //@autowired也可以
    private SchoolInfo info;

    @RequestMapping("/date")
    @ResponseBody
    public String date(){
        System.out.println("name: " + name + " address:"+address+" website:"+website);
        System.out.println("port:"+port+"contextPath:"+contextPath +"site:"+site);
        System.out.println(info);
        return "name: " + name + " address:"+address+" website:"+website+"port:"+port+"contextPath:"+contextPath +"site:"+site
                +"\n"+info.toString();
    }
}

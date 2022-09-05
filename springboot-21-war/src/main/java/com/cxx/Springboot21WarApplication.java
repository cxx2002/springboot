package com.cxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author 陈喜喜
 * SpringBootServletInitializer:继承这个类，才能使用独立tomcat服务器
 */
@SpringBootApplication
public class Springboot21WarApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Springboot21WarApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Springboot21WarApplication.class);
    }
}

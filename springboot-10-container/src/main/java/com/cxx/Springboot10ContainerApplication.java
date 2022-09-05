package com.cxx;

import com.cxx.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springboot10ContainerApplication {

    public static void main(String[] args) {

        //获取容器对象
        //ConfigurableApplicationContext ctx = SpringApplication.run(Springboot10ContainerApplication.class, args)
        ApplicationContext ctx2 = SpringApplication.run(Springboot10ContainerApplication.class, args);

        //从容器中获取对象
        UserService userService = (UserService) ctx2.getBean("userService");

        userService.sayHello("张三");
    }

}

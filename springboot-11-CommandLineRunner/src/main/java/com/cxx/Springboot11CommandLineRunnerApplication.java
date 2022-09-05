package com.cxx;

import com.cxx.service.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class Springboot11CommandLineRunnerApplication implements CommandLineRunner {

    @Resource
    HelloService helloService;

    public static void main(String[] args) {
        System.out.println("准备创建容器");
        SpringApplication.run(Springboot11CommandLineRunnerApplication.class, args);
        System.out.println("容器创建完成");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("容器创建好后，自动执行的实现CommandLineRunner接口重写的run方法");
        String s = helloService.sayHello("李四");
        System.out.println("可以调用容器中的对象   "+s);

    }
}

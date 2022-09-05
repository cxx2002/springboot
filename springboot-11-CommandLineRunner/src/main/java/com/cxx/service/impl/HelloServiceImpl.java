package com.cxx.service.impl;

import com.cxx.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author 陈喜喜
 * @date 2022-08-04 12:20
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("sayHello()方法执行。。 " + name);
        return "hello " + name;
    }
}

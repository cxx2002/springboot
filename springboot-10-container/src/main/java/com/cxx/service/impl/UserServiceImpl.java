package com.cxx.service.impl;

import com.cxx.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author 陈喜喜
 * @date 2022-08-04 11:57
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name) {
        System.out.println("执行了业务方法sayHello()："+name);
    }
}

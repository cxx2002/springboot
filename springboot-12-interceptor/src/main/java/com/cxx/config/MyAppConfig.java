package com.cxx.config;

import com.cxx.web.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author 陈喜喜
 * @date 2022-08-04 16:02
 * 需要实现WebMvcConfigurer接口
 */
@Configuration
public class MyAppConfig implements WebMvcConfigurer {

    @Resource
    LoginInterceptor loginInterceptor;

    //添加拦截器对象，注册到容器中
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //指定需要拦截的url地址
        String[] path = {"/user/**"};
        //指定不需要拦截的的url地址
        String[] excludePath = {"/user/login"};

        registry.addInterceptor(loginInterceptor)
                .addPathPatterns(path)
                .excludePathPatterns(excludePath);
    }
}

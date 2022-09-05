package com.cxx.config;

import com.cxx.web.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * @author 陈喜喜
 * @date 2022-08-04 17:35
 */
@Configuration
public class WebSystemConfig {
    //注册Servlet
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean registration =
                new ServletRegistrationBean(new MyServlet(),"/myServlet");
        return registration;
    }
    //注册springboot自带的字符集过滤器
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new CharacterEncodingFilter("utf-8",true));
        registration.addUrlPatterns("/*");
        registration.setOrder(1);
        return registration;
    }
}

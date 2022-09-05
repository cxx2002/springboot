package com.cxx.config;

import com.cxx.web.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 陈喜喜
 * @date 2022-08-04 17:20
 */
@Configuration
public class WebApplicationConfig {
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){

        FilterRegistrationBean registrationBean = new FilterRegistrationBean();

        registrationBean.setFilter(new MyFilter());

        registrationBean.addUrlPatterns("/user/*");

        registrationBean.setOrder(1);

        return registrationBean;
    }
}

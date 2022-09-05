package com.cxx.config;

import com.cxx.web.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 陈喜喜
 * @date 2022-08-04 16:53
 */
@Configuration
public class WebApplicationConfig {
    //定义方法,注册Servlet对象
    @Bean
    public ServletRegistrationBean getServletRegistrationBean() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet(), "/myServlet");
        ServletRegistrationBean bean2 = new ServletRegistrationBean();
        bean2.setServlet(new MyServlet());
        bean2.addUrlMappings("/myServlet","/myServlet2");
        return bean2;
    }
}

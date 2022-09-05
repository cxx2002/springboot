package com.cxx.web;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author 陈喜喜
 * @date 2022-08-04 17:13
 * 自定义的过滤器类
 */
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行了MyFilter,doFilter()");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}

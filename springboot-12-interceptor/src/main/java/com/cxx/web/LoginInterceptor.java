package com.cxx.web;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 陈喜喜
 * @date 2022-08-04 15:58
 * 自定义的拦截器
 * 需要实现HandlerInterceptor接口
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    /**
     *
     * @param request
     * @param response
     * @param handler 被拦截控制器的对象
     * @return boolean
     *      ture:请求能被Controller处理
     *      false:请求被截断
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("执行了LoginInterceptor的preHandle");
        return false;
    }
}

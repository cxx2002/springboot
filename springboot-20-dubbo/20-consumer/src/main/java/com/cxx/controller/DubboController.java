package com.cxx.controller;

import com.cxx.pojo.Student;
import com.cxx.service.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈喜喜
 * @date 2022-08-14 16:31
 * 引用远程服务，把创建好的代理对象，注入给studentService
 * @DubboReference(interfaceClass = StudentService.class,version = "1.0")
 * 不加interfaceClass = StudentService.class，就是默认自己写的类型private StudentService studentService；
 */
@RestController
public class DubboController {

    @DubboReference(interfaceClass = StudentService.class,version = "1.0")
    private StudentService studentService;

    @GetMapping("/query")
    public String queryStudent(Integer id) {
        Student student = studentService.queryStudent(1001);
        return "调用远程接口，获取对象"+student;
    }
}

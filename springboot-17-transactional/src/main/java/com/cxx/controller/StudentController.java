package com.cxx.controller;

import com.cxx.pojo.Student;
import com.cxx.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 陈喜喜
 * @date 2022-08-05 14:51
 */
@Controller
public class StudentController {

    @Resource
    StudentService service;

    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStudent(String name, Integer age){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        int rows = service.addStudent(student);
        return student.toString();
    }
}

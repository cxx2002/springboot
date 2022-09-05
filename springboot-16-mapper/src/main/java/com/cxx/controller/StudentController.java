package com.cxx.controller;

import com.cxx.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 陈喜喜
 * @date 2022-08-04 18:30
 */
@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/student/query")
    @ResponseBody
    public String queryStudent(Integer id) {
        return studentService.queryStudent(id).toString();
    }
}

package com.cxx.service.impl;

import com.cxx.pojo.Student;
import com.cxx.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author 陈喜喜
 * @date 2022-08-14 16:06
 * 使用dubbo中的注解暴露服务
 * 不加interfaceClass = StudentService.class,就是默认implements StudentService的类型
 */
@DubboService(version = "1.0",timeout = 5000)
public class StudentServiceImpl implements StudentService {
    @Override
    public Student queryStudent(Integer id) {
        return new Student(id,"张三",20);
    }
}

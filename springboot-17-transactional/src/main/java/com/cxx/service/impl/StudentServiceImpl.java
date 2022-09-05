package com.cxx.service.impl;

import com.cxx.dao.StudentMapper;
import com.cxx.pojo.Student;
import com.cxx.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author 陈喜喜
 * @date 2022-08-05 14:38
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentMapper studentDao;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int addStudent(Student student) {
        System.out.println("业务方法addStudent");
        int rows = studentDao.insert(student);
        System.out.println("执行sql语句");
        //制造一个运行时的异常
        //System.out.println(1/0)
        return rows;
    }
}

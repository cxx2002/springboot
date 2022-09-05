package com.cxx.service.impl;

import com.cxx.dao.StudentDao;
import com.cxx.pojo.Student;
import com.cxx.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 陈喜喜
 * @date 2022-08-04 18:29
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public Student queryStudent(Integer id) {
        return studentDao.selectById(id);
    }
}

package com.cxx.dao;

import com.cxx.pojo.Student;
import org.apache.ibatis.annotations.Param;

/**
 * @author 陈喜喜
 * @date 2022-08-04 18:20
 * @Mapper 是告诉MyBatis这是dao接口,创建此接口的代理对象
 * 这里可以直接在主启动类写@MapperScan
 */
//@Mapper
public interface StudentDao {
    Student selectById(@Param("stuId") Integer id);
}

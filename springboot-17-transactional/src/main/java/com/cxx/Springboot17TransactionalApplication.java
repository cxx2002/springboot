package com.cxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement  //表示启用事务管理器
@MapperScan(basePackages = "com.cxx.dao")
public class Springboot17TransactionalApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot17TransactionalApplication.class, args);
    }

}

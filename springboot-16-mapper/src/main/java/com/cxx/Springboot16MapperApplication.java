package com.cxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.cxx.dao","com.cxx.mapper"})
public class Springboot16MapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot16MapperApplication.class, args);
	}

}

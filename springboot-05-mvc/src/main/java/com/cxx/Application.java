package com.cxx;

import com.cxx.pojo.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author 陈喜喜
 * @Date 2022-08-03 16:24
 *
 * @SpringBootApplication
 * 是复合注解，由以下三个注解复合而成
 * @SpringBootConfiguration
 * @EnableAutoConfiguration
 * @ComponentScan
 *
 * 1.说明:使用了@SpringBootConfiguration注解标注的类,可以作为配置文件使用的，
 * 类似于spring的xml配置文件来使用，可以使用@Bean声明对象，注入到容器
 *
 * 2.@EnableAutoConfiguration
 * 启用自动配置，把java对象配置好,注入到spring容器中
 * 例如:可以把mybatis的对象创建好,放入到容器中
 *
 * 3.@ComponentScan
 * 组件扫描器，扫描的是包，用于找到注解,根据注解的功能创建对象，给属性赋值等等。
 * 默认扫描的包: @ComponentScan所在的类所在的包和子包。
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    //说明对象,并注入到容器
    @Bean
    public Student getStudent(){
        Student student = new Student();
        student.setAge(20);
        student.setName("张三");
        System.out.println(student);
        return student;
    }

}

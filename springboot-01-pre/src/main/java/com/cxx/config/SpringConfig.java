package com.cxx.config;

import com.cxx.pojo.Student;
import org.springframework.context.annotation.*;

/**
 * @author 陈喜喜
 * @date 2022-08-03 11:02
 *
 * @Configuration  表示当前类作为配置文件使用的，相当于spring的xml配置文件(beans.xml){放在类的上面}
 * @bean : 把对象注入到spring容器中。作用相当于<bean>{放在方法的上面}
 * @ImportResource(value/locations = "classpath:beans.xml")  表示把xml的配置也放到这个类上{放在类的上面}
 *
 * @ImportResource(value = "classpath:beans.xml")
 * @PropertySource(value = "classpath:config_tiger.properties")
 * @ComponentScan(basePackages = "com.cxx.pojo")
 * 上面三个注解相当于下面三个xml的标签，因为使用了@configuration
 * <import resource="classpath:beans.xmL" />
 * <context : property-placeholder Location= " classpath: config_tiger.properties" />
 * <context : component- scan base- package="com. cxx.pojo" />
 */
@Configuration  //表示当前类作为配置文件使用的，相当于spring的xml配置文件(beans.xml)
@ImportResource(value = "classpath:beans.xml")  //指定多个文件夹{value={"classpath:beans.xml","。。.xml"}}
@PropertySource(value = "classpath:config_tiger.properties")
@ComponentScan(basePackages = "com.cxx.pojo")
public class SpringConfig {
    /**
     * 创建方法，方法的返回值是对象。在方法的上面加入@Bean
     * 方法的返回值对象就注入到容器中。
     *
     * @bean : 把对象注入到spring容器中。作用相当于<bean>
     * 说明 : 不指定对象的名称,默认是方法名是 id（即<bean id="creatStudent" class="com.cxx.pojo.Student">）
     */
    @Bean
    public Student createStudent(){
        Student student = new Student();
        student.setName("张三");
        student.setSex("男");
        student.setAge(29);
        return student;
    }
    /**
     * 指定对象在容器的名称
     * name属性就是指定的名称<bean id="liSiStudent"
     */
    @Bean(name = "liSiStudent")
    public Student createLiSiStudent(){
        Student student = new Student();
        student.setName("李四");
        student.setSex("男");
        student.setAge(18);
        return student;
    }
}

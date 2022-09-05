package com.cxx.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author 陈喜喜
 * @date 2022-08-05 16:42
 */
@RestController
public class MyRestController {
    /**
     * @PathVariable (路径变量) ： 获取url的数据
     *                  属性： value： 路径变量名
     *                  位置： 放在控制器方法的形参前面
     * http://localhost:8080/myboot/student/1002
     * {stuId}： 定义路径变量，stuId自定义名称
     */
    @GetMapping("/student/{stuId}")
    public String student(@PathVariable("stuId") String stuId) {
        return "查询学生的studentId="+stuId;
    }
    /**
     * 创建资源： Post请求
     */
    @PostMapping("/student/{name}/{age}")
    public String create(@PathVariable("name") String name, @PathVariable("age") Integer age){
        return "创建资源  "+name+" "+age;
    }
    /**
     * 更新资源： Put请求   ****路径变量名和形参名一致时，@PathVariable()里的value值可以省略****
     */
    @PutMapping("/student/{id}/{age}")
    public String update(@PathVariable() Integer id, @PathVariable() Integer age){
        return "更新资源  "+id+" "+age;
    }
    /**
     * 删除资源
     */
    @DeleteMapping("/student/{stuId}")
    public String delete(@PathVariable() Integer stuId){
        return "删除资源  "+stuId;
    }

}

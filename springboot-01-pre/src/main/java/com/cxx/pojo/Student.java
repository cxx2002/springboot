package com.cxx.pojo;

/**
 * @author 陈喜喜
 * @date 2022-08-03 10:55
 */
public class Student {
    private String sex;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(String sex, String name, Integer age) {
        this.sex = sex;
        this.name = name;
        this.age = age;
    }
}

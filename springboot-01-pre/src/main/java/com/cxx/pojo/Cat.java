package com.cxx.pojo;

/**
 * @author 陈喜喜
 * @date 2022-08-03 11:21
 */
public class Cat {
    private String catID;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Cat{" +
                "catID='" + catID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getCatID() {
        return catID;
    }

    public void setCatID(String catID) {
        this.catID = catID;
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

    public Cat(String catID, String name, Integer age) {
        this.catID = catID;
        this.name = name;
        this.age = age;
    }

    public Cat() {
    }
}

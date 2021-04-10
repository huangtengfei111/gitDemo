package com.example.demo.entity;

/**
 * @Description: java类作用描述
 * @Author: huangtf
 * @CreateDate: 2021/2/15 16:21
 */
public class User {

    private String name;
    private Integer age;

    public static void main(String[] args) {
        User user1 = User.getInstance();
        User user2 = User.getInstance();
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
    }

    private static volatile User singtonUser;

    private User() {
    }

    public static User getInstance() {
        if (singtonUser == null) {
            synchronized (User.class) {
                if (singtonUser == null) {
                    singtonUser = new User();
                }
            }
        }
        return singtonUser;
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

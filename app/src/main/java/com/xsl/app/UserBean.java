package com.xsl.app;

import java.io.Serializable;

public class UserBean implements Serializable {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public UserBean setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public UserBean setAge(int age) {
        this.age = age;
        return this;
    }

}

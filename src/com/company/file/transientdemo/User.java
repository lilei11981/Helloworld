package com.company.file.transientdemo;

import java.io.Serializable;

/**
 * @author lilei
 * @date 2020-06-14 15:55
 * @apiNote
 */

public class User implements Serializable {
    private transient int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

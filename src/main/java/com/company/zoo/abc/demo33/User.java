package com.company.zoo.abc.demo33;

import java.io.Serializable;

/**
 * @author lilei
 * @date 2021/5/17 9:13 下午
 * @apiNote
 */

public class User implements Serializable {

    private String name;
    private Integer id;

    public User() {
    }

    public User(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

package com.company.zoo.abc.demo05;

import java.util.Objects;

/**
 * @author lilei
 * @date 2020-06-28 15:30
 * @apiNote
 */

public class User {

    private String name;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(this.getName(), user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

package com.company.zoo.abc.demo03;

/**
 * @author lilei
 * @date 2020-06-28 14:02
 * @apiNote
 */

public class Parent {

    private String name;
    private int age;

    public Parent() {
        System.out.println("父类");
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void method() {
        System.out.println("父类");
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

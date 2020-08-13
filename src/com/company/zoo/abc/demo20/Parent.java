package com.company.zoo.abc.demo20;

/**
 * @author lilei
 * @date 2020-08-13 13:48
 * @apiNote
 */

public class Parent {
    private String name;

    protected static void method1() {
        System.out.println("方法1");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void method() {
        System.out.println("父类方法");
    }


}

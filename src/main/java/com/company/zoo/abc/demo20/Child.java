package com.company.zoo.abc.demo20;

/**
 * @author lilei
 * @date 2020-08-13 13:48
 * @apiNote
 */

public class Child extends Parent {
    private String name;

    public static void main(String[] args) {
        method1();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void method() {
        System.out.println("子类方法");
    }

    public void method2() {
        Parent.method1();
    }
}

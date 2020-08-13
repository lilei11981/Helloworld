package com.company.zoo.abc.demo15;

/**
 * @author lilei
 * @date 2020-08-10 14:02
 * @apiNote
 */

public class Child extends Father {
    public Child() {

    }

    public static void main(String[] args) {
        Father child = new Child();
        child.method();
    }

    @Override
    public void method() {
        System.out.println("子类方法");
    }
}

package com.shrbank.test.anonymousInternalClass;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2017-12-01
 * Time: 下午5:04
 * Description:
 * 匿名内部类的基本实现
 */

public class Demo2 {
    public static void main(String[] args) {
        Person2 person = new Person2() {
            @Override
            public void eat() {
                System.out.println("eat something2");
            }
        };
        person.eat();
    }
}

abstract class Person2 {
    public abstract void eat();
}

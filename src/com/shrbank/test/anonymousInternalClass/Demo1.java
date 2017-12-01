package com.shrbank.test.anonymousInternalClass;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2017-12-01
 * Time: 下午5:00
 * Description:
 * 不使用匿名内部类来实现抽象方法
 */

public class Demo1 {
    public static void main(String[] args) {
        Person1 person = new Child();
        person.eat();
    }
}

abstract class Person1 {
    public abstract void eat();
}

class Child extends Person1 {
    @Override
    public void eat() {
        System.out.println("eat something1");
    }
}

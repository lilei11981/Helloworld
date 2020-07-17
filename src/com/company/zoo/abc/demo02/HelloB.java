package com.company.zoo.abc.demo02;

/**
 * @author lilei
 * @date 2020-05-27 17:52
 * @apiNote
 */

public class HelloB extends HelloA {
    static {
        System.out.println("static B");
    }

    {
        System.out.println("I’m B class");
    }

    public HelloB() {
        System.out.println("HelloB");
    }

    public static void main(String[] args) {
        HelloA helloA = new HelloB();
        HelloB helloB = new HelloB();
        helloA.methodOne();
        helloA.methodTwo();
        helloB.methodOne();
        helloB.methodTwo();

    }

    @Override
    public void methodOne() {
//        super.methodOne();
        System.out.print("C");
    }

//    @Override
//    public void methodTwo() {
////        super.methodTwo();
//        System.out.print("D");
//    }
}

class HelloA {
    static {
        System.out.println("static A");
    }

    {
        System.out.println("I’m A class");
    }

    public HelloA() {
        System.out.println("HelloA");
    }

    public void methodOne() {
        System.out.print("A");
        methodTwo();
    }

    public void methodTwo() {
        System.out.print("B");
    }
}

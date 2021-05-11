package com.company.zoo.abc.demo21;

/**
 * @author lilei
 * @date 2020-08-13 14:19
 * @apiNote
 */

public abstract class AbstractDemo implements InterfaceDemo, InterfaceDemo2 {

    private String a;

    public AbstractDemo() {
    }

    public AbstractDemo(String a) {
        System.out.println(a);
    }

    static void method4() {
        System.out.println("抽象类的静态方法");
    }

    @Override
    public void method() {
        System.out.println("实现method方法");
    }

    @Override
    public void method1() {
        System.out.println("抽象类重新实现公共默认方法");
    }

    public abstract void method2();

    void method3() {
        System.out.println("抽象类的普通方法");
    }

}

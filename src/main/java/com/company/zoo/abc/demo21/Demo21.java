package com.company.zoo.abc.demo21;

/**
 * @author lilei
 * @date 2020-08-13 14:20
 * @apiNote
 */

public class Demo21 extends AbstractDemo {

    public static void main(String[] args) {
        Demo21 demo21 = new Demo21();
        demo21.method();
        demo21.method1();
        demo21.method2();
        demo21.method3();
        AbstractDemo.method4();

        AbstractDemo abstractDemo = new AbstractDemo() {
            @Override
            public void method2() {
                System.out.println("重写");
            }
        };

        abstractDemo.method();

        InterfaceDemo demo = new InterfaceDemo() {
            @Override
            public void method() {
                System.out.println("重写");
            }
        };
        demo.method();

    }

    @Override
    public void method2() {
        System.out.println("实现抽象类抽象方法");
    }
}

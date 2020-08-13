package com.company.zoo.abc.demo21;

/**
 * @author lilei
 * @date 2020-08-13 14:12
 * @apiNote
 */

public interface InterfaceDemo {
    public static final int a = 1;

    static void method2() {

    }

    public void method();

    default void method1() {
        System.out.println("默认实现");
    }
}

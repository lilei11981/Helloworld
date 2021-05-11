package com.company.zoo.aab.test08;

/**
 * @author lilei
 * @date 2021-01-26 下午7:37
 * @apiNote
 */

public class Demo02 extends Demo01 {
    int a;

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        System.out.println(demo01.method(1));
    }

    @Override
    public void method() {
        System.out.println(2);
    }
}

package com.company.zoo.abc.demo02;

/**
 * @author lilei
 * @date 2020-05-27 14:36
 * @apiNote
 */

import java.util.Date;

public class SuperTest extends Date {
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        new SuperTest().test();
    }

    private void test() {
//        System.out.println(super.getClass().getName());
        System.out.println(super.getClass().getSuperclass());
    }
}

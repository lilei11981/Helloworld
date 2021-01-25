package com.company.zoo.aaa.demo;

import java.util.concurrent.locks.LockSupport;

/**
 * @author lilei
 * @date 2021-01-25 上午9:47
 * @apiNote
 */

public class Demo26 {

    static Thread t1, t2 = null;

    public static void main(String[] args) {
        char[] a = "ABCDEFG".toCharArray();
        char[] b = "1234567".toCharArray();

        t1 = new Thread(() -> {
            for (char c : a) {
                LockSupport.park();
                System.out.println(c);
                LockSupport.unpark(t2);
            }
        }, "t1");

        t2 = new Thread(() -> {
            for (char c : b) {
                System.out.println(c);
                LockSupport.unpark(t1);
                LockSupport.park();
            }
        }, "t2");

        t1.start();
        t2.start();
    }
}

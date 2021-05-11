package com.company.zoo.aaa.demo;

import java.util.concurrent.CountDownLatch;

/**
 * @author lilei
 * @date 2021-01-25 上午9:47
 * @apiNote
 */

public class Demo27 {
    public static void main(String[] args) {

        Object o = new Object();

        CountDownLatch countDownLatch = new CountDownLatch(1);

        char[] a = "ABCDEFG".toCharArray();
        char[] b = "1234567".toCharArray();


        new Thread(() -> {
            try {
                countDownLatch.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
            synchronized (o) {
                for (char c : a) {
                    System.out.println(c);
                    try {
                        o.notify();
                        o.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                o.notify();
            }
        }, "t1").start();


        new Thread(() -> {
            countDownLatch.countDown();
            synchronized (o) {
                for (char c : b) {
                    System.out.println(c);
                    try {
                        o.notify();
                        o.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                o.notify();
            }
        }, "t2").start();


    }
}

package com.company.zoo.aab.test07;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilei
 * @date 2021-01-23 下午4:05
 * @apiNote
 */

public class Demo01 {

    static final Object o = new Object();

    volatile List<Object> list = new ArrayList<>();

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "启动");
            synchronized (o) {
                for (int i = 1; i < 10; i++) {
                    try {
                        demo01.add(new Object());
                        System.out.println(i);
                        if (demo01.size() == 5) {
                            o.notify();
                            o.wait();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "t1").start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "启动");
            synchronized (o) {
                if (demo01.size() != 5) {
                    try {
                        o.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                o.notify();
            }
            System.out.println(Thread.currentThread().getName() + "线程结束");
        }, "t2").start();

    }

    public void add(Object object) {
        list.add(object);
    }

    public int size() {
        return list.size();
    }
}

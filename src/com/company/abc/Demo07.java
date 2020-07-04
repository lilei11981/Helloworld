package com.company.abc;

/**
 * @author lilei
 * @date 2020-07-04 12:08
 * @apiNote
 */

public class Demo07 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " 新线程创建");
            }
        }).start();

        System.out.println("=========================");


        new Thread(() -> System.out.println(Thread.currentThread().getName() + " 新线程创建")).start();
    }
}

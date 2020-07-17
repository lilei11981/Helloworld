package com.company.zoo.multithread.demo01;

/**
 * @author lilei
 * @date 2020-06-28 16:30
 * @apiNote
 */

public class Demo01 {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
            }
        }).start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
            }
        }.start();
    }

    public static void printArray() {
        System.out.println("[A,B,C]");
    }


}

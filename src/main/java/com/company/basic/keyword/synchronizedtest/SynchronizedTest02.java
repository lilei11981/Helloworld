package com.company.basic.keyword.synchronizedtest;

/**
 * @author lilei
 * @date 2021-02-07 下午5:54
 * @apiNote
 */

public class SynchronizedTest02 {

    private static int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                synchronized (SynchronizedTest02.class) {
                    for (int j = 0; j < 10000; j++) {
                        count++;
                    }
                }
            }).start();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("result: " + count);
    }


}

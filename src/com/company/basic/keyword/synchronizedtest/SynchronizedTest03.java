package com.company.basic.keyword.synchronizedtest;

/**
 * @author lilei
 * @date 2021-02-07 下午6:08
 * @apiNote
 */

public class SynchronizedTest03 implements Runnable {
    private static int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new SynchronizedTest03());
            thread.start();
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("result: " + count);
    }

    @Override
    public void run() {
        synchronized (SynchronizedTest03.class) {
            for (int i = 0; i < 1000000; i++) {
                count++;
            }
        }
    }
}

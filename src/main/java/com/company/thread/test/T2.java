package com.company.thread.test;

/**
 * @author lilei
 * @date 2021-08-22 下午10:09
 * @apiNote
 */

public class T2 implements Runnable {

    private int count = 10;

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            T2 t2 = new T2();
            new Thread(t2, "THREAD" + i).start();
        }
    }

    @Override
    public synchronized void run() {
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }

}

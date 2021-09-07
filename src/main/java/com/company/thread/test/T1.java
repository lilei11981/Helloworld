package com.company.thread.test;

/**
 * @author lilei
 * @date 2021-08-22 下午10:08
 * @apiNote
 */

public class T1 implements Runnable {

    private int count = 10000;

    public static void main(String[] args) {
        T1 t1 = new T1();
        for (int i = 0; i < 10000; i++) {
            new Thread(t1, "THREAD" + i).start();
        }
    }

    @Override
    public void run() {
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }

}

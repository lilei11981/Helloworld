package com.company.zoo.multithread.extendthread;

/**
 * @author lilei
 * @date 2020-05-31 11:26
 * @apiNote
 */

public class ThreadTest extends Thread {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ThreadTest threadTest = new ThreadTest();
            threadTest.setName("线程" + i);
            threadTest.start();
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}

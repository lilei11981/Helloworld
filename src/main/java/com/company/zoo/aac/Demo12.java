package com.company.zoo.aac;

/**
 * @author lilei
 * @date 2021-10-10 上午11:19
 * @apiNote
 */

public class Demo12 {
    public volatile int inc = 0;

    public static void main(String[] args) throws InterruptedException {
        final Demo12 test = new Demo12();
        for (int i = 0; i < 10; i++) {
            new Thread() {
                public void run() {
                    for (int j = 0; j < 1000; j++)
                        test.increase();
                }

                ;
            }.start();
        }
        while (Thread.activeCount() > 1) //保证前面的线程都执行完 Thread.yield(); {
            Thread.sleep(1000);
        System.out.println(test.inc);
    }

    public synchronized void increase() {
        inc++;
    }
}

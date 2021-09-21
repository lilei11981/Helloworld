package com.company.zoo.aaa.demo03;

/**
 * @author lilei
 * @date 2021-09-19 上午10:39
 * @apiNote
 */

public class Demo05 {
    volatile boolean shutdownRequested;

    public static void main(String[] args) {
        Demo05 demo05 = new Demo05();
        // 开启一个线程，5ms后调用shutdown
        new Thread(() -> {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            demo05.shutdown();
        }).start();
        // 主线程doWork
        demo05.doWork();
    }

    public void shutdown() {
        shutdownRequested = true;
    }

    public void doWork() {
        int i = 1;
        while (!shutdownRequested) {
            System.out.println(i++);
        }
    }
}

package com.company.thread.multithread.synchronizedmethod;

/**
 * @author lilei
 * @date 2020-07-03 13:24
 * @apiNote
 */

public class Demo01 {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        Thread thread1 = new Thread(runnable);
        thread1.setName("售票员1");
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.setName("售票员2");
        thread2.start();
        Thread thread3 = new Thread(runnable);
        thread3.setName("售票员3");
        thread3.start();
    }
}

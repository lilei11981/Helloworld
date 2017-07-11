package com.shrbank.thread;

/**
 * Created by lilei on 2017/7/11.
 * 通过继承Thread类并使用currentThread.getName()方法来检测线程的状态
 */
class MyThread extends Thread {
    boolean waiting = true;
    boolean ready = false;
    MyThread() {

    }

    public void run() {
        String thrdName = Thread.currentThread().getName();
        System.out.println(thrdName + " starting.");
        while (waiting) {
            System.out.println("waiting: " + waiting);
        }
        System.out.println("waiting");
        start();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + "terminating.");
    }

    synchronized void startWait() {
        try {
            while (!ready) wait();
        } catch (InterruptedException exc) {
            System.out.println("wait() interrupted");
        }
    }

    synchronized void notice() {
        ready = true;
        notify();
    }
}
public class TreadStatus {
    public static void main(String[] args) throws Exception {
        MyThread thrd = new MyThread();  // 实例化MyThread对象
        thrd.setName("MyThread #1");     // 设置线程的名称
        showThreadStatus(thrd);          // 调用showThreadStatus()方法
        thrd.start();                    // 进程开始
        Thread.sleep(1);           // 进程休眠
        showThreadStatus(thrd);          // 调用showThreadStatus()方法
        thrd.waiting = false;            // 设置线程的waiting值为false
        Thread.sleep(1);
        showThreadStatus(thrd);
        thrd.notice();                   // 调用线程的notice方法
        Thread.sleep(1);
        showThreadStatus(thrd);
        while (thrd.isAlive()) {          // 判定线程的存活状态
            System.out.println("alive");
        }
        showThreadStatus(thrd);
    }

    static void showThreadStatus(Thread thrd) {
        System.out.println(thrd.getName() + " Alive: = " + thrd.isAlive() + " State: = " +thrd.getState());
    }
}

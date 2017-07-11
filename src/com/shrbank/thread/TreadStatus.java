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
        MyThread thrd = new MyThread();
        thrd.setName("MyThread #1");
        showThreadStatus(thrd);
        thrd.start();
        Thread.sleep(1);
        showThreadStatus(thrd);
        thrd.waiting = false;
        Thread.sleep(1);
        showThreadStatus(thrd);
        thrd.notice();
        Thread.sleep(1);
        showThreadStatus(thrd);
        while (thrd.isAlive()) {
            System.out.println("alive");
        }
        showThreadStatus(thrd);
    }

    static void showThreadStatus(Thread thrd) {
        System.out.println(thrd.getName() + " Alive: = " + thrd.isAlive() + " State: = " +thrd.getState());
    }
}

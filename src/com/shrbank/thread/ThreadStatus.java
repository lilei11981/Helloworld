package com.shrbank.thread;

/**
 * Created by lilei on 2017/7/16.
 * 状态监测
 * 通过继承Thread类并使用currentThread.getName()方法来监测线程的状态
 */

class CurrentTread extends Thread {
    boolean waiting = true;
    boolean ready = false;
    CurrentTread() {

    }

    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting.");
        while (waiting) {
            System.out.println("waiting: " + waiting);
        }
        System.out.println("waiting...");
        startWait();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " terminating.");
    }

    synchronized void startWait() {
        try {
            while (!ready) wait();
        } catch (Exception e) {
            System.out.println("wait() interrupted");
        }
    }

    synchronized void notice() {
        ready = true;
        notify();
    }
}
public class ThreadStatus {
    public static void main(String[] args) throws Exception {
        CurrentTread thread = new CurrentTread();
        thread.setName("CurrentThread #1");
        showThreadStatus(thread);
        thread.start();
        Thread.sleep(50);
        showThreadStatus(thread);
        thread.waiting = false;
        Thread.sleep(50);
        showThreadStatus(thread);
        thread.notice();
        Thread.sleep(50);
        showThreadStatus(thread);
        while (thread.isAlive()) {
            System.out.println("alive");
        }
        showThreadStatus(thread);
    }
    static void showThreadStatus(Thread thread) {
        System.out.println(thread.getName() + "Alive: = " + thread.isAlive() + "State: = " + thread.getState());
    }
}

package com.shrbank.thread;

/**
 * Created by lilei on 2017/7/11.
 * 通过继承 Thread 类并使用 currentThread.getName() 方法来检测线程的状态
 */
class MyThread extends Thread {
    boolean waiting = true;
    private boolean ready = false;
    MyThread() {

    }

    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting.");
        while (waiting) {
            System.out.println("waiting: " + waiting);
        }
        System.out.println("waiting");

        try {
            Thread.sleep(1);
        } catch (Exception e) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " terminating.");
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
public class ThreadStatus {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();  // 实例化 MyThread 对象
        myThread.setName("MyThread #1");     // 设置线程的名称
        showThreadStatus(myThread);          // 调用 showThreadStatus() 方法
        myThread.start();                    // 进程开始
        Thread.sleep(1);           // 进程休眠
        showThreadStatus(myThread);          // 调用 showThreadStatus() 方法
        myThread.waiting = false;            // 设置线程的 waiting 值为 false
        Thread.sleep(1);
        showThreadStatus(myThread);
        myThread.notice();                   // 调用线程的 notice 方法
        Thread.sleep(1);
        showThreadStatus(myThread);
        while (myThread.isAlive()) {          // 判定线程的存活状态
            System.out.println("alive");
        }
        showThreadStatus(myThread);
    }

    private static void showThreadStatus(Thread thread) {
        System.out.println(thread.getName() + " Alive: = " + thread.isAlive() + " State: = " + thread.getState());
    }
}

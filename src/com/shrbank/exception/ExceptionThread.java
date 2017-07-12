package com.shrbank.exception;

/**
 * Created by lilei on 2017/7/12.
 * 多线程异常处理方法
 */

class MyThread extends Thread {
    public void run() {
        System.out.println("Throwing in " + "MyThread");
        throw new RuntimeException();
    }
}
public class ExceptionThread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Caught it" + e);
        }
        System.out.println("Exiting main");
    }
}

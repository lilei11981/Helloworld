package com.lilei1998.exception;

/**
 * Created by lilei on 2017/7/12.
 * 多线程异常处理方法
 */

class MyThread extends Thread {
    public void run() {
        System.out.println("抛出我的异常");
        throw new RuntimeException();
    }
}

public class ExceptionThread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("获得异常：" + e);
        }
        System.out.println("退出 main()");
    }
}

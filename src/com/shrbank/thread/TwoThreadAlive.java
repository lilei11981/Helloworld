package com.shrbank.thread;

/**
 * Created by lilei on 2017/7/11.
 * 通过继承Thread类并使用isAlive()方法来检测一个线程是否存活
 */
public class TwoThreadAlive extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            printMsg();
        }
    }

    private void printMsg() {
        Thread thread = Thread.currentThread();   // 实例化Thread对象
        String name = thread.getName();
        System.out.println("name = " + name);
    }

    public static void main(String[] args) {
        TwoThreadAlive tt = new TwoThreadAlive();   // 实例化TwoThreadAlive对象
        tt.setName("Thread");
        System.out.println("before start(), tt.isAlive() = " + tt.isAlive());
        tt.start();
        System.out.println("just after start(), tt.isAlive() = " + tt.isAlive());
        for (int i = 0; i < 10; i++) {
            tt.printMsg();
        }
        System.out.println("The end of main(), tt.isAlive() = " + tt.isAlive());
    }
}

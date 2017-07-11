package com.shrbank.thread;

/**
 * Created by lilei on 2017/7/11.
 * 通过继承Thread类并使用getName()方法来获取当前线程名称
 */
public class TwoThreadGetName extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            printMsg();
        }
    }

    public void printMsg() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name = " + name);
    }

    public static void main(String[] args) {
        TwoThreadGetName tt = new TwoThreadGetName();
        tt.start();
        for (int i = 0; i < 10; i++) {
            tt.printMsg();
        }
    }
}

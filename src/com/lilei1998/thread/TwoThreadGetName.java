package com.lilei1998.thread;

/**
 * Created by lilei on 2017/7/11.
 * 通过继承Thread类并使用getName()方法来获取当前线程名称
 */
public class TwoThreadGetName extends Thread {
    public static void main(String[] args) {
        TwoThreadGetName twoThreadGetName = new TwoThreadGetName();
        twoThreadGetName.start();
        for (int i = 0; i < 10; i++) {
            twoThreadGetName.printMsg();
        }
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            printMsg();
        }
    }

    private void printMsg() {
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        System.out.println("name = " + name);
    }
}

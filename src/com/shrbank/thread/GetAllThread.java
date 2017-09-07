package com.shrbank.thread;

/**
 * Created by lilei on 2017/9/7 上午11:28.
 */
public class GetAllThread extends Thread {
    public static void main(String[] args) {
        GetAllThread allThread = new GetAllThread();
        allThread.setName("thread");
        allThread.start();
        ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        int threadNum = currentGroup.activeCount();
        Thread[] listThread = new Thread[threadNum];
        currentGroup.enumerate(listThread);
        for (int i = 0; i < threadNum; i++) {
            System.out.println("线程号：" + i + " = " + listThread[i].getName());
        }
    }
}

package com.shrbank.thread;

/**
 * Created by lilei on 2017/7/16.
 * 线程优先级设置
 * 通过setPriority()方法来设置线程的优先级
 */
public class SimplePriorities extends Thread {
    private int countDown = 5;
    private volatile double data = 0;
    public SimplePriorities(int priority) {
        setPriority(priority);
        start();
    }

    public String toString() {
        return super.toString() + ": " + countDown;
    }

    public void run() {
        while (true) {
            for (int i = 1; i < 10000; i++) {
                data = data + (Math.PI + Math.E) / (double)i;
                System.out.println(this);
                if (--countDown == 0) {
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        new SimplePriorities(Thread.MAX_PRIORITY);
        for (int i = 0; i < 5; i++) {
            new SimplePriorities(Thread.MIN_PRIORITY);
        }
    }
}

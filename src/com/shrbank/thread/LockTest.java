package com.shrbank.thread;

import java.util.Date;

/**
 * Created by lilei on 2017/7/16.
 * 死锁及解决方法
 * 死锁是这样一种情形：多个线程同时被阻塞，它们中的一个或者全部都在等待某个资源被释放。由于线程被无限期地阻塞，因此程序不可能正常终止。
 * java死锁产生的四个必要条件：
 * 1. 互斥使用，即当资源被一个线程占用时，别的线程不能使用
 * 2. 不可抢占，资源请求者不能强制从资源占有者手中夺取资源，资源只能由资源占有者主动释放。
 * 3. 请求和保持，即当资源请求者在请求其他的资源的同时保持对原有资源的占有
 * 4. 循环等待，即存在一个等待队列：P1占有P2的资源，P2占有P3的资源，P3占有P1的资源，这样就形成了一个等待环路。
 * 当上述四个条件都成立的时候，便形成死锁。当然，死锁的情况下如果打破任何一个条件，便可让死锁消失。下面用java代码来模拟一下死锁的产生。
 * 解决死锁问题的方法是：一种是用synchronized，一种是用Lock显式锁实现。
 * 而如果不恰当的使用了锁，且出现同时要锁多个对象时，会出现死锁情况
 */
public class LockTest {
    static final String obj1 = "obj1";
    static final String obj2 = "obj2";

    public static void main(String[] args) {    // main()函数
        LockA lockA = new LockA();    //  实例化LockA对象
        new Thread(lockA).start();
        LockB lockB = new LockB();    //  实例化LockB对象
        new Thread(lockB).start();
    }
}

class LockA implements Runnable {      // 实现Runnable
    public void run() {
        try {
            System.out.println(new Date().toString() + " LockA 开始执行");
            while (true) {
                synchronized (LockTest.obj1) {
                    System.out.println(new Date().toString() + " LockA 锁住 obj1");
                    Thread.sleep(3000);     // 此处等待是给B能锁住机会
                    synchronized (LockTest.obj2) {
                        System.out.println(new Date().toString() + " LockA 锁住 obj2");
                        Thread.sleep(60 * 1000);   // 为测试，占有了就不放
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class LockB implements Runnable {
    public void run() {
        try {
            System.out.println(new Date().toString() + " LockB 开始执行");
            while (true) {
                synchronized (LockTest.obj2) {
                    System.out.println(new Date().toString() + "LockB 锁住obj2");
                    Thread.sleep(3000);     // 此处等待是给B能锁住机会
                    synchronized (LockTest.obj1) {
                        System.out.println(new Date().toString() + " LockA 锁住 obj1");
                        Thread.sleep(60 * 10000);  // 为测试，占用了就不放
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

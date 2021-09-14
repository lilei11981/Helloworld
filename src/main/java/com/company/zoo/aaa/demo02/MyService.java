package com.company.zoo.aaa.demo02;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lilei
 * @date 2021-09-11 下午11:37
 * @apiNote
 */

public class MyService {
    private Lock lock = new ReentrantLock();
    // 公平锁
    // Lock lock=new ReentrantLock(true);
    // 非公平锁
    // Lock lock=new ReentrantLock(false);
    // 创建 Condition
    private Condition condition = lock.newCondition();

    public static void main(String[] args) {
        MyService myService = new MyService();
        myService.testMethod();
    }

    public void testMethod() {
        // lock 加锁
        lock.lock();
        try {
            // 1：wait 方法等待：
            // System.out.println("开始 wait");
            // condition.await();
            // 通过创建 Condition 对象来使线程 wait，必须先执行 lock.lock 方法获得锁
            // 2：signal 方法唤醒
            // condition 对象的 signal 方法可以唤醒 wait 线程
            condition.signal();
            for (int i = 0; i < 5; i++) {
                System.out.println("ThreadName=" + Thread.currentThread().getName() + (" " + (i + 1)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

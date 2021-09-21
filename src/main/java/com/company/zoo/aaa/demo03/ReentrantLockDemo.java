package com.company.zoo.aaa.demo03;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lilei
 * @date 2021-09-19 下午5:58
 * @apiNote
 */

public class ReentrantLockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);
        new Thread(() -> {
            lock.lock();
            lock.lock();
            System.out.println(lock.toString());
            System.out.println("---" + lock.getHoldCount());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(lock.hasQueuedThreads());
            System.out.println(lock.getQueueLength());
            // System.out.println(lock.getQueuedThreads());
            try {
                Thread.sleep(10000);
                System.out.println(111111);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                lock.unlock();
            }
        }).start();

        new Thread(() -> {
            lock.lock();
            System.out.println(lock.toString());
            try {
                System.out.println(22222222);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }).start();


        new Thread(() -> {
            lock.lock();
            System.out.println(lock.toString());
            try {
                System.out.println(3333333);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }).start();

    }
}

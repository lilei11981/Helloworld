package com.company.zoo.aaa.demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lilei
 * @date 2021-08-23 下午11:39
 * @apiNote
 */

public class Demo34 {

    static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        m1();
    }

    static void m1() {
        try {
            m2();
            lock.lock();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    static void m2() throws Exception {
        throw new Exception("2");
    }
}

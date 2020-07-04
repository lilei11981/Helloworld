package com.company.thread.multithread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lilei
 * @date 2020-07-03 13:20
 * @apiNote
 */

public class RunnableImpl implements Runnable {
    private static int ticket = 100;

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                Thread.sleep(1000);
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "-->正在卖" + ticket + "张票");
                    ticket--;
                }
                if (ticket == 0) {
                    return;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            } finally {
                lock.unlock();
            }
        }
    }

}

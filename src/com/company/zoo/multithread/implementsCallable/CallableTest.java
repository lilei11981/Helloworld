package com.company.zoo.multithread.implementsCallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lilei
 * @date 2020-06-13 22:19
 * @apiNote
 */

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable callable = new TestCallable();
        FutureTask<String> task = new FutureTask<>(callable);
        Thread thread = new Thread(task);
        thread.setName("线程");
        thread.start();
        String a = task.get();
        System.out.println(a);
    }
}

class TestCallable implements Callable<String> {
    int sum = 0;

    private Lock lock = new ReentrantLock();


    @Override
    public String call() throws Exception {

        lock.lock();

        try {
            Thread.sleep(1000);
            for (int i = 0; i < 100; i++) {
                sum += i;
            }
        } finally {
            lock.unlock();
        }


        return Thread.currentThread().getName() + sum;
    }
}

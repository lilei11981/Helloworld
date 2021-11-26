package com.company.thread.multithread.multiways.threadlocal;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @date : 2021/11/26 17:27
 * 必须使用线程池才能模拟内存泄漏场景
 * 模拟ThreadLocal内存泄露导致OOM
 * JVM启动参数 -Xms100M -Xmx100M
 */
public class ThreadLocalMemoryLeak {

    static ThreadPoolExecutor executor = new ThreadPoolExecutor(
            101,
            101,
            1L,
            TimeUnit.SECONDS,
            new SynchronousQueue<>(),
            new ThreadPoolExecutor.CallerRunsPolicy());

    public static void main(String[] args) {
        // 加锁，让多个线程串行执行，避免多个线程同时占用内存导致的内存溢出问题
        final Object lockObj = new Object();
        // 循环向线程变量中设置数据 1024 * 1024 = 1M
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            executor.execute(() -> {
                synchronized (lockObj) {
                    ThreadLocal<BigObject> threadLocal = new ThreadLocal<>();
                    threadLocal.set(new BigObject());
                    threadLocal.remove();
                }
            });
        }
    }


    static class BigObject {
        byte[] bytes = new byte[1024 * 1024];
    }
}
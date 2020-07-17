package com.company.zoo.multithread.threadpoolexecute;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author lilei
 * @date 2020-06-10 23:26
 * @apiNote
 */

public class ThreadPoolExecutorDemo {
    private static final int CORE_POOL_SIZE = 1;
    private static final int MAX_POOL_SIZE = 10;
    private static final int QUEUE_CAPACITY = 5;
    private static final Long KEEP_ALIVE_TIME = 1L;

    private static final int COUNT = 100;

    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        // 使用阿里巴巴推荐的创建线程池的方式
        // 通过ThreadPoolExecutor构造函数自定义参数创建
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                KEEP_ALIVE_TIME,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(QUEUE_CAPACITY),
                new ThreadPoolExecutor.AbortPolicy());


        for (int i = 0; i < COUNT; i++) {
            //创建WorkerThread对象(WorkerThread类实现了Runnable 接口)
            Runnable worker = new MyRunnable();
            //执行Runnable
            executor.execute(worker);
        }
        executor.shutdown();
        while (true) {
            if (executor.isTerminated()) {
                Long end = System.currentTimeMillis();
                System.out.println("耗费时间: " + (end - start) + "ms");
                break;
            }
        }
    }
}

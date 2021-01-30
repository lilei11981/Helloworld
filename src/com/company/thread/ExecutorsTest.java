package com.company.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by lilei on 2017/11/16 下午5:32.
 * <p>
 * Java 线程： 线程池
 */
public class ExecutorsTest {
    public static void main(String[] args) {
        // 创建一个可重用固定线程数的线程池
//        ExecutorService pool = Executors.newFixedThreadPool(5);
//        ExecutorService pool = Executors.newFixedThreadPool(2);

        // 单任务线程池
//        ExecutorService pool = Executors.newSingleThreadExecutor();

        // 可变尺寸线程池
//        ExecutorService pool = Executors.newCachedThreadPool();

        // 创建一个线程池，它可安排在给定延迟后运行命令或者定期地执行。
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);

        // 创建线程
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread1();
        Thread t3 = new MyThread1();
        Thread t4 = new MyThread1();
        Thread t5 = new MyThread1();
        // 将线程放入池中进行执行
        pool.execute(t1);
//        pool.execute(t2);
//        pool.execute(t3);

        // 使用延迟执行风格的方法
        pool.schedule(t2, 1000, TimeUnit.MILLISECONDS);
        pool.schedule(t3, 10, TimeUnit.MILLISECONDS);

        pool.execute(t4);
        pool.execute(t5);
        // 关闭线程池
        pool.shutdown();
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在执行。。。");
    }
}

package com.company.zoo.aaa.demo02;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author lilei
 * @date 2021-09-11 下午10:29
 * @apiNote
 */

public class Demo {

    private static final int taskSize = 10;

    public static void main(String[] args) throws Exception {
        //创建一个线程池
        ExecutorService pool = Executors.newFixedThreadPool(taskSize);
        // 创建多个有返回值的任务
        List<Future<String>> list = new ArrayList<>();
        for (int i = 0; i < taskSize; i++) {
            Callable<String> c = new MyCallable(i + " ");
            // 执行任务并获取 Future 对象
            Future<String> f = pool.submit(c);
            list.add(f);
        }
        // 关闭线程池
        pool.shutdown();
        // 获取所有并发任务的运行结果
        for (Future<String> f : list) {
            // 从 Future 对象上获取任务的返回值，并输出到控制台
            System.out.println("res：" + f.get());
        }
    }

    public static class MyCallable implements Callable<String> {

        String string;

        public MyCallable(String string) {
            this.string = string;
        }

        @Override
        public String call() {
            return Thread.currentThread().getName() + " : " + string;
        }
    }
}

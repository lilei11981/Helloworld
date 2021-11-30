package com.company.utils.java.base.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService cachePool = Executors.newCachedThreadPool();
        Future<String> future = cachePool.submit(() -> {
            Thread.sleep(3000);
            return "异步任务计算结果";
        });
        // 提交完任务，主线程可以做一些其他事情
        doSomethingElse();

        // 为了获取异步计算结果，可以通过future.get()和长轮询来实现
        String result;

        // 会导致当前线程阻塞
//        result = future.get();

        // 会导致cpu负载高
        while (true) {
            if (future.isDone()) {
                break;
            }
        }
        result = future.get();
        System.out.println("result = " + result);
        cachePool.shutdown();
    }

    private static void doSomethingElse() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("最要事情已做完！！！");
    }
}

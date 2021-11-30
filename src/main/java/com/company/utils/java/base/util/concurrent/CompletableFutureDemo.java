package com.company.utils.java.base.util.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        test01();
//        test02();
//        test03();
//        test04();
//        test05();
//        test06();
//        test07();
        test08();
//        test09();
    }

    private static void test09() {

    }

    private static void test08() {
        long start = System.currentTimeMillis();
        CompletableFuture<String> futureA = CompletableFuture.supplyAsync(() -> {
            Sleep.sleep(1000);
            return "通过方式A获取商品a";
        });
        CompletableFuture<String> futureB = CompletableFuture.supplyAsync(() -> {
            Sleep.sleep(2000);
            return "通过方式B获取商品a";
        });
        CompletableFuture<String> futureC = futureA.applyToEither(futureB, product -> "结果:" + product);
        System.out.println(futureC.join()); //结果:通过方式A获取商品a
        System.out.println(System.currentTimeMillis() - start);
    }

    private static void test07() {
        long start = System.currentTimeMillis();
        CompletableFuture<String> futureA = CompletableFuture.supplyAsync(() -> {
            Sleep.sleep(1000);
            return "hello";
        });
        CompletableFuture<String> futureB = futureA.thenCompose(s -> CompletableFuture.supplyAsync(() -> {
            Sleep.sleep(2000);
            return s + "world";
        }));
        CompletableFuture<String> futureC = futureB.thenCompose(s -> CompletableFuture.supplyAsync(() -> {
            Sleep.sleep(3000);
            return s.toUpperCase();
        }));
        System.out.println(futureC.join());
        System.out.println(System.currentTimeMillis() - start);
    }

    private static void test06() {
        CompletableFuture<Double> futurePrice = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 100d;
        });
        CompletableFuture<Double> futureDiscount = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 0.8;
        });
        long s = System.currentTimeMillis();
        CompletableFuture<Double> futureResult = futurePrice.thenCombine(futureDiscount, (price, discount) -> price * discount);
        System.out.println("最终价格为:" + futureResult.join()); //最终价格为:80.0
        System.out.println(System.currentTimeMillis() - s);
    }

    private static void test05() {
        String[] strings = {"a", "b", "c"};
        List<CompletableFuture<String>> list = new ArrayList<>();
        for (String s : strings) {
            list.add(CompletableFuture.supplyAsync(() -> s)
                    .thenApply(String::toUpperCase));
        }
        CompletableFuture.allOf(list.toArray(new CompletableFuture[list.size()]))
                .thenApply(e -> list.stream().map(CompletableFuture::join));
    }

    private static void test04() {
        CompletableFuture.supplyAsync(() -> "Hello")
                .thenApply(s -> s + " World")
                .thenApply(String::toUpperCase)
                .thenCombine(CompletableFuture.completedFuture(" Java"), (s1, s2) -> s1 + s2)
                .thenAccept(System.out::println);
    }

    private static void test03() {
        CompletableFuture.supplyAsync(() -> "Hello")
                .thenApply(s -> s + " World")
                .thenApply(String::toUpperCase)
                .whenComplete((r, e) -> System.out.println(r));
    }

    private static void test02() {
        CompletableFuture.supplyAsync(() -> 1)
                .thenApply(integer -> integer + 1)
                .thenApply(integer -> integer * integer)
                .whenComplete((r, e) -> System.out.println(r));
    }

    private static void test01() throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFutureOne = new CompletableFuture<>();

        ExecutorService cachePool = Executors.newCachedThreadPool();
        cachePool.execute(() -> {
            try {
                Thread.sleep(3000);
                completableFutureOne.complete("异步任务执行结果");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // 提交完任务，主线程可以做一些其他事情
        doSomethingElse();

        CompletableFuture<String> completableFutureTwo = completableFutureOne.whenComplete((s, throwable) -> {
            System.out.println("s = " + s);
        });

        CompletableFuture<Integer> completableFutureThree = completableFutureTwo.thenApply((s) -> {
            System.out.println("开始新任务");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return s.length();
        });

        System.out.println("阻塞方式获取结果：" + completableFutureThree.get());

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

    public static class Sleep {
        public static void sleep(long value) {
            try {
                Thread.sleep(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

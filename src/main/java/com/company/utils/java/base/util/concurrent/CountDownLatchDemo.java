package com.company.utils.java.base.util.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        test1();
        //         test2();
    }

    private static void test2() {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for (int i = 0; i < 5; i++) {
            final int index = i;
            new Thread(() -> {
                try {
                    Thread.sleep(1000 + ThreadLocalRandom.current().nextInt(1000));
                    System.out.println("finish" + index + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown();
                }
            }).start();
        }

        try {
            countDownLatch.await();// 主线程在阻塞，当计数器==0，就唤醒主线程往下执行。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程:在所有任务运行完成后，进行结果汇总");
    }

    // 让多个线程等待：模拟并发，让并发线程一起执行
    // 为了模拟高并发，让一组线程在指定时刻(秒杀时间)执行抢购，这些线程在准备就绪后，
    // 进行等待(CountDownLatch.await())，直到秒杀时刻的到来，然后一拥而上；
    // 这也是本地测试接口并发的一个简易实现。
    private static void test1() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        for (int i = 0; i < 50; i++) {
            new Thread(() -> {
                try {
                    //准备完毕……运动员都阻塞在这，等待号令
                    countDownLatch.await();
                    String partner = "【" + Thread.currentThread().getName() + "】";
                    System.out.println(partner + "开始执行……");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        try {
            Thread.sleep(2000);// 裁判准备发令
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch.countDown();// 发令枪：执行发令
    }


}

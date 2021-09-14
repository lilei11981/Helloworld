package com.company.zoo.aaa.demo02;

import java.util.concurrent.CyclicBarrier;

/**
 * @author lilei
 * @date 2021-09-12 上午12:12
 * @apiNote
 */

public class Demo04 {
    public static void main(String[] args) {
        int N = 4;
        CyclicBarrier barrier = new CyclicBarrier(N);
        for (int i = 0; i < N; i++) {
            new Writer(barrier).start();
        }
    }

    static class Writer extends Thread {
        private CyclicBarrier cyclicBarrier;

        public Writer(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            try {
                // 以睡眠来模拟线程需要预定写入数据操作
                System.out.println("线程" + Thread.currentThread().getName() + "写入数据完毕，等待其他线程写入完毕");
                Thread.sleep(5000);
                cyclicBarrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("所有线程写入完毕，继续处理其他任务，比如数据操作");
        }
    }
}

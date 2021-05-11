package com.company.thread.juc;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lilei
 * @date 2020-08-23 17:26
 * @apiNote 使用原子变量解决
 * 1. volatile 保证内存可见性
 * 2. CAS (Compare-And-Swap) 保证数据的原子性
 * CAS 算法是硬件对于并发操作共享数据的问题
 * V: 内存值
 * A: 预估值
 * B: 更新值
 */

public class Demo05AtomicSolutionCAS {

    public static void main(String[] args) {
        AtomicDemo atomicDemo = new AtomicDemo();
        for (int i = 0; i < 10; i++) {
            new Thread(atomicDemo).start();
        }
    }

    static class AtomicDemo implements Runnable {

        private AtomicInteger num = new AtomicInteger();

        @Override
        public void run() {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(num.getAndIncrement());
        }
    }
}

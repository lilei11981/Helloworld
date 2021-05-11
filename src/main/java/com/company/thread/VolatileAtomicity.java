package com.company.thread;

/**
 * @author lilei
 * @date 2020-09-16 10:26
 * @apiNote
 */

public class VolatileAtomicity {
    public static volatile int number = 0;

    // private static volatile AtomicInteger integer = new AtomicInteger(0);

    public synchronized static void increase() {
        // 不能保证线程安全，自增操作不是原子性的
        number++;
        // integer.getAndIncrement();
    }

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    increase();
                }
            }).start();
        }

        // 当所有累加线程都结束
        while (Thread.activeCount() > 1) {
            Thread.yield();
        }

        System.out.println(number);
        // System.out.println(integer);
    }
}

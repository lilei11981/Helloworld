package com.company.thread.multithread.multiways.threadlocal;

/**
 * @date : 2021/11/25 9:52
 *
 */
public class ThreadLocalRemove {
    private static final ThreadLocal<Integer> NUM = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public static void main(String[] args) {

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        add();
                    } finally {
                        NUM.remove();
                    }
                }
            }).start();
        }
    }

    private static void add() {
        for (int i = 0; i < 5; i++) {
            Integer n = NUM.get();
            n++;
            NUM.set(n);
            System.out.println("当前线程：" + Thread.currentThread().getName() + "的【NUM】" + n);
        }
    }
}

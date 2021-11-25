package com.company.thread.multithread.multiways.threadlocal;

/**
 * @date : 2021/11/25 9:52
 *
 */
public class ThreadLocalNoRemove {
    private static final ThreadLocal<Integer[]> NUM = new ThreadLocal<Integer[]>() {
        @Override
        protected Integer[] initialValue() {
            return new Integer[1024 * 1024];
        }
    };

    public static void main(String[] args) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Integer[] integers = new Integer[1024 * 1024];
                    integers[0] = 1;
                    NUM.set(integers);
                }
            }).start();
        }
    }
}

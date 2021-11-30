package com.company.utils.java.base.util.concurrent;


public class ConcurrencyTest {

    // 累加次数
    private static final long count = 10000L;

    public static void main(String[] args) throws InterruptedException {
        concurrency();
        serial();
    }

    /**
     * 多线程累加
     *
     * @throws InterruptedException
     */
    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();

        // 启动新线程执行运行操作
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (int i = 0; i < count; i++) {
                    a += 5;
                }
            }
        });
        thread.start();

        int b = 0;
        for (int i = 0; i < count; i++) {
            b--;
        }
        // 等线程执行完
        thread.join();
        long end = System.currentTimeMillis() - start;
        System.out.println("concurrency 总共耗时" + end);
    }

    /**
     * 单线程累加
     */
    private static void serial() {
        long start = System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i < count; i++) {
            a += 5;
        }
        int b = 0;
        for (int i = 0; i < count; i++) {
            b--;
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("serial 总共耗时" + end);
    }
}


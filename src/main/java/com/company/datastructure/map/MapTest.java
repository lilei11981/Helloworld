package com.company.datastructure.map;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadFactory;

/**
 * @author lilei
 * @date 2021-05-31 下午8:55
 * @apiNote
 */

public class MapTest {


    // ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 100, 60000, TimeUnit.MILLISECONDS, 200, new MyThreadFactory(),new ThreadPoolExecutor.CallerRunsPolicy());

    static Map<Integer, Integer> map = new ConcurrentHashMap<>();

    static {
        for (int i = 0; i < 10; i++) {
            map.put(i, i);
        }
    }

    public static void main(String[] args) {
        test();
    }

    private static void test() {

        Random random = new Random();
        long s = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            int key = random.nextInt(10);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + ":" + map.get(key));
                }
            }).start();
        }
        long e = System.currentTimeMillis();
        System.out.println("用时：" + (e - s) / 1000 + " s");
    }

    void test02() {

    }

    static class MyThreadFactory implements ThreadFactory {

        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r);
        }
    }

    static class MyTask implements Runnable {

        int key;

        public MyTask(int key) {
            this.key = key;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ":" + map.get(key));
        }
    }
}

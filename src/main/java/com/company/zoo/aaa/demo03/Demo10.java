package com.company.zoo.aaa.demo03;

/**
 * @author lilei
 * @date 2021-09-21 下午3:05
 * @apiNote
 */

public class Demo10 {
    public static void main(String[] args) {
        // System.out.println(Long.MAX_VALUE);
        long s = System.currentTimeMillis();
        test1(); // 4301
        // test2(); // 3866
        long e = System.currentTimeMillis();
        System.out.println(e - s);
    }

    private static void test1() {
        for (long i = 0L; i < 9223372030L; i++) {
            long b = i / 64;
        }
    }

    private static void test2() {
        for (long i = 0L; i < 9223372030L; i++) {
            long b = i >> 6;
        }
    }
}

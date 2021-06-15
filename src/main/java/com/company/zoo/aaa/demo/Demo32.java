package com.company.zoo.aaa.demo;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lilei
 * @date 2021-06-14 下午3:12
 * @apiNote
 */

public class Demo32 {

    private static final int NUM = 10000000;

    public static void main(String[] args) {
        method01();
        System.out.println("--------------");
        method02();
    }

    private static void method01() {
        int[] a = new int[NUM];
        for (int i = 0; i < NUM; i++) {
            a[i] = i;
        }
        long s = System.nanoTime();
        int result = a[NUM / 2];
        System.out.println(result);
        long e = System.nanoTime();
        System.out.println(e - s);
    }

    private static void method02() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < NUM; i++) {
            list.add(i);
        }
        long s = System.nanoTime();
        System.out.println(list.get(NUM / 2));
        long e = System.nanoTime();
        System.out.println(e - s);
    }
}

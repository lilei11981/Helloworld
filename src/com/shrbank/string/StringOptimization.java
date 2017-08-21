package com.shrbank.string;

/**
 * Created by lilei on 2017/8/20 下午8:11.
 */

public class StringOptimization {
    public static void main(String[] args) {
        String variables[] = new String[50000];
        for (int i = 0; i < 50000; i++) {
            variables[i] = "s" + i;
        }

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            variables[i] = "hello";
        }

        long endTime1 = System.currentTimeMillis();
        System.out.println("直接使用字符串：" + (endTime1 - startTime1) + " ms");

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            variables[i] = new String("hello");
        }

        long endTime2 = System.currentTimeMillis();
        System.out.println("使用 new 关键字：" + (endTime2 - startTime2) + " ms");

        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            variables[i] = new String("hello");
            variables[i] = variables[i].intern();
        }

        long endTime3 = System.currentTimeMillis();
        System.out.println("使用字符串对象的 intern() 方法：" + (endTime3 - startTime3) + " ms");
    }
}

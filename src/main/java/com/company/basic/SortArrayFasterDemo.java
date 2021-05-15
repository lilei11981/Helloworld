package com.company.basic;

import java.util.Arrays;
import java.util.Random;

/**
 * @author lilei
 * @date 2021-02-09 上午11:35
 * @apiNote
 */

public class SortArrayFasterDemo {

    public static void main(String[] args) {
        // 声明数组
        int arraySize = 32768;
        int[] data = new int[arraySize];

        Random rnd = new Random(0);
        for (int c = 0; c < arraySize; ++c) {
            data[c] = rnd.nextInt() % 256;
        }

        /*11.997180618
sum = 155184200000*/

        // !!! 排序后，比没有排序要快
        Arrays.sort(data);

               /*4.154021495
sum = 155184200000*/

        // 测试
        long start = System.nanoTime();
        long sum = 0;

        for (int i = 0; i < 100000; ++i) {
            // 循环
            for (int c = 0; c < arraySize; ++c) {
                if (data[c] >= 128) {
                    sum += data[c];
                }
            }
        }

        System.out.println((System.nanoTime() - start) / 1000000000.0);
        System.out.println("sum = " + sum);
    }
}

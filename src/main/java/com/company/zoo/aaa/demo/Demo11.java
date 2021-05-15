package com.company.zoo.aaa.demo;

import java.util.Arrays;

/**
 * @author lilei
 * @date 2021-05-15 下午9:05
 * @apiNote 给你一个随机函数f，随机返回1~5中的一个数字，实现等概率返回1~7中的一个数字
 */

public class Demo11 {

    /*此函数只能用，不能修改，功能是等概率返回1~5*/
    public static int f() {
        return (int) (Math.random() * 5) + 1;
    }

    /*此函数时由f函数实现的，等概率返回0和1 */
    public static int a() {
        int result = 0;
        do {
            result = f();
        } while (result == 3);
        return result < 3 ? 0 : 1;
    }

    /*等概率返回0~6*/
    public static int b() {
        int result = 0;
        do {
            result = ((a() << 2) + (a() << 1) + a());
        } while (result == 7);
        return result;
    }

    /* 等概率返回1~7 */
    public static int c() {
        return b() + 1;
    }

    public static void main(String[] args) {
        int[] array = new int[8];
        for (int i = 0; i < 70000; i++) {
            // array[f()]++;
            // array[a()]++;
            // array[b()]++;
            array[c()]++;
        }
        System.out.println(Arrays.toString(array));
    }

}

package com.company.zoo.aaa.demo;

import java.util.Arrays;

/**
 * @author lilei
 * @date 2021-05-15 下午10:09
 * @apiNote 一个随机函数以p概率返回0， 以1-p概率返回1
 * 实现等概率返回0和1
 */

public class Demo12 {

    /*内部内容不可见*/
    public static int f() {
        return Math.random() < 0.999999 ? 0 : 1;
    }

    /*等概率返回0和1的函数实现*/
    public static int g() {
        int result = 0;
        do {
            result = f();
        } while (result == f());
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[2];
        for (int i = 0; i < 2000; i++) {
            array[g()]++;
        }
        System.out.println(Arrays.toString(array));
    }

}

package com.company.algorithm.hw;

/**
 * @author lilei
 * @date 2021/2/1 8:44 下午
 * @apiNote 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
 */

public class Test56 {


    public static int NumberOf1(int n) {
        int result = 0;
        while (n != 0) {
            ++result;
            n = n & (n - 1);
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(NumberOf1(-15));
    }
}

package com.company.datastructure.array.function;

/**
 * Created by lilei on 2017/7/21 下午3:54.
 * 一个正数的阶乘是所有小于及等于该数的正整数的积，并且有0的阶乘为1。自然数n的阶乘写作n!。
 * 亦即n! = 1 * 2 * 3 * … * n。
 * 阶乘也可以按递归方式定义：0！= 1，n! = (n-1)! * n。
 */

public class Factorial {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d! = %d\n", i, factorial(i));
        }
    }

    public static long factorial(long number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}

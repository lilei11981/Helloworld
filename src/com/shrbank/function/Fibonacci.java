package com.shrbank.function;

/**
 * Created by lilei on 2017/7/20 下午6:16.
 * 输出斐波那契数列
 * 从第三项开始，每一项等于前两项之和
 */
public class Fibonacci {
    private static long fibonacci(long number) {
        if ((number == 0) || (number == 1)) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 40; i++) {
            System.out.printf("Fibonacci of %d is: %d\n", i, fibonacci(i));
        }
    }
}

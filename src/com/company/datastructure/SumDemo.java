package com.company.datastructure;

/**
 * Created by lilei on 2017/7/11.
 * 使用do…while…结构求0~100的整数数字之和
 */
public class SumDemo {
    public static void main(String[] args) {
        long limit = 100000000;
        long sum = 0;
        long i = 0;
        do {
            sum = sum + i;
            i++;
        } while (i <= limit);
        System.out.println("Sum = " + sum);
    }
}

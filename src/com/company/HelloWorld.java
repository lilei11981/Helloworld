package com.company;

import java.math.BigDecimal;

/**
 * @date on 2017/6/10.
 * @author lilei
 * Hello World 输出
 */
public class HelloWorld {
    public static void main(String[] args) {
//        int max = max(1,2);
//        System.out.println(max);
        // System.out.printf("Hello World!");

//        float a = 0.1432f;
//        float b = 0.2f;
//        System.out.println(a + b);

//        float a = 1.0f - 0.9f;
//        float b = 0.9f - 0.8f;
//        System.out.println(a);// 0.100000024
//        System.out.println(b);// 0.099999964
//        System.out.println(a == b);// false

        BigDecimal a = new BigDecimal("1.0839183912938912");
        BigDecimal b = new BigDecimal("0.9389127389172983");
        BigDecimal c = new BigDecimal("0.878397189378917892378917892378912738971289378192731283898989080980912389102");
        BigDecimal x = a.subtract(b);// 0.1
        System.out.println(x);
        BigDecimal y = b.subtract(c);// 0.1
        System.out.println(y);
//        System.out.println(x.equals(y)); // true

//        BigDecimal a = new BigDecimal("1.0");
//        BigDecimal b = new BigDecimal("1.0");
//        System.out.println(a.compareTo(b));// 1
//
        BigDecimal m = new BigDecimal("1.255433");
        BigDecimal n = m.setScale(3, BigDecimal.ROUND_HALF_DOWN);
        System.out.println(n);// 1.255
    }
}

package com.company.abc.demo;

import java.math.BigDecimal;

/**
 * @author lilei
 * @date 2020-07-12 16:35
 * @apiNote
 */

public class Demo10 {

    private static long fibonacci(int count) {
        if ((count == 0) || (count == 1)) {
            return count;
        } else {
            return fibonacci(count - 1) + fibonacci(count - 2);
        }
    }

    private static BigDecimal getFib(BigDecimal count) {
        boolean x = (new BigDecimal(0).equals(count));
        boolean y = (new BigDecimal(1).equals(count));
        if (x || y) {
            return count;
        } else {
            BigDecimal a = count.subtract(new BigDecimal(1));
            BigDecimal b = count.subtract(new BigDecimal(2));
            return getFib(a).add(getFib(b));
        }
    }

    private static long getNum(int count) {
        int[] b = new int[count];
        b[0] = 1;
        b[1] = 1;
        for (int i = 2; i < count; i++) {
            b[i] = b[i - 1] + b[i - 2];
        }
        return b[count - 1];
    }

    private static BigDecimal getResult(int count) {
        BigDecimal[] decimals = new BigDecimal[count];
        decimals[0] = new BigDecimal(1);
        decimals[1] = new BigDecimal(1);
        for (int i = 2; i < count; i++) {
            decimals[i] = decimals[i - 1].add(decimals[i - 2]);
        }
        return decimals[count - 1];
    }

    public static void main(String[] args) {
        int count = 42;

        System.out.println("------------------");

        long start = System.currentTimeMillis();
        System.out.println(getFib(new BigDecimal(count)));
        long end = System.currentTimeMillis();
        System.out.println("耗时" + (end - start) + "ms");

        System.out.println("------------------");

        long s = System.currentTimeMillis();
        System.out.println(getResult(count));
        long e = System.currentTimeMillis();
        System.out.println("耗时" + (e - s) + "ms");
    }
}

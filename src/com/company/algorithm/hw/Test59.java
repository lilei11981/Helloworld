package com.company.algorithm.hw;

/**
 * @author lilei
 * @date 2021/2/1 10:32 下午
 * @apiNote 最小公倍数
 */

public class Test59 {

    private static int num = 1;

    // 辗转相除法
    private static int calNum(int x, int y) {
        int a = x, b = y;
        for (int i = 2; i < Math.min(x, y) / 2; i++) {
            if ((x % i == 0) && (y % i == 0)) {
                num *= i;
                a = x / i;
                b = y / i;
                calNum(a, b);
            }
        }
        return num * a * b;
    }

    public static void main(String[] args) {
        System.out.println(getNum(8, 6));
    }

    // 更相减损法
    private static int getNum(int x, int y) {
        return x * y / method(x, y);
    }

    private static int method(int x, int y) {
        if (x == y) {
            return x;
        }
        if (x > y) {
            int diff = x - y;
            return method(y, diff);
        } else {
            int diff = y - x;
            return method(x, diff);
        }
    }
}

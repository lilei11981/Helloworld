package com.company.abc;

/**
 * @author lilei
 * @date 2020-07-01 10:09
 * @apiNote
 */

public class Demo01 {
    public static void main(String[] args) {
        int sum = sum(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sum);
        int sum1 = sum(1, 2, 3);
        System.out.println(sum1);
    }

    public static int sum(int... args) {
        int sum = 0;
        for (int num : args) {
            sum += num;
        }
        return sum;
    }
}

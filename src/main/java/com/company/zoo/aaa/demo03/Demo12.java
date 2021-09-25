package com.company.zoo.aaa.demo03;

/**
 * @author lilei
 * @date 2021-09-21 下午10:09
 * @apiNote
 */

public class Demo12 {
    public static void main(String[] args) {
        // int a = 78;
        // print(a);
        // print(63);
        // System.out.println(a & 63);
        // System.out.println(a % 64);

        long a = 1;
        print(a << 8);
        print(a);
        print(~a);

    }

    public static void print(long num) {
        for (long i = 63L; i >= 0L; i--) {
            System.out.print((num & (1L << i)) == 0L ? "0" : "1");
        }
        System.out.println();
    }
}

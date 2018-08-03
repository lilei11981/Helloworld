package com.lilei1998.printpraph;

/**
 * Created by lilei on 2017/9/4 下午2:54.
 */
public class Parallelogram {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

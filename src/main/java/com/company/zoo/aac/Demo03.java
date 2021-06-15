package com.company.zoo.aac;

import java.util.Random;

/**
 * @author lilei
 * @date 2021-06-14 下午9:03
 * @apiNote leetcode 374
 */

public class Demo03 {

    private static final int NUM = Integer.MAX_VALUE;
    private static Random random = new Random();
    private static int pick = random.nextInt(NUM);
    // private static int pick = 7;

    public static void main(String[] args) {
        System.out.println(pick);
        // System.out.println(guess(5));
        System.out.println(guessNumber(NUM));
    }

    public static int guess(int num) {
        return Integer.compare(pick, num);
    }

    public static int guessNumber(int n) {
        // if (guess(n) == 0) {
        //     return n;
        // } else if (guess(n) > 0) {
        //     return guessNumber(n / 2);
        // } else {
        //     return guessNumber(n / 2 * 3);
        // }

        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) <= 0) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

package com.company.zoo.aac;

/**
 * @author lilei
 * @date 2021-06-18 下午7:54
 * @apiNote
 *
 * leetcode 122
 */

public class Demo06 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int result = 0;
        int length = prices.length;
        for (int i = 1; i < length; i++) {
            if (prices[i] > prices[i - 1]) {
                result += (prices[i] - prices[i - 1]);
            }
        }
        return result;
    }
}

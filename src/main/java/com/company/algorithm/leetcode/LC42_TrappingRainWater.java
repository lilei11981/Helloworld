package com.company.algorithm.leetcode;

import java.util.Random;

/**
 * @author lilei
 * @date 2021-05-15 下午9:46
 * @apiNote 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 */

public class LC42_TrappingRainWater {
    public static int maxWater(int[] array) {
        if (array == null || array.length < 2) {
            return 0;
        }
        int length = array.length;
        int result = 0;
        for (int i = 1; i < length - 1; i++) {
            int leftMax = 0;
            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, array[j]);
            }
            int rightMax = 0;
            for (int j = i + 1; j < length; j++) {
                rightMax = Math.max(rightMax, array[j]);
            }
            result += Math.max(Math.min(leftMax, rightMax) - array[i], 0);
        }
        return result;
    }

    public static int getMaxWater(int[] array) {
        if (array == null || array.length < 2) {
            return 0;
        }
        int length = array.length;
        int[] leftMax = new int[length];
        leftMax[0] = array[0];
        for (int i = 1; i < length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], array[i]);
        }
        int[] rightMax = new int[length];
        rightMax[length - 1] = array[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], array[i]);
        }
        int result = 0;
        for (int i = 1; i < length - 1; i++) {
            result += Math.max(Math.min(leftMax[i - 1], rightMax[i + 1]) - array[i], 0);
        }
        return result;
    }

    /*最优解 左右指针先指向数组的首位，然后向中间结算水量，直到指针重合*/
    public static int findMaxWater(int[] array) {
        if (array == null || array.length < 2) {
            return 0;
        }
        int length = array.length;
        int leftIndex = 1;
        int leftMax = array[0];
        int rightIndex = length - 2;
        int rightMax = array[length - 1];
        int result = 0;
        while (leftIndex <= rightIndex) {
            if (leftMax <= rightMax) {
                result += Math.max(0, leftMax - array[leftIndex]);
                leftMax = Math.max(leftMax, array[leftIndex++]);
            } else {
                result += Math.max(0, rightMax - array[rightIndex]);
                rightMax = Math.max(rightMax, array[rightIndex--]);
            }
        }
        return result;
    }

    /*测试案例，三种不同的解法，得出的结果相同*/
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            int[] array = new int[10];
            for (int j = 0; j < 10; j++) {
                array[j] = random.nextInt(100);
            }
            // System.out.println(maxWater(array));
            // System.out.println(getMaxWater(array));
            int a = maxWater(array);
            int b = getMaxWater(array);
            int c = findMaxWater(array);
            if (a != b || b != c) {
                System.out.println("发现问题");
                return;
            }
        }
        System.out.println("perfect");
    }
}

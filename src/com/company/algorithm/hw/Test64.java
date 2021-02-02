package com.company.algorithm.hw;

/**
 * @author lilei
 * @date 2021-02-02 下午3:15
 * @apiNote 子数组的最大累加和问题
 * <p>
 * 给定一个数组arr，返回子数组的最大累加和
 * 例如，arr = [1, -2, 3, 5, -2, 6, -1]，所有子数组中，[3, 5, -2, 6]可以累加出最大的和12，所以返回12.
 * 题目保证没有全为负数的数据
 * [要求]
 * 时间复杂度为O(n)，空间复杂度为O(1)
 */

public class Test64 {

    /**
     * max sum of the subarray
     *
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public static int getMaxSum(int[] arr) {
        // write code here
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = Math.max(result + arr[i], arr[i]);
        }
        return result;
    }

    public static int getMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Math.max(arr[i], arr[i] + arr[i - 1]);
            result = Math.max(result, arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, -2, 3, 5, -2, 6, -1};
        System.out.println(getMax(array));
    }
}

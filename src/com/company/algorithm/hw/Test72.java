package com.company.algorithm.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lilei
 * @date 2021-02-03 下午4:40
 * @apiNote 给定数组arr，设长度为n，输出arr的最长递增子序列。
 * （如果有多个答案，请输出其中字典序最小的）
 */

public class Test72 {

    public static void main(String[] args) {
        int[] array = {1, 2, 8, 6, 4};
        System.out.println(Arrays.toString(LIS(array)));
    }

    /**
     * return the longest increasing subsequence
     *
     * @param arr int整型一维数组 the array
     * @return int整型一维数组
     */
    public static int[] LIS(int[] arr) {
        // write code here
        List<Integer> result = new ArrayList<>();
        int[] maxLen = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (result.size() > 0) {
                if (result.get(result.size() - 1) < arr[i]) {
                    result.add(arr[i]);
                    maxLen[i] = result.size();
                } else {
                    for (int j = result.size() - 1; j >= 0; j--) {
                        if (result.get(j) < arr[i]) {
                            result.set(j + 1, arr[i]);
                            maxLen[i] = j + 2;
                            break;
                        }
                        if (j == 0) {
                            result.set(0, arr[i]);
                            maxLen[i] = 1;
                        }
                    }
                }
            } else {
                result.add(arr[i]);
                maxLen[i] = 1;
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i = arr.length - 1, j = result.size(); j > 0; i--) {
            if (maxLen[i] == j) {
                resultArray[--j] = arr[i];
            }
        }
        return resultArray;
    }
}

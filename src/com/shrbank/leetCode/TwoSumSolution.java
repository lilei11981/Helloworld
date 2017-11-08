package com.shrbank.leetCode;

import java.util.HashMap;

/**
 * Created by lilei on 2017/11/8 上午11:10.
 *
 * Give an array of integers, find two numbers such that they add up to a specific number.
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2.
 * Please note that your returned answers(both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 *
 * Input: numbers = {2, 7, 11, 15}, target = 9
 * Output: index1 = 1, index2 = 2
 */
public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // HashMap实例化
        int[] result = new int[2];      // 整型数组实例化
        for (int i = 0; i < nums.length; i++) {   // 把数组nums的值放入到map中
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int searched = target - nums[i];    // 目标数 -
            if (map.containsKey(searched) && map.get(searched) != i) {
                int index = map.get(searched);
                if (index < i) {
                    result[0] = map.get(searched) + 1;
                    result[1] = i + 1;
                } else {
                    result[0] = i + 1;
                    result[1] = map.get(searched) + 1;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int[] nums = {2, 7, 11, 15};
        int[] array = twoSumSolution.twoSum(nums, 9);
//        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}



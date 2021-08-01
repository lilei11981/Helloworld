package com.company.algorithm.leetcode;

import java.util.Arrays;

/**
 * @author lilei
 * @date 2021-06-26 下午9:42
 * @apiNote
 */

public class LC26 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 5, 6};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }


    public static int removeDuplicates(int[] nums) {
        // if (nums == null) {
        //     return 0;
        // }
        // int n = nums.length;
        // if (n == 0) {
        //     return 0;
        // }
        // int slow = 1;
        // int fast = 1;
        // while (fast < n) {
        //     if (nums[slow] != nums[fast-1]) {
        //         nums[slow] = nums[fast];
        //         slow++;
        //     }
        //     fast++;
        // }
        // return slow;

        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}

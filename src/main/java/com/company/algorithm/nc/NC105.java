package com.company.algorithm.nc;

/**
 * @author lilei
 * @date 2021-10-07 上午10:01
 * @apiNote
 */

public class NC105 {
    public static void main(String[] args) {
        // int[] nums = {1, 2, 4, 4, 5};
        // int target = 3;
        int[] nums = {1, 1, 1, 1, 1};
        int target = 1;

        System.out.println(search(nums, target));
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 如果目标值存在返回下标，否则返回 -1
     * @param nums int整型一维数组
     * @param target int整型
     * @return int整型
     */
    public static int search(int[] nums, int target) {
        // write code here
        int res = -1;
        if (nums == null || nums.length < 1) {
            return res;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int index = left + (right - left) / 2;
            if (nums[index] < target) {
                left = index + 1;
            } else if (nums[index] > target) {
                right = index - 1;
            } else {
                nums[index] = target;
                res = index;
                right = index - 1;
            }
        }
        return res;
    }
}

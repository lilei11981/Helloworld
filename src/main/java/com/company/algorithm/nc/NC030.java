package com.company.algorithm.nc;

import java.util.HashSet;
import java.util.Set;

public class NC030 {
    public static void main(String[] args) {
//        int[] nums = {1, 0, 2};
//        int[] nums = {-2,3,4,1,5};
        int[] nums = {4, 5, 6, 8, 9};
//        int[] nums = {3,4,5,6,7,8,1,2};

        System.out.println(minNumberDisappeared(nums));
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param nums int整型一维数组
     * @return int整型
     */
    public static int minNumberDisappeared(int[] nums) {
        // write code here

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int res = 1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (set.contains(res)) {
                res++;
            }
        }
        return res;
    }
}

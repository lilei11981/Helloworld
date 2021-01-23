package com.company.zoo.aaa.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lilei
 * @date 2021-01-20 下午6:40
 * @apiNote
 */

public class Demo25 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map map = new HashMap(nums.length);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && !map.get(target - nums[i]).equals(i)) {
                result[0] = i;
                result[1] = (Integer) map.get(target - nums[i]);
                break;
            }
        }
        return result;
    }
}

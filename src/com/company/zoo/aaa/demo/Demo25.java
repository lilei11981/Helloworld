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

    private static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i]) && !map.get(target - numbers[i]).equals(i)) {
                result[0] = i + 1;
                result[1] = map.get(target - numbers[i]) + 1;
                break;
            }
        }
        return result;
    }
}

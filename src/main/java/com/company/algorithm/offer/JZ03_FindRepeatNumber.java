package com.company.algorithm.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lilei
 * @date 2021-02-24 下午4:06
 * @apiNote 剑指 Offer 03. 数组中重复的数字
 *
 * 找出数组中重复的数字。
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 示例 1：
 *
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 */

public class JZ03_FindRepeatNumber {

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(array));
    }

    private static int findRepeatNumber(int[] array) {
        int length = array.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(array[i])) {
                return array[i];
            }
            map.put(array[i], 1);
        }
        return -1;
    }
}

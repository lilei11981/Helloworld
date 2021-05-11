package com.company.algorithm.hw;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lilei
 * @date 2021-02-04 下午1:15
 * @apiNote 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */

public class Test77 {

    public static int MoreThanHalfNum_Solution(int[] array) {
        if (array.length == 1) {
            return array[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        int len = 0;
        int result = 0;
        for (int value : array) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
                if (map.get(value) > len) {
                    len = map.get(value);
                    result = value;
                }
            } else {
                map.put(value, 1);
            }
        }
        System.out.println(map);
        System.out.println(len);
        if (len > array.length / 2) {
            return result;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 2, 5, 2, 3};
        System.out.println(array.length / 2);
        System.out.println(MoreThanHalfNum_Solution(array));
    }
}

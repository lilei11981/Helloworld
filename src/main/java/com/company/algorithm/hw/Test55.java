package com.company.algorithm.hw;

import java.util.HashMap;

/**
 * @author lilei
 * @date 2021-02-01 下午6:32
 * @apiNote 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。
 */

public class Test55 {

    public void FindNumsAppearOnce(int[] array, int[] num1, int[] num2) {
        //哈希算法
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int value : array) {
            if (map.containsKey(value)) {
                map.put(value, 2);
            } else {
                map.put(value, 1);
            }
        }
        int count = 0;
        for (int value : array) {
            if (map.get(value) == 1) {
                if (count == 0) {
                    num1[0] = value;
                    count++;
                } else {
                    num2[0] = value;
                }
            }
        }

    }
}

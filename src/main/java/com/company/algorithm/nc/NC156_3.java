package com.company.algorithm.nc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NC156_3 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 1, 5, 1, 5};
        int k = 3;
        System.out.println(foundOnceNumber(arr, k));
    }

    public static int foundOnceNumber(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            if (map.containsKey(value)) {
                int num = map.get(value);
                map.put(value, ++num);
            } else {
                map.put(value, 1);
            }
        }
        Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            if (map.get(integer) == 1) {
                return integer;
            }
        }
        return 0;
    }
}

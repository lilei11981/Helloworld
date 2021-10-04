package com.company.algorithm.nc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lilei
 * @date 2021-10-04 下午9:09
 * @apiNote
 */

public class NC093 {

    public static void main(String[] args) {
        // int[][] operators = {{1,1,1},{1,2,2},{1,3,2},{2,1},{1,4,4},{2,2}};
        int[][] operators = {{1, 1, 1}, {1, 2, 2}, {2, 1}, {1, 3, 3}, {2, 2}, {1, 4, 4}, {2, 1}, {2, 3}, {2, 4}};
        int k = 2;
        System.out.println(Arrays.toString(LRU(operators, k)));
    }

    /**
     * lru design
     * @param operators int整型二维数组 the ops
     * @param k int整型 the k
     * @return int整型一维数组
     */
    public static int[] LRU(int[][] operators, int k) {
        // write code here
        LRUCache cache = new LRUCache(k);
        int rows = operators.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            if (operators[i][0] == 1) {
                cache.set(operators[i][1], operators[i][2]);
            }
            if (operators[i][0] == 2) {
                list.add(cache.get(operators[i][1]));
            }
        }
        int n = list.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static class LRUCache {
        Map<Integer, Integer> map;
        int k;

        public LRUCache(int k) {
            this.k = k;
            map = new LinkedHashMap<>(k);
        }

        public void set(int key, int value) {
            if (map.size() == k) {
                map.remove(map.entrySet().iterator().next().getKey());
            }
            map.put(key, value);
            System.out.println(map.size());
            System.out.println(map);
        }

        public int get(int key) {
            if (map.containsKey(key)) {
                int value = map.remove(key);
                map.put(key, value);
                return value;
            }
            return -1;
        }
    }
}

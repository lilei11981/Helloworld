package com.company.algorithm.hw;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilei
 * @date 2021-02-05 上午11:38
 * @apiNote 汇总区间
 */

public class Test83 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 4, 5, 7, 8};
        System.out.println(summaryRange(array));
    }

    public static List<String> summaryRange(int[] array) {
        List<String> result = new ArrayList<>();
        int start = 0;
        int length = array.length;
        while (start < length) {
            int left = start;
            start++;
            while (start < length && array[start] == array[start - 1] + 1) {
                start++;
            }
            int right = start - 1;
            StringBuilder stringBuilder = new StringBuilder(Integer.toString(array[left]));
            if (left < right) {
                stringBuilder.append("->");
                stringBuilder.append(array[right]);
            }
            result.add(stringBuilder.toString());
        }
        return result;
    }
}

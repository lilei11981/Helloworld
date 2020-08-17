package com.company.algorithm.sort;

import java.util.Arrays;

/**
 * Created by lilei on 2017/9/14 下午3:41.
 */
public class ShellSort {
    public static void shellSortSmallToBig(int[] array) {
        for (int increment = array.length / 2; increment > 0; increment /= 2) {
            for (int i = increment; i < array.length; i++) {
                int temp = array[i];
                int j;
                for (j = i - increment; j >= 0; j -= increment) {
                    if (temp < array[j]) {
                        array[j + increment] = array[j];
                    } else {
                        break;
                    }
                }
                array[j + increment] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {26, 53, 67, 48, 57, 13, 48, 32, 60, 50};
        shellSortSmallToBig(array);
        System.out.println(Arrays.toString(array));
    }
}

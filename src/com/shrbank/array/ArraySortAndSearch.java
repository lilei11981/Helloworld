package com.shrbank.array;

import java.util.Arrays;

/**
 * Created by lilei on 2017/7/11.
 */
public class ArraySortAndSearch {
    public static void main(String[] args) throws Exception {
        int[] array = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Arrays.sort(array);
        printArray("数组排序结果为", array);
        int index = Arrays.binarySearch(array, 4);
        System.out.println("元素 4 在第 " + (index + 1) + " 个位置！");
    }

    private static void printArray(String message, int array[]) {
        System.out.println(message + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if ( i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}

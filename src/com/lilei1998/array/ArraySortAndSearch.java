package com.lilei1998.array;

import java.util.Arrays;

/**
 * Created by lilei on 2017/7/11.
 * 使用sort()方法对数组元素进行排序，已经使用binarySearch()方法来查找数组中的元素，我们定义printArray的方法来打印数组
 */

public class ArraySortAndSearch {
    public static void main(String[] args) {
        int[] array = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Arrays.sort(array);
        printArray("数组排序结果为", array);
        int index = Arrays.binarySearch(array, 4);
        System.out.println("元素 4 在第 " + (index + 1) + " 个位置！");
    }

    private static void printArray(String message, int array[]) {
        System.out.println(message + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}

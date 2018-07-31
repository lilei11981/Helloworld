package com.shrbank.array;

import java.util.Arrays;

/**
 * Created by lilei on 2017/7/25 下午1:52.
 * 用sort()方法对Java数组进行排序，使用insertElement()方法向数组插入元素
 */

/**
 * 数组位置查找
 * Arrays.binarySearch(Object array, Object key)
 * array: 要搜索的数组
 * key: 要搜索的值
 * 如果key在数组中，则返回搜索值的索引；否则返回-1或“-”（插入点）
 * 插入点是key将要插入数组的那一点，即第一个大于该key的元素的索引
 * 如果key不是数组元素，且在数组范围内，从1开始计数，得“ - 插入点索引值”
 * */

public class ArrayInsertElement {
    public static void main(String[] args) throws Exception {
        int[] intArray = {3, -5, 2, 8, -6, 9, 7, -1, 0, 4};
        Arrays.sort(intArray);       //  调用Arrays.sort()进行数组排序
        printArray("数组排序", intArray);       //  调用printArray()方法
        int index = Arrays.binarySearch(intArray, 1);    //  调用Arrays.binarySearch()进行数组元素位置查找
        System.out.println("元素 1 所在位置（负数为不存在）：" + index);  // 输出元素 1 所在位置
        int newIndex = -index - 1;
        intArray = insertElement(intArray, 1, newIndex);     // 使用insertElement()方法插入
        printArray("数组添加元素 1 ", intArray);        // 调用printArray()进行数组打印
    }

    public static void printArray(String message, int[] array) {       //  数组打印
        System.out.println(message + ": [length: " + array.length + "]");      // 打印出message值，以及数组长度
        for (int i = 0; i < array.length; i++) {       //  用循环一次打印输出数组元素值
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
/*    @Override
    private static int Arrays.binarySearch(array, key) {
        int low = fromIndex;   // 0
        int high = toIndex - 1;   // array.length - 1

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // key found
            }
        }
        return -(low + 1);   // key not found
    }*/

    /*
    * 数组复制方法
    * System.arraycopy(Object src, int srcPos, Object dest, int desPos, int length)
    * src: 源数组
    * srcPos: 源数组要复制的起始位置
    * dest: 目标数组
    * desPos: 目标数组要放置的起始位置
    * length: 要复制的长度
    * */

    private static int[] insertElement(int[] original, int element, int index) {    // 插入数组元素，original为原始数组名，element为插入元素名，index为插入位置
        int length = original.length;
        int[] destination = new int[length + 1];
        System.arraycopy(original, 0, destination, 0, index);
        destination[index] = element;
        System.arraycopy(original, index, destination, index + 1, length - index);
        return destination;
    }
}

package com.company.zoo.aaa.demo03;

import java.util.Arrays;

/**
 * @author lilei
 * @date 2021-10-02 下午10:31
 * @apiNote
 */

public class Demo16 {

    public static int[] generateSortArray() {
        int length = (int) (Math.random() * 100) + 1;
        int[] result = new int[length];
        result[0] = (int) (Math.random() * 10);
        for (int i = 1; i < length; i++) {
            result[i] = result[i - 1] + (int) (Math.random() * 10);
        }
        return result;
    }


    public static void main(String[] args) {
        int testTime = 10000;
        for (int i = 0; i < testTime; i++) {
            int[] arr = generateSortArray();
            int index = (int) (Math.random() * arr.length);
            int num = arr[index];
            if (binarySearch(arr, num) == -1) {
                System.out.println(Arrays.toString(arr));
                System.out.println(num);
                break;
            }
        }
        System.out.println("----");
    }

    public static int binarySearch(int[] array, int num) {
        if (array == null) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == num) {
                return mid;
            } else if (array[mid] > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

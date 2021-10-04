package com.company.algorithm.nc;

import java.util.Arrays;

public class NC140 {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 1, 9, 0, 7, 6, 8};
        System.out.println(Arrays.toString(MySort(arr)));
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 将给定数组排序
     *
     * @param arr int整型一维数组 待排序的数组
     * @return int整型一维数组
     */
    public static int[] MySort(int[] arr) {
        // write code here
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int point = partition(arr, left, right);
            quickSort(arr, left, point - 1);
            quickSort(arr, point + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int first = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= first) {
                right--;
            }
            swap(arr, left, right);
            while (left < right && arr[left] <= first) {
                left++;
            }
            swap(arr, left, right);
        }
        return left;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

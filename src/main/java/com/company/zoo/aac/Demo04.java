package com.company.zoo.aac;

/**
 * @author lilei
 * @date 2021-06-15 下午11:39
 * @apiNote leetcode852
 */

public class Demo04 {

    public static void main(String[] args) {
        int[] arr = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            if ((arr[i] - arr[i - 1]) < 0) {
                return i - 1;
            }
        }
        return -1;
    }


}

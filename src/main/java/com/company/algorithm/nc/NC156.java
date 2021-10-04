package com.company.algorithm.nc;

import java.util.Arrays;

public class NC156 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 1, 5, 1, 5};
        int k = 3;
        System.out.println(foundOnceNumber(arr, k));
    }

    public static int foundOnceNumber(int[] arr, int k) {
        // write code here
        Arrays.sort(arr);
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                i += k - 1;
            } else {
                return arr[i];
            }
        }
        return arr[length - 1];
    }
}

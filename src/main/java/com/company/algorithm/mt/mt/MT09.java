package com.company.algorithm.mt.mt;

import java.util.Arrays;

public class MT09 {
    public static void main(String[] args) {
        String a = "[[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]";
        System.out.println(a.replace('[', '{').replace(']', '}'));
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int n = 4;
        System.out.println(Arrays.toString(arrayPrint(arr, 4)));
        String b = "[4,3,8,2,7,12,1,6,11,16,5,10,15,9,14,13]";
//        System.out.println(b.replace('[', '{').replace(']', '}'));
        int[] c = {4, 3, 8, 2, 7, 12, 1, 6, 11, 16, 5, 10, 15, 9, 14, 13};
        System.out.println(Arrays.toString(c));
    }

    public static int[] arrayPrint(int[][] arr, int n) {
        // write code here

//        res[0] = arr[0][n-1];
//        res[1] = arr[0][n-2];
//        res[2] = arr[1][n-1];
//        res[3] = arr[0][n-3];
        int[] res = new int[n * n];
        int index = 0;
        for (int j = n - 1; j >= 0; j--) {
            for (int i = 0; i < n - j; i++) {
                res[index] = arr[i][j + i];
                System.out.println(Arrays.toString(res));
                res[n * n - 1 - index] = arr[n - 1 - i][n - 1 - j - i];
                System.out.println(Arrays.toString(res));
                System.out.println("------------------------");
                index++;
            }
        }
        return res;
    }
}

package com.company.utils;

/**
 * @author lilei
 * @date 2021-02-26 下午4:47
 * @apiNote
 */

public class ArrayUtil {


    /**
     * 打印二维数组
     * @param array 二维数组
     */
    public static void print(int[][] array) {
        if (array == null || array.length == 0) {
            System.out.println("数组为空");
            return;
        }
        int m = array.length;
        int n = array[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }

        System.out.println("----------------------------");
    }
}

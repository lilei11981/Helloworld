package com.company.algorithm.hw;

import java.util.Arrays;

/**
 * @author lilei
 * @date 2021-02-04 下午5:53
 * @apiNote 已知int一个有序矩阵mat，同时给定矩阵的大小n和m以及需要查找的元素x，
 * 且矩阵的行和列都是从小到大有序的。设计查找算法返回所查找元素的二元数组，
 * 代表该元素的行号和列号(均从零开始)。保证元素互异。
 */

public class Test81 {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.toString(findElement(array, 2, 3, 6)));
    }

    public static int[] findElement(int[][] mat, int n, int m, int x) {
        // write code here
        int rows = n - 1;
        int cols = 0;
        while (rows >= 0 && cols <= m - 1) {
            if (mat[rows][cols] == x) {
                return new int[]{rows, cols};
            } else if (mat[rows][cols] > x) {
                rows--;
            } else {
                cols++;
            }
        }
        return new int[]{};
    }
}

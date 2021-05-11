package com.company.algorithm.hw;

/**
 * @author lilei
 * @date 2021/2/1 8:56 下午
 * @apiNote 给定一个由0和1组成的2维矩阵，返回该矩阵中最大的由1组成的正方形的面积
 */

public class Test57 {

    /**
     * 最大正方形
     *
     * @param matrix char字符型二维数组
     * @return int整型
     */
    public static int solve(char[][] matrix) {
        // write code here
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] dp = new int[rows][cols];
        int result = 0;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == '1') {
                dp[i][0] = 1;
            }
        }
        for (int i = 0; i < cols; i++) {
            if (matrix[0][i] == '1') {
                dp[0][i] = 1;
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1;
                    if (dp[i][j] > result) {
                        result = dp[i][j];
                    }
                }
            }
        }
        return result * result;
    }

    public static void main(String[] args) {
//        char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        char[][] matrix = {};
        System.out.println(solve1(matrix));
    }

    public static int solve1(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int max = 0;
        for (int i = 0; i < m; i++) {
            dp[i][0] = matrix[i][0] - '0';
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = matrix[0][i] - '0';
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]);
                    dp[i][j] = Math.min(dp[i][j], dp[i][j - 1]) + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max * max;
    }


}

package com.company.abc.demo;

/**
 * @author lilei
 * @date 2020-07-13 10:19
 * @apiNote 给定一个矩阵，大小为 m，
 * 从左上角开始每次只能向右走或者向下走，最后达到右下角的位置。
 * 路径中所有数字累加起来就是路径和，返回所有路径的最小路径和。
 */

public class Demo12 {
    public static void main(String[] args) {
        int[][] m = {{4, 1, 5, 3}, {3, 2, 7, 7}, {6, 5, 2, 8}, {8, 9, 4, 5}};
//        int[][] m = {{1,2},{3,4}};
        System.out.println(getMinPath(m));
    }


    private static int getMinPath(int[][] m) {
        if (m.length == 0 || m[0].length == 0) {
            return 0;
        }
        int[][] dp = new int[m.length][m[0].length];
        dp[0][0] = m[0][0];

        for (int i = 1; i < m.length; i++) {
            dp[0][i] = m[0][i] + m[0][i - 1];
        }
        for (int i = 1; i < m[0].length; i++) {
            dp[i][0] = m[i][0] + m[i - 1][0];
        }

        for (int i = 1; i < m.length; i++) {
            for (int j = 1; j < m[0].length; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + m[i][j];
            }
        }
        return dp[m.length - 1][m[0].length - 1];
    }
}

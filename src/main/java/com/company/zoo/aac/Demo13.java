package com.company.zoo.aac;

/**
 * @author lilei
 * @date 2021-10-10 下午4:08
 * @apiNote
 */

public class Demo13 {
    public static void main(String[] args) {
        String a = "[[1,1,0,0,0],[0,1,0,1,1],[0,0,0,1,1],[0,0,0,0,0],[0,0,1,1,1]]";
        System.out.println(a.replace('[', '{').replace(']', '}').replace(",", "','").replace("{", "{'").replace("}", "'}"));
        String b = "{'{'1','1','0','0','0'}','{'0','1','0','1','1'}','{'0','0','0','1','1'}','{'0','0','0','0','0'}','{'0','0','1','1','1'}'}";
        System.out.println(b.replace("'{", "{").replace("}'", "}"));
        char[][] nums = {{'1', '1', '0', '0', '0'}, {'0', '1', '0', '1', '1'}, {'0', '0', '0', '1', '1'}, {'0', '0', '0', '0', '0'}, {'0', '0', '1', '1', '1'}};
        System.out.println(solve(nums));
    }

    public static int solve(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    result++;
                    dfs(grid, i, j);
                }
            }
        }
        return result;
    }

    private static void dfs(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }
}

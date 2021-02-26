package com.company.algorithm.leetcode;

import com.company.utils.ArrayUtil;

/**
 * @author lilei
 * @date 2021-02-26 下午2:37
 * @apiNote 200. 岛屿数量
 *
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 *
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 *
 * 此外，你可以假设该网格的四条边均被水包围。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * 输出：1
 * 示例 2：
 *
 * 输入：grid = [
 *   ["1","1","0","0","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","1","0","0"],
 *   ["0","0","0","1","1"]
 * ]
 * 输出：3
 *  
 *
 * 提示：
 *
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 300
 * grid[i][j] 的值为 '0' 或 '1'
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-islands
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 解决方案
 * 方法一：深度优先搜索
 * 我们可以将二维网格看成一个无向图，竖直或水平相邻的 11 之间有边相连。
 * 为了求出岛屿的数量，我们可以扫描整个二维网格。如果一个位置为 11，
 * 则以其为起始节点开始进行深度优先搜索。在深度优先搜索的过程中，
 * 每个搜索到的 11 都会被重新标记为 00。
 * 最终岛屿的数量就是我们进行深度优先搜索的次数。
 *
 * 复杂度分析
 * 时间复杂度：O(MN)O(MN)，其中 MM 和 NN 分别为行数和列数。
 *
 * 空间复杂度：O(MN)O(MN)，在最坏情况下，整个网格均为陆地，深度优先搜索的深度达到 M NMN。
 *
 *
 */

public class LC200a_NumberOfIslands {

    private static void dfs(int[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0) {
            return;
        }
        ArrayUtil.print(grid);

        grid[i][j] = 0;
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }

    private static int numOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    result++;
                    dfs(grid, i, j);
                    ArrayUtil.print(grid);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        // 为便于测试，把数组类型改成整型
        int[][] grid = {{1, 1, 1, 1, 0}, {1, 1, 0, 1, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int[][] array = {{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 1}};
        int[][] arr = {{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 1}, {1, 0, 1, 0, 0}};
        System.out.println(numOfIsland(grid));
        // System.out.println(numOfIsland(array));
        // System.out.println(numOfIsland(arr));
    }
}

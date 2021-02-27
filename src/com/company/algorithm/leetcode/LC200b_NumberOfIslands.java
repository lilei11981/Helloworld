package com.company.algorithm.leetcode;

import java.util.LinkedList;
import java.util.Queue;

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
 * 方法二：广度优先搜索
 * 同样地，我们也可以使用广度优先搜索代替深度优先搜索。
 *
 * 为了求出岛屿的数量，我们可以扫描整个二维网格。如果一个位置为 11，则将其加入队列，开始进行广度优先搜索。在广度优先搜索的过程中，每个搜索到的 11 都会被重新标记为 00。直到队列为空，搜索结束。
 *
 * 最终岛屿的数量就是我们进行广度优先搜索的次数。
 *
 * 复杂度分析
 *
 * 时间复杂度：O(MN)O(MN)，其中 MM 和 NN 分别为行数和列数。
 *
 * 空间复杂度：O(\min(M, N))O(min(M,N))，在最坏情况下，整个网格均为陆地，队列的大小可以达到 \min(M, N)min(M,N)。
 *
 * 作者：LeetCode
 * 链接：https://leetcode-cn.com/problems/number-of-islands/solution/dao-yu-shu-liang-by-leetcode/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */

public class LC200b_NumberOfIslands {

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
                    grid[i][j] = 0;
                    Queue<Integer> neighbors = new LinkedList<>();
                    neighbors.add(i * n + j);
                    while (!neighbors.isEmpty()) {
                        int id = neighbors.remove();
                        int row = id / n;
                        int col = id % n;
                        if (row - 1 >= 0 && grid[row - 1][col] == 1) {
                            neighbors.add((row - 1) * n + col);
                            grid[row - 1][col] = 0;
                        }
                        if (row + 1 < m && grid[row + 1][col] == 1) {
                            neighbors.add((row + 1) * n + col);
                            grid[row + 1][col] = 0;
                        }
                        if (col - 1 >= 0 && grid[row][col - 1] == 1) {
                            neighbors.add(row * n + col - 1);
                            grid[row][col - 1] = 0;
                        }
                        if (col + 1 < m && grid[row][col + 1] == 1) {
                            neighbors.add(row * n + col + 1);
                            grid[row][col + 1] = 0;
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1, 1, 0}, {1, 1, 0, 1, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int[][] array = {{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 1}};
        int[][] arr = {{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 1}, {1, 0, 1, 0, 0}};
        System.out.println(numOfIsland(grid));
        System.out.println(numOfIsland(array));
        System.out.println(numOfIsland(arr));
    }


}

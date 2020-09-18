package com.company.zoo.aaa.ali;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lilei
 * @date 2020-07-28 15:12
 * @apiNote 算法笔试模拟题精解之“Tom 爱吃巧克力”
 * 根据题意，可以得知这道题可以运用贪心算法，策略是每次都去买最便宜的巧克力。
 * Tom 非常喜欢巧克力，他上次买的巧克力吃完了，所以他打算再去买 k 块巧克
 * 力回来 (1<=k<=1e5)，他又是一个非常节俭的一个人，所以他想花最少的钱去买巧克力。
 * 现在有 n 家卖巧克力的店 (1<=n<=1e5)，每个店的巧克力都限购 bi 块 ( 最多只
 * 能买 bi 块 ,1<=bi<=1e5)，每块的价格是 ai(1<=ai<=1e9)，请问 Tom 买 k 块巧克
 * 力最少要花多少钱?题目保证 n 个 bi 的总和大于等于 k。
 * 输 入 卖 巧 克 力 的 店 的 个 数 n(1<=n<=1e5);
 * 打 算 去 买 的 巧 克 力 块 数 k(1<=k<=1e5);
 * 和一个数组 m, 其中 mi =ai, bi 表示第 i 家巧克力店的巧克力的价格和限购块数
 * 输出一个数，表示 Tom 买 k 块巧克力花的最少钱数
 * 2
 * 5
 * [[4,5],[2,4]]
 * <p>
 * 1
 * 100000
 * [[1000000000,100000]]
 * 注意强制类型转换为long类型
 */

public class Main05 {
    public static void main(String[] args) {
        int n = 1;
        long k = 100000;
        int[][] m = {{1000000000, 100000}};
        System.out.println(solution(n, k, m));
    }

    private static long solution(int n, long k, int[][] m) {
        Arrays.sort(m, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        long result = 0L;
        int num = 0;
        for (int i = 0; i < n; i++) {
            if ((num + m[i][1]) <= k) {
                num += m[i][1];
                result += ((long) m[i][1] * (long) m[i][0]);
            } else {
                result += ((k - num) * (long) m[i][0]);
                break;
            }
        }
        return result;
    }


}

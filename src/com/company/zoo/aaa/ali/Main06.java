package com.company.zoo.aaa.ali;

/**
 * @author lilei
 * @date 2020-07-28 16:23
 * @apiNote 算法笔试模拟题精解之“吃奶酪”
 * Tom 和 Jerry 都很喜欢吃奶酪，现在有 n 块奶酪散落在坐标轴上 (1<=n<= 100000)，
 * 他们分别在 a1,a2,a3...an(1<=ai<=100000, 一个点可以有多块奶酪 ) 上，
 * Tom 和 Jerry 分别在 1 和 100000 两个点上，他们每走一步需要花费 1s，
 * 问他们拿到所有的奶酪至少要花费多少时间
 * 输入奶酪数量 n，和 n 个奶酪的坐标
 * 输出一个数，表示他们拿到所有奶酪所用的最短时间
 * 4
 * [350,2000,80000,99999]
 * 20000
 */

public class Main06 {
    public static void main(String[] args) {
        int n = 4;
        int[] nums = {350, 2000, 50000, 80000, 99999};
        System.out.println(solution(n, nums));
    }

    private static int solution(int n, int[] nums) {
        int time = 0;
        for (int num : nums) {
            if (num > 100000 / 2) {
                if ((100000 - num) > time) {
                    time = 100000 - num;
                }
            } else {
                if (num > time) {
                    time = num - 1;
                }
            }

        }
        return time;
    }

}

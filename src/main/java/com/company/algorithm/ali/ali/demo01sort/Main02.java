package com.company.algorithm.ali.ali.demo01sort;

/**
 * @author lilei
 * @date 2020-07-28 14:15
 * @apiNote 算法笔试模拟题精解之“打怪兽”
 * 根据题意，本题可使用贪心算法完成，策略是每次打怪兽都选择代价最小的一只。
 * 现在有 3 只怪兽，他们的都有自己的血量 a,b,c(1<=a,b,c<=100)，
 * 当 Tom 打死第一怪兽的时候花费的代价为 0，
 * 其余的怪兽的代价为当前的怪兽的血量减去上一个怪兽的血量的绝对值。
 * 问 Tom 打死这些怪兽所需要的最小代价 ?
 * 分别输入三只怪兽的血量;
 * 输出打死三只怪兽的最小代价。
 * 2 5 8
 * 6
 */

public class Main02 {
    public static void main(String[] args) {
        System.out.println(solution(2, 5, 8));
    }

    private static int solution(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max - min;
    }
}

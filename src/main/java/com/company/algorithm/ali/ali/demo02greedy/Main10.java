package com.company.algorithm.ali.ali.demo02greedy;

/**
 * @author lilei
 * @date 2020-07-29 14:04
 * @apiNote 算法笔试模拟题精解之“移动射击”
 * 简介:首先理解题意，题目说的“发动之后只能改变一次方向”是干扰你的，因
 * 为即使你在中间过程中左右摆，但宏观上还是最多改变了一次方向。
 * 题目等级:中等
 * 知识点:DP
 * 你正在数轴上跟小精灵对战。你拥有一个十分强力的技能称为移动射击，但是这
 * 个技能有一个缺点是在你发动之后只能改变一次方向。
 * 你可以认为你的位置在数字 0 的位置上，在数轴的正方向上有 n 只精灵，负方向
 * 上有 m 只精灵。移动射击可以造成 w 点伤害。每个精灵都有自己的血量，当血量降
 * 为 0 时死亡。
 * 在最开始时你可以选择向正方向或负方向释放移动射击，并且可以在任意时刻改
 * 变技能的方向。请问你最多可以击杀多少只小精灵 ?(n，m，w 以及精灵的血量均在
 * [1, 100000] 范围内 )
 * 输入内容为五个，前三个为三个数字 :正方向上的精灵个数 n、负方向上的精灵
 * 个数 m, 移动射击可以造成的伤害 w;第四个是一个长度为 n 的数组 a，表示正方向
 * 上的 n 个精灵的血量;第五个是一个长度为 m 的数组 b，表示负方向上的 m 个精灵
 * 的血量。
 * 输出一个数字，表示最多能够击杀的精灵数量。
 * 示例
 * 输入:
 * 3
 * 4
 * 10
 * [1, 2, 3] [4, 3, 2 ,1]
 * 输出:
 * 4
 * <p>
 * 91459
 * 83837
 * 66783
 * []
 * []
 */

public class Main10 {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int w = 10;
        int[] a = {1, 2, 3};
        int[] b = {4, 3, 2, 1};
        System.out.println(solution(n, m, w, a, b));
    }

    private static int solution(int n, int m, int w, int[] a, int[] b) {

        int left = 0;
        for (int i = 0; i < n; i++) {
            if (w - a[i] >= 0) {
                left++;
                w -= a[i];
            } else {
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            if (w - b[i] >= 0) {
                left++;
                w -= b[i];
            } else {
                break;
            }
        }

        int right = 0;
        for (int i = 0; i < m; i++) {
            if (w - b[i] >= 0) {
                right++;
                w -= b[i];
            } else {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (w - a[i] >= 0) {
                right++;
                w -= a[i];
            } else {
                break;
            }
        }
        return Math.max(left, right);
    }
}

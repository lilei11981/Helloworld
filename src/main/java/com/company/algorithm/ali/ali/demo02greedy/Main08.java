package com.company.algorithm.ali.ali.demo02greedy;

/**
 * @author 李磊
 * @date 2020/7/28 21:22
 * @apiNote 算法笔试模拟题精解之“Bob 的花束”
 * 本题充分理解题意后，直接模拟这个“选取最大值”的过程就可以得到结果了
 * Bob 和 Alice 是青梅竹马。今天，Bob 终于要鼓起勇气向 Alice 表白了！说到表
 * 白，自然是少不了买花了。Bob 来到了花店，花店一共提供了 9 种花，每一种花都有
 * 对应的价钱。但是 Bob 的零花钱有限，不能把所有的花都买下来送给 Alice。
 * 为了方便挑选，Bob 给这 9 种花分别标号 1-9，Bob 希望买到的花按照编号可
 * 以排出尽可能大数字，请问 Bob 能够排出的最大的数字是多少？
 * 输入一个正整数 value，代表 Bob 拥有的零花钱。(0<=value<=10^6)
 * 和有 9 个数字的数组 a，ai 代表第 i 种花的价格。(1<=ai<=10^5,1<=i<=9)
 * 输出一个数字，表示 Bob 可以排出的最大数字。如果 Bob 不能排出任何一个数字，则输出 -1。
 * 示例 1
 * 输入：
 * 2
 * [9,11,1,12,5,8,9,10,6]
 * 输出：
 * 33
 * 注意 :
 * 花店的每一种花都可以视为无限多。
 */
public class Main08 {
    public static void main(String[] args) {
        int value = 432544;
        int[] nums = {95724, 98294, 23292, 24174, 57778, 95072, 81898, 50019, 86824};
        System.out.println(solution(value, nums));
    }

    private static String solution(int value, int[] nums) {
        StringBuilder result = new StringBuilder();
        int position = 1;
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= min) {
                min = nums[i];
                position = i + 1;
            }
        }
        int m = value / min;
        if (m == 0) {
            return "-1";
        }
        int n = value % min;
        int newPosition;
        for (int i = nums.length - 1; i >= 0; i--) {
            while (min + n >= nums[i] && i >= position) {
                newPosition = i + 1;
                n = n + min - nums[i];
                result.append(newPosition);
                m--;
            }
        }
        for (int i = 0; i < m; i++) {
            result.append(position);
        }
        return result.toString();
    }
}

package com.company.zoo.aaa.ali;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * @author lilei
 * @date 2020-07-26 13:02
 * @apiNote 算法笔试模拟题精解之“数组变换”
 * 等级:中等
 * 知识点:排序、贪心
 * 题目描述: 给出一个长度为 n 的数组，和一个正整数 d。
 * 你每次可以选择其中任意一个元素 a[i] 将其变为 a[i] + d 或 a[i] - d，这算作一次操作。
 * 你需要将所有的元素全部变成相等元素，如果有解，请输出最小操作次数，如果 无解请输出 -1。
 * 输入数字 n、数字 d，和一个长度为 n 的数组 a。1 <= n <= 100000，1 <= d <= 100, 1 <= a[i] <= 100000。
 * 输出一个数字，表示最小的操作次数，如果无解输出 -1。
 * 示例 1
 * 输入:
 * 5
 * 2
 * [3,5,7,1,9]
 * 输出:
 * 6
 * 注意
 * 最优解为全部变为 5，共 1 + 0 + 1 + 2 + 2 = 6 次。
 */


public class Main01 {
    public static void main(String[] args) {
        int n = 5;
        int d = 2;
        int[] a = {3, 5, 7, 1, 9};
        System.out.println(solution(n, d, a));
    }

    private static int solution(int n, int d, int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : a) {
            set.add(i % d);
        }
        if (set.size() > 1) {
            return -1;
        }
        Arrays.sort(a);
        List<Integer> countList = new ArrayList<>();
        int basic = a[0] % d;
        for (int i = 0; i <= n; i++) {
            int flag = basic + d * i;
            List<Integer> list = new ArrayList<>();
            for (int num : a) {
                list.add(Math.abs(num - flag) / d);
            }
            int count = 0;
            for (Integer integer : list) {
                count += integer;
            }
            countList.add(count);
        }
        return Collections.min(countList);
    }
}

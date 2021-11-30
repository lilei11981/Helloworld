package com.company.algorithm.ali.ali.demo02greedy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author lilei
 * @date 2020-07-28 18:59
 * @apiNote 算法笔试模拟题精解之“一的个数”
 * 根据题意，本题的所有数字应从二进制角度考虑。
 * 给你两个数字 l、r，问在区间 [l,r] 内的所有数中，二进制表示下“1”的个数最
 * 多的一个数是多少，如果有多个相同的，输出所有符合条件的数中最小的一个数。
 * 输入一个整数 l, 和一个整数 r。(1<=l<=r<=10^9)
 * 输出一个数字表示 [l,r] 内二进制下“1”的个数最多的数。如果有多个，输出符
 * 合条件的数中最小的。
 * 示例 1
 * 输入:
 * 5 10
 * 输出:
 * 7
 */

public class Main07 {
    public static void main(String[] args) {
        int l = 5;
        int r = 10;
        System.out.println(solution(l, r));
    }

    private static int solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            int count = 0;
            for (int j = 0; j < decToBin(i).length(); j++) {
                if (decToBin(i).charAt(j) == '1') {
                    count++;
                }
            }
            list.add(count);
        }
        int max = Collections.max(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == max) {
                return l + i;
            }
        }
        return 0;
    }

    private static StringBuilder decToBin(int num) {
        StringBuilder bin = new StringBuilder();
        while (num != 0) {
            int quotient = num / 2;
            int remainder = num % 2;
            bin.append(remainder);
            num = quotient;
        }
        return bin.reverse();
    }
}

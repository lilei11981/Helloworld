package com.company.algorithm.ali.ali.demo02greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author lilei
 * @date 2020-07-30 11:12
 * @apiNote 算法笔试模拟题精解之“过吊桥”
 * 简介:根据题意，要知道 B 同学还能在桥的一头逗留的时间，需要先求出什么时
 * 候有连续的两块木板坏掉，或者第一块或者最后一块木板坏掉。
 * 题目描述
 * 题目等级:容易
 * 知识点:贪心
 * B 同学在机房敲了半个多月的代码之后终于打算出门玩一玩了。这天他准备去爬
 * 山，当爬到了半山腰时，发现了一个吊桥。
 * 这个吊桥总共由 n 块标号为 1-n 的木板组成，由于年久失修，这些木板有些已
 * 经快要坏掉了，每块木板都有一个值 ai 表示第 i 块木板还有 ai 分钟就要坏掉了，即
 * 在第 ai+1 分钟将无法站上这块木板。
 * B 同学过吊桥时一步只能走一块或两块木板，但是他想在吊桥的这边多玩一会。
 * 请问他在吊桥这边最多可以玩多长时间?(可以认为 B 同学能在一分钟内通过吊
 * 桥)特殊的，如果第一块或者最后一块木板坏掉的话吊桥就直接无法通过了。
 * 输入一个整数 n, 表示总共有 n 块木板 (1<= n <= 10^5)。
 * 再输入一个包含 n 个整数的数组，第 i 个数表示第 i 块木板还有 ai 分钟就要坏掉
 * 了 (1 <= ai <= 10^9)。
 * 输出一个整数表示 B 同学还能在桥的一头逗留的时间。
 * 示例 1
 * 输入:
 * 4 [10,3,5,10]
 * 输出:
 * 5
 * 注意
 * 在第五分钟，还剩 124 三块木板可以通过，在第六分钟只剩下 14 两块木板就无
 * 法通过了。
 */

public class Main12 {
    public static void main(String[] args) {
        int n = 4;
        int[] a = {10, 3, 5, 10};
        System.out.println(solution(n, a));
    }

    private static int solution(int n, int[] a) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                map.get(a[i]).add(i + 1);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i + 1);
                map.put(a[i], list);
            }
        }
        System.out.println(map);

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int[] status = new int[n];

        for (int i : a) {

        }

        return 0;
    }
}

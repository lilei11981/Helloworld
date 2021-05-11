package com.company.algorithm.ali;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lilei
 * @date 2020-07-28 14:40
 * @apiNote 算法笔试模拟题精解之“最强的团队”
 * 根据题意，最强团队即团队中每个小队的能力值都是最高的。
 * 即解决这道题需要找出数组中连续最大值的个数，若有多个连续最大值，选择个数最多的。
 * 有一个阵营，里面有 n 个小队 (1<=n<=100)，每个小队都有他们的能力值 ai(0<=i
 * 现在有一个紧急情况，需要从这些小队中选出连续的几个小队，组成一个最强的团队。
 * 最强的团队的定义为这个团队的所有小队的平均能力值最高。如果有多个最强团队，则选包含小队最多的一个。
 * 现在请你写个程序，输出这个最强的团队包含的小队的个数。
 * 输入小队的数量 n，和 n 个数，分别代表各小队的能力值 ai
 * 输出一个数表示这个最强团队包含的小队的个数。
 */

public class Main04 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 2, 1};
        System.out.println(solution(a.length, a));
    }

    private static int solution(int n, int[] a) {
        int max = a[0];
        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : a) {
            if (i == max) {
                stringBuilder.append(1);
            } else {
                stringBuilder.append(0);
            }
        }
        List<Integer> list = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == '1') {
                result++;
                list.add(result);
            } else {
                result = 0;
            }
        }
        return Collections.max(list);
    }
}

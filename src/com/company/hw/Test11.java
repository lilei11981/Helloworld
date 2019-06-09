package com.company.hw;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-09-18
 * Time: 上午10:18
 * Description:
 * <p>
 * 找出字符串中出现次数最多的字母和出现的次数
 */

public class Test11 {
    public static void main(String[] args) {
        String string = "mmmmnnnn";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i) + "");
        }
        System.out.println("排序前：" + list);
        Collections.sort(list);
        System.out.println("排序后：" + list);
        int[] count = new int[list.size()];
        for (int i = 0; i < count.length; i++) {
            count[i] = 1;
        }

        // 打印数组的方法
        System.out.println("初始化每个字母出现的次数：" + Arrays.toString(count));

        for (int j = 0; j < list.size(); j++) {
            for (int k = j + 1; k < list.size(); k++) {
                if (list.get(j).equals(list.get(k))) {
                    count[j]++;
                    list.remove(k);
                    k--;
                }
            }
        }

        System.out.println("循环后：" + list);
        System.out.println("循环后每个字母出现的次数：" + Arrays.toString(count));

        int maxCount = count[0];
        String maxChar = list.get(0);

        // 找数组里的最大值
        for (int i = 0; i < list.size(); i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxChar = list.get(i);
            }
        }

        System.out.println("出现次数最多的字母:" + maxChar + ", 出现的次数：" + maxCount);
    }
}

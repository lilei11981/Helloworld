package com.company.abc.hw;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-09-18
 * Time: 下午4:25
 * Description:
 * 找出字符串中出现次数最多的字母和出现的次数
 */

public class Test12 {
    public static void main(String[] args) {
        String string = "mmmmnnnn";
        searchString(string);
    }

    private static void searchString(String string) {
        char[] chars = string.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            list.add(chars[i]);
        }
        int maxCount = 1;
        char maxChar = chars[0];
        for (int j = 0; j < list.size() - 1; j++) {
            int count = 1;
            for (int k = j + 1; k < list.size(); k++) {
                if (list.get(k) == (list.get(j))) {
                    list.remove(k);
                    k--;
                    count++;
                    if (count > maxCount) {
                        maxCount = count;
                        maxChar = list.get(j);
                    }
                }
            }
        }
        System.out.println("出现次数最多的字母：" + maxChar + ", 出现的次数：" + maxCount);
    }
}

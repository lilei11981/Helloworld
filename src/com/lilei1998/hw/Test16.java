package com.lilei1998.hw;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-11-06
 * Time: 11:16 AM
 * Description:
 * 将大写字母转换成其对应小写字母后的第五个字母
 * 大于z的从头开始数
 * 如果是小写则不变
 */

public class Test16 {
    public static void main(String[] args) {
        String string = "ABcYz";
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32 + 5);
                if (chars[i] > 'z') {
                    chars[i] -= 26;
                }
            }
        }
        String stringResult = Arrays.toString(chars);
        System.out.println(stringResult);
    }
}

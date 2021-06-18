package com.company.zoo.aac;

/**
 * @author lilei
 * @date 2021-06-15 下午11:50
 * @apiNote leetcode171
 */

public class Demo05 {

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
        // char a = 'A';
        // System.out.println(a + 0);
        // System.out.println(Math.pow(2,3));
    }

    public static int titleToNumber(String columnTitle) {
        char[] chars = columnTitle.toCharArray();
        int length = chars.length;
        int result = 0;
        for (int i = 0; i < length; i++) {
            result += (chars[i] - 64) * Math.pow(26, length - i - 1);
        }
        return result;
    }
}

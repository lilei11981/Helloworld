package com.company.algorithm.hw;

/**
 * @author lilei
 * @date 2021/2/2 11:10 下午
 * @apiNote 给定两个字符串str1和str2,输出两个字符串的最长公共子串，如果最长公共子串为空，输出-1。
 */

public class Test68 {
    /**
     * longest common substring
     * @param str1 string字符串 the string
     * @param str2 string字符串 the string
     * @return string字符串
     */
    public static String LCS(String str1, String str2) {
        // write code here
        if (str1 == null || str2 == null) {
            return "-1";
        }

        StringBuilder stringBuilder = new StringBuilder();
        int start = 0;
        int end = 0;
        while (end < str1.length()) {
            if (str2.contains(str1.substring(start, end))) {
                if (stringBuilder.length() < end - start) {
                    stringBuilder.delete(0, stringBuilder.length());
                    stringBuilder.append(str1, start, end);
                }
                end++;
            } else {
                start++;
            }
        }
        if (stringBuilder.length() == 0) {
            return "-1";
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(LCS("1AB2345CD","1234EF"));
    }
}

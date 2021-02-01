package com.company.algorithm.hw;

/**
 * @author lilei
 * @date 2021-02-01 下午2:31
 * @apiNote 判断回文字符串
 */

public class Test52 {

    public static boolean judge(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        int a = 0;
        int b = s.length() - 1;
        while (a < b) {
            if (s.charAt(a) != s.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(judge(""));
    }
}

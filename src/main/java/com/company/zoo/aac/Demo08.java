package com.company.zoo.aac;

/**
 * @author lilei
 * @date 2021-06-19 下午10:31
 * @apiNote leetcode 392
 */

public class Demo08 {

    public static void main(String[] args) {
        // String s = "acb";
        String s = "abc";
        // String s = "axc";
        // String t = "ahbgdc";
        String t = "";
        System.out.println(isSub(s, t));
        // System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s == null || s.length() == 0) {
            return true;
        }
        if (t == null || t.length() == 0) {
            return false;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int sLength = sChars.length;
        int tLength = tChars.length;
        int result = 0;
        int i = 0;
        for (char sChar : sChars) {
            while (sChar != tChars[i]) {
                i++;
                if (i == tLength) {
                    break;
                }
            }
            if (i == tLength) {
                break;
            }
            if (sChar == tChars[i]) {
                result++;
                i++;
            }
            if (i == tLength) {
                break;
            }
        }
        return result == sLength;
    }


    public static boolean isSub(String s, String t) {
        int i = s.length();
        int j = t.length();
        int a = 0;
        int b = 0;
        while (a < i && b < j) {
            if (s.charAt(a) == t.charAt(b)) {
                a++;
                b++;
            } else {
                b++;
            }
        }
        System.out.println(a);
        return a == i;
    }
}

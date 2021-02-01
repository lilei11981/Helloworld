package com.company.algorithm.hw;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lilei
 * @date 2021/2/1 9:19 下午
 * @apiNote 给出两个字符串 S 和 T，要求在O(n)的时间复杂度内在 S 中找出最短的包含 T 中所有字符的子串。
 * 例如：
 * <p>
 * S ="XDOYEZODEYXNZ"
 * T ="XYZ"
 * 找出的最短子串为"YXNZ"
 * <p>
 * 注意：
 * 如果 S 中没有包含 T 中所有字符的子串，返回空字符串 “”；
 * 满足条件的子串可能有很多，但是题目保证满足条件的最短的子串唯一。
 */

public class Test58 {

    public static void main(String[] args) {
        System.out.println(minWindow("XDOYEZODEYXNZ", "XYZZ"));
    }

    /**
     * @param S string字符串
     * @param T string字符串
     * @return string字符串
     */
    public static String minWindow(String S, String T) {
        String result = "";
        if (S == null || T == null) {
            return result;
        }
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int min = Integer.MAX_VALUE;
        int count = 0;
        char[] chars = T.toCharArray();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) >= 0) {
                    count++;
                }
                while (count == T.length()) {
                    char leftChar = S.charAt(left);
                    if (map.containsKey(leftChar)) {
                        if (i - left + 1 < min) {
                            min = i - left + 1;
                            result = S.substring(left, i + 1);
                        }
                        map.put(leftChar, map.get(leftChar) + 1);
                        if (map.get(leftChar) > 0) {
                            count--;
                        }
                    }
                    left++;
                }
            }
        }
        return result;
    }

//    public static String minWindow(String S, String T) {
//        if (S == null || T == null || S.length() < T.length()) {
//            return "";
//        }
//        // write code here
//        char[] chars = T.toCharArray();
//        Map<Character,Integer> map = new HashMap<>();
//        for (char c : chars) {
//            if (!map.containsKey(c)) {
//                map.put(c, 0);
//            } else {
//                map.put(c, map.get(c) + 1);
//            }
//        }
//
//        int minLeft = 0;
//        int minLen = S.length() + 1;
//        int count = 0;
//        int left = 0;
//        for (int i = 0; i < S.length(); i++) {
//            char c =  S.charAt(i);
//            if (map.containsKey(c)) {
//                if (map.get(c) > 0) {
//                    count++;
//                }
//                map.put(c, map.get(c) - 1);
//            }
//            while (count == T.length()) {
//                if (i - left + 1 < minLen) {
//                    minLeft = left;
//                    minLen = i - left + 1;
//                }
//                c = S.charAt(left);
//                if (map.containsKey(c)) {
//                    map.put(c, map.get(c) + 1);
//                    if (map.get(c) > 0) {
//                        count++;
//                    }
//                }
//                left++;
//            }
//        }
//
//        if (minLen > S.length()) {
//            return "";
//        }
//        return S.substring(minLeft, minLeft + minLen);
//    }



}

package com.company.zoo.aac;

import java.util.HashMap;

/**
 * @author lilei
 * @date 2021-10-10 下午8:46
 * @apiNote
 */

public class Demo14 {
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(getLength(s));
    }

    public static int getLength(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        int left = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(s.charAt(i))) {
                int num = map.get(s.charAt(i));
                left = Math.max(left, num + 1);
            }
            map.put(s.charAt(i), i);
            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}

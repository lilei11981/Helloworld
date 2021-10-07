package com.company.algorithm.nc;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lilei
 * @date 2021-10-07 上午11:29
 * @apiNote
 */

public class NC041 {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        char[] cc = s.toCharArray();
        Queue<Character> queue = new LinkedList<>();
        int length = cc.length;
        int result = 0;
        for (int i = 0; i < length; i++) {
            while (queue.contains(cc[i])) {
                queue.poll();
            }
            queue.add(cc[i]);
            result = Math.max(result, queue.size());
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("au"));
        System.out.println(lengthOfLongestSubstring("aab"));


    }
}

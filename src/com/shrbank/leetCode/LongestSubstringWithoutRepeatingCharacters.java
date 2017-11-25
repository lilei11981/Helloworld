package com.shrbank.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lilei on 2017/11/24 下午11:44.
 *
 * Given s string, find the length of the longest substring without repeating characters.
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc",
 * which the length is 3.
 * For "bbbbb", the longest substring is "b", with the length of 1.
 *
 * 题目大意：
 * 给定一个字符串，找出最大非重复子串
 *
 * 解题思路：
 * 用 start 记录字符串的开始位置
 * 遍历字符串，当 start 记录的字符已经出现过的时候，子串开始位置 +1 ，否则更新 map 值中的Hash值为当前位置
 */
public class LongestSubstringWithoutRepeatingCharacters {

    // 可以处理所有的 UTF-8 字符
    public int lengthOfLongestSubstring(String s) {

        // 字符输入不合法
        if (s == null) {
            return 0;
        }

        int start = 0;
        int result = 0;

        Map<Character, Integer> map = new HashMap<>(s.length());

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch) && map.get(ch) >= start) {
                start = map.get(ch) + 1;
            } else {
                result = Math.max(result, i - start + 1);
            }

            map.put(ch, i);
        }

        return result;
    }

    public int lengthOfLongestSubstring2(String s) {
        if (s == null) {
            return 0;
        }

        int[] appear = new int[256];
        Arrays.fill(appear, -1);
        int start = 0;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (appear[s.charAt(i)] >= start) {
                start = i + 1;
            } else {
                result = Math.max(result, i - start + 1);
            }
            appear[s.charAt(i)] = i;
        }

        return result;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters string = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(string.lengthOfLongestSubstring("abcdabc"));
    }
}

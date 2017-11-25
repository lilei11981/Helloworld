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

        // 当前处理的开始位置
        int start = 0;
        // 保存结果
        int result = 0;

        // 访问标记，记录最新一次访问的字符和位置
        Map<Character, Integer> map = new HashMap<>(s.length());

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 如果字符已经出现过（在标记开始位置算起），就重新标记 start
            if (map.containsKey(ch) && map.get(ch) >= start) {
                start = map.get(ch) + 1;
            } else {
                // 如果没有出现过，就求最大的非重复子串的长度
                result = Math.max(result, i - start + 1);
            }

            // 更新访问记录
            map.put(ch, i);
        }

        return result;
    }


    // 只考虑 ASCII 字符
    public int lengthOfLongestSubstring2(String s) {

        // 字符输入不合法
        if (s == null) {
            return 0;
        }

        // 标记字符是否出现过，并且记录最新一次访问的元素的位置
        int[] appear = new int[256];
        // 初始化为 -1
        Arrays.fill(appear, -1);
        // 当前处理的开始位置
        int start = 0;
        // 保存结果
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            // 如果字符已经出现过（在标记开始位置算起），就重新标记 start
            if (appear[s.charAt(i)] >= start) {
                start = i + 1;
            } else {
                // 如果没有出现过，就求最大的非重复子串的长度
                result = Math.max(result, i - start + 1);
            }
            // 标记第 i 个字符已经被访问过（最新是第 i 个位置）
            appear[s.charAt(i)] = i;
        }

        return result;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters string = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(string.lengthOfLongestSubstring("abcdabc"));
    }
}

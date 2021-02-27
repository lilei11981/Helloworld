package com.company.algorithm.leetcode;

import java.util.HashSet;

/**
 * @author lilei
 * @date 2021-02-27 下午4:15
 * @apiNote 1044. 最长重复子串
 *
 * 给出一个字符串 S，考虑其所有重复子串（S 的连续子串，出现两次或多次，可能会有重叠）。
 *
 * 返回任何具有最长可能长度的重复子串。（如果 S 不含重复子串，那么答案为 ""。）
 *
 *  
 *
 * 示例 1：
 *
 * 输入："banana"
 * 输出："ana"
 * 示例 2：
 *
 * 输入："abcd"
 * 输出：""
 *  
 *
 * 提示：
 *
 * 2 <= S.length <= 10^5
 * S 由小写英文字母组成。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-duplicate-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class LC1044_LongestDupSubstring {


    public static void main(String[] args) {
        System.out.println(longestDupSubstring("banana"));
    }

    public static String longestDupSubstring(String s) {
        int n = s.length();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = (int) s.charAt(i) - (int) 'a';
        }
        int a = 26;
        long modules = (long) Math.pow(2, 32);
        int left = 1;
        int right = n;
        int L;
        while (left != right) {
            L = left + (right - left) / 2;
            if (search(L, a, modules, n, nums) != -1) {
                left = L + 1;
            } else {
                right = L;
            }
        }
        int start = search(left - 1, a, modules, n, nums);
        return start != -1 ? s.substring(start, start + left - 1) : "";
    }

    private static int search(int L, int a, long modules, int n, int[] nums) {
        long h = 0;
        for (int i = 0; i < L; i++) {
            h = (h * a + nums[i]) % modules;
        }

        HashSet<Long> seen = new HashSet<>();
        long aL = 1;
        for (int start = 1; start < n - L + 1; start++) {
            h = (h * a - nums[start - 1] * aL % modules + modules) % modules;
            h = (h + nums[start + L - 1]) % modules;
            if (seen.contains(h)) {
                return start;
            }
            seen.add(h);
        }
        return -1;
    }
}

package com.company.algorithm.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author lilei
 * @date 2021-02-03 下午3:41
 * @apiNote 输入一个字符串, 按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则按字典序打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */

public class Test71 {

    public static void main(String[] args) {
        System.out.println(Permutation("11122"));
    }

    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return result;
        }
        HashSet<String> set = new HashSet<>();
        char[] chars = str.toCharArray();
        dealWith(set, chars, 0);
        result.addAll(set);
        Collections.sort(result);
        return result;
    }

    private static void dealWith(HashSet<String> set, char[] chars, int k) {
        if (k == chars.length) {
            set.add(new String(chars));
            return;
        }
        for (int i = k; i < chars.length; i++) {
            swap(chars, i, k);
            dealWith(set, chars, k + 1);
            swap(chars, i, k);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        if (i != j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
    }
}

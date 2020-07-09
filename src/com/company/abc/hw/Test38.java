package com.company.abc.hw;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilei
 * @time 2019-06-09 16:51
 * @description 求两个字符串的最长公共子串，若有长度相等的公共子串，返回第一次出现的。子串指至少两个字符，单个字母不算子串。
 * 若公共子串长度相等，返回第一次出现的。
 */

public class Test38 {
    public static void main(String[] args) {
        String s1 = "kqabcdexyz";
        String s2 = "ababckyabcdyyybcde";
        System.out.println(getStr(s1, s2, true));
    }

    //第三个参数表示是否允许短的字符串本身作为子串
    public static String getStr(String s1, String s2, boolean isSelf) {
        String shortStr = s1.length() > s2.length() ? s2 : s1;
        String longStr = s1.length() > s2.length() ? s1 : s2;
        int shortLen = shortStr.length();
        List<String> list = new ArrayList<String>();
        //公共子串的最长长度。这样可以保证是公共子串但是长度比已出现的公共子串短的时就不用再加入list里面了。
        int maxStrLen = 0;
        String temp = "";
        for (int i = 0; i < shortLen; i++) {
            for (int j = i + 2; j < shortLen; j++) {
                temp = shortStr.substring(i, j);
                boolean b1 = isSelf && longStr.indexOf(temp) != -1;
                boolean b2 = !isSelf && !temp.equals(shortStr) && longStr.indexOf(temp) != -1;
                if ((b1 || b2) && temp.length() >= maxStrLen) {
                    list.add(temp);
                    maxStrLen = temp.length();
                }
            }
        }
        System.out.println(list);
        int maxLen = list.get(0).length();
        int maxIndex = 0;
        for (int k = 1; k < list.size(); k++) {
            if (list.get(k).length() > maxLen) {
                maxLen = list.get(k).length();
                maxIndex = k;
            }
        }
        return list.get(maxIndex);
    }
}

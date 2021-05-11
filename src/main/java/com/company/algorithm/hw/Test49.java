package com.company.algorithm.hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lilei
 * @date 2021-02-01 上午10:28
 * @apiNote 一个字符串最大不重复子串长度
 */

public class Test49 {

    public static int getNum(String s) {
        if (s == null) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxNum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                start = Math.max(map.get(c) + 1, start);
            }
            map.put(c, i);
            maxNum = Math.max((i - start + 1), maxNum);
        }

        return maxNum;
    }


    public static int getNum1(String s) {
        if (s == null) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();//map集合用来记录已经遍历过的字符
        int start = 0;//每个子串开始的下标
        int maxLen = 0;// 记录最长不重复的子串长度
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {//第i个字符已经遍历过
                //之所以取最大值，是避免不在当前子串，但是已经遍历过在map中存在的字符
                start = Math.max(map.get(s.charAt(i)) + 1, start);// 如果重复位置大于start则需要更新start,若小于则不用
            }
            map.put(s.charAt(i), i);//将遍历过的字符存放在map集合中
            maxLen = Math.max((i - start + 1), maxLen);//获取最大的子串长度

        }
        System.out.println(map);
        return maxLen;
    }

    public static int getNum2(String s) {
        int n = s.length(), maxNum = 0;
        int[] index = new int[128];
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            maxNum = Math.max(maxNum, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return maxNum;
    }


    public static int getNum3(String s) {
        char[] a = s.toCharArray();
        List<Character> list = new ArrayList<>();
        if (a.length == 0) {
            return 0;
        } else {
            int num = 1;
            for (int j = 0; j < a.length; j++) {
                for (int i = j; i < a.length; i++) {
                    if (!list.contains(a[i])) list.add(a[i]);
                    else {
                        if (list.size() >= num) {
                            num = list.size();
                            //System.out.println(list.size());
                        }
                        list.clear();
                        break;
                    }
                }
            }
            return num;
        }
    }

    public static int getNum4(String s) {
        if (s == null) {
            return 0;
        }
        //定义一个比对结果字符串
        StringBuilder result = new StringBuilder();
        //最大长度
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            //判断result是否包含当前字符
            if (result.toString().contains(String.valueOf(s.charAt(i)))) {
                //获取到当前字符在结果集的位置
                int index = result.indexOf(String.valueOf(s.charAt(i)));
                //如果 总字符串存在两个相邻且相等的字符串
                if (result.length() > 1 && s.charAt(i - 1) == s.charAt(i)) {
                    //刷新当前字符串
                    result = new StringBuilder(String.valueOf(s.charAt(i)));
                }
                //需要将result去掉重复的字符以前的所有字符（包含当前字符），并将当前字符在result字符后面追加，保证自己是不相同的字符
                if (result.length() > 1) {
                    result = new StringBuilder(result.substring(index + 1) + s.charAt(i));
                }
            } else {
                result.append(s.charAt(i));
            }
            if (result.length() > maxLen) {
                maxLen = result.length();
            }

        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(getNum4("123415"));
    }


    public static int getNum5(String s) {
        int start = 0;//初始位置
        int end = 0;//结束位置
        int result = 0;//最终长度
        Map<String, Integer> map = new HashMap<>();//存放
        //循环检索每一个字符，放入map中记录一下当前字符的位置，便于移动初始指针
        for (int i = 0; i < s.length(); i++) {
            //获取当前字符
            String cur = String.valueOf(s.charAt(i));
            //判断是否map是否含有数据，如果存在数据则移动初始指针
            if (map.containsKey(cur)) {
                //如果map中存放字符的位置小于当前初始指针位置，则不动当前指针，反之亦然
                if (map.get(cur) > start) {
                    start = map.get(cur);
                }
            }
            //结束指针始终移动
            end = i + 1;
            //取最大数
            if (result < end - start) {
                result = end - start;
            }
            //将当前字符的位置+1,便于下次重复的时候，初始指针的位置在初始指针的字符的下一个字符上
            map.put(String.valueOf(s.charAt(i)), i + 1);
        }
        System.out.println(s.substring(start, end));
        return result;
    }


    private static int getNum6(String s) {
        if (s == null) {
            return 0;
        }
        int start = 0;
        int end = 0;
        int maxNum = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c) && map.get(c) > start) {
                start = map.get(c);
            }
            end = i + 1;
            if (maxNum < end - start) {
                maxNum = end - start;
            }
            map.put(c, i + 1);
        }
        return maxNum;
    }


}

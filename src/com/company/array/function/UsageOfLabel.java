package com.company.array.function;

/**
 * Created by lilei on 2017/7/24 下午4:45.
 * Java 中的标签是为循环设计的，是为了在多重循环中方便地使用break和continue
 */

public class UsageOfLabel {
    public static void main(String[] args) {
        String stringSearch = "This is the string in which you have to search for a string.";
        String substring = "substring";
        boolean found = false;
        int max = stringSearch.length() - substring.length();      // 设置循环次数
        label:
        for (int i = 0; i <= max; i++) {
            int length = substring.length();             //   长度为字符串的长度
            int j = i;
            int k = 0;
            while (length-- != 0) {                // 判断字符串长度并依次减小，如果为0，则跳出
                if (stringSearch.charAt(j++) != substring.charAt(k++)) {      // 判断子串，如果不相同，则跳出，如果相同则继续执行
                    continue label;
                }
            }
            found = true;
//            break label;
        }

        if (found) {
            System.out.println("发现子字符串！");
        } else {
            System.out.println("没有发现子串！");
        }
    }
}

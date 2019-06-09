package com.company.string;

/**
 * Created by lilei on 2017/7/11.
 * 通过字符串函数compareTo(string),compareToIgnoreCase(String)及compareTo(object string)来比较两个字符串，并比较两个字符串中第一个字母的ASCII的差值
 */
public class StringCompare {
    public static void main(String[] args) {
        String str = "Hello World";
        String anotherString = "hello world";
        Object object = str;

        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString));  // 忽略字母大小写
        System.out.println(str.compareTo(object.toString()));
    }
}

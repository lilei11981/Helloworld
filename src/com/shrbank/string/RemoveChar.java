package com.shrbank.string;

/**
 * Created by lilei on 2017/7/12.
 * 通过字符串函数substring()函数来删除字符串的一个字符，将功能封装在removeCharAt()函数中
 */
public class RemoveChar {
    public static void main(String[] args) {
        String str = "this is the Wall";
        System.out.println(removeCharAt(str, 12));
    }

    private static String removeCharAt(String s, int pos) {
        return s.substring(0,pos) + s.substring(pos + 1);
    }
}

package com.lilei1998.string;

/**
 * Created by lilei on 2017/8/12 下午1:18.
 * 使用 String 类中的 indexOf() 方法在字符串中查找字符串出现的位置
 * 如果存在，则返回字符串的位置（第一位为0）
 * 如果不存在，则返回-1
 */

public class StringSearch {
    public static void main(String[] args) {
        String string = "Jon Sansa Bran Arya";
        int index = string.indexOf("Sansa");
        if (index == -1) {
            System.out.println("没有找到字符串 Sansa");
        } else {
            System.out.println("Sansa 字符串位置 " + index);
        }
    }
}

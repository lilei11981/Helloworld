package com.shrbank.string;

/**
 * Created by lilei on 2017/7/12.
 * 使用lastIndexOf(StringName)来查找字符串StringName出现的位置
 */
public class SearchLastString {
    public static void main(String[] args) {
        String strOrig = "Hello Winterfell, Hello Sansa";
        int lastIndex = strOrig.lastIndexOf("Sansa");
        if (lastIndex == -1) {
            System.out.println("没有找到字符串 Runoob");
        } else {
            System.out.println("字符串最后出现的位置：" + lastIndex);
        }
    }
}

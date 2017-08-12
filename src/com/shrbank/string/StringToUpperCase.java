package com.shrbank.string;

/**
 * Created by lilei on 2017/8/12 下午1:41.
 * 使用 String 类 toUpperCase()方法将字符串从小写转为大写
 */

public class StringToUpperCase {
    public static void main(String[] args) {
        String string = "game of thrones";
        String stringUpper = string.toUpperCase();
        System.out.println("原始字符串：" + string);
        System.out.println("转换为大写：" + stringUpper);
    }
}

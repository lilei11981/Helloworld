package com.lilei1998.string;

/**
 * Created by lilei on 2017/8/12 下午1:13.
 * 使用 Java 的反转函数 reverse()将字符串反转
 */
public class StringReverse {
    public static void main(String[] args) {
        String string = "Hello Sansa!";

        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("字符反转前：" + string);
        System.out.println("字符反转后：" + reverse);
    }
}

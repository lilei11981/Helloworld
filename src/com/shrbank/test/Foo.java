package com.shrbank.test;

/**
 * Created by lilei on 2017/11/1 下午3:29.
 */
public class Foo {
    public static void main(String[] args) {
        String s = "s";
        System.out.println("s = " + s);
        String string = "HELLO WORLD!";
        System.out.println(string.length());
        StringBuffer stringBuffer = new StringBuffer("hello world!");
        System.out.println(stringBuffer.reverse());
        StringBuffer reverse = stringBuffer.reverse();
        StringBuffer reverseTwice = reverse.reverse();
        System.out.println(reverseTwice);

    }
}

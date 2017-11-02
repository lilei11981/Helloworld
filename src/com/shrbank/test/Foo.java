package com.shrbank.test;

/**
 * Created by lilei on 2017/11/1 下午3:29.
 */
public class Foo {
    public static void main(String[] args) {
        String string = "HELLO WORLD!";
        System.out.println(string.length());
        StringBuffer stringBuffer = new StringBuffer("hello world!");
        StringBuffer reverse = stringBuffer.reverse();
        System.out.println(reverse);
        StringBuffer reverseTwice = reverse.reverse();
        System.out.println(reverseTwice);
        System.out.println(reverseTwice.delete(0, 6));
    }
}

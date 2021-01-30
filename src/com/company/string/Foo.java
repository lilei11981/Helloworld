package com.company.string;

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
        System.out.println(stringBuffer);
        System.out.println(reverse);
        System.out.println(reverseTwice);
        System.out.println(reverse.insert(3, 2));
        System.out.println(reverse.replace(0, 7, "hello world"));
        System.out.println(reverse.charAt(8));
        reverse.ensureCapacity(20);
        char[] chars = new char[20];
        reverse.getChars(0, 5, chars, 10);
        System.out.println(chars.length);
        System.out.println(reverse);
        System.out.println(reverse.indexOf("world"));
        System.out.println(reverse.length());

    }
}

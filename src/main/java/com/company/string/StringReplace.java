package com.company.string;

/**
 * Created by lilei on 2017/7/12.
 * 使用String类的replace()方法来替换字符串中的字符
 */
public class StringReplace {
    public static void main(String[] args) {
        String str = "Hello Sansa!";
        System.out.println(str);

        System.out.println(str.replace('H', 'W'));
        System.out.println(str.replace("He", "Wa"));
        System.out.println(str.replace("He", "Ha"));

        System.out.println(str.replace("Sansa", "Jon"));
    }
}

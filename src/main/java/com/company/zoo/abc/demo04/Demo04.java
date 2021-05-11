package com.company.zoo.abc.demo04;

import java.util.HashSet;

/**
 * @author lilei
 * @date 2020-06-28 14:21
 * @apiNote
 */

public class Demo04 {
    public static void main(String[] args) {
        String a = "abc";
        a = "bcd";
        System.out.println(a);
        System.out.println("============================");

        char[] b = {'a', 'b', 'c'};
        String c = new String(b);
        System.out.println(c);
        System.out.println("============================");

        String d = "abc";
        String e = d;
        System.out.println(d);
        System.out.println(e);
        d = "cde";
        System.out.println(d);
        System.out.println(e);
        System.out.println("============================");


        StringBuilder stringBuilder1 = new StringBuilder("abc");
        StringBuilder stringBuilder2 = stringBuilder1;
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);
        stringBuilder1.append("d");
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);

        System.out.println("============================");

        HashSet<String> set = new HashSet<String>();
        set.add(new String("a"));
        set.add(new String("b"));
        set.add(new String("c"));

        for (String f : set) {
            System.out.println(f);
        }

        System.out.println("============================");


    }
}

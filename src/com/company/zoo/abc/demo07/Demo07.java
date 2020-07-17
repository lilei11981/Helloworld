package com.company.zoo.abc.demo07;

/**
 * @author lilei
 * @date 2020-06-28 16:49
 * @apiNote
 */

public class Demo07 {
    public static void main(String[] args) {
        String a = "a";
        final String b = "a";
        System.out.println(a == b);
        a = "b";
        System.out.println(a == b);
    }
}

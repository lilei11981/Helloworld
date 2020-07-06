package com.company.recursion;

/**
 * @author lilei
 * @date 2020-07-04 17:04
 * @apiNote
 */

public class Main01 {
    public static void main(String[] args) {
        a(1);
    }

    private static void a(int i) {
        System.out.println(i);
        if (i == 20000) {
            return;
        } else {
            a(++i);
        }
    }
}

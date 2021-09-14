package com.company.zoo.aaa.demo;

/**
 * @author lilei
 * @date 2021-09-11 上午12:58
 * @apiNote
 */

public class Demo38 {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o);
        int a = System.identityHashCode(o);
        System.out.println(Integer.toHexString(a));

        Object b = new Object();
        System.out.println(b);
        int c = System.identityHashCode(b);
        System.out.println(Integer.toHexString(c));
    }
}

package com.company.basic.keyword.abstractclass.abstractdemo;

import java.util.regex.Pattern;

/**
 * Created by lilei on 2017/6/30.
 */
public abstract class AbstractDemo {
    // public static void main(String[] args) {
    //     Salary s = new Salary("arya", "winterfell", 14);
    //     Employee e = new Salary("Sansa", "Winterfell", 15);
    //     s.mailCheck();
    //     e.mailCheck();
    // }

    // abstract void method();

    public static void main(String[] args) {
        // int a = 0;
        // int c = 0;
        // do {
        //     c--;
        //     a = a-1;
        // } while (a > 0);
        // System.out.println(c);

        // int a = 0;
        // int b = a;
        // if (a > 1 && ++a > 0) {
        //     b++;
        // }
        // if (b > 1 && ++b > 0) {
        //     b--;
        // }
        // System.out.println(a);
        // System.out.println(b);

        // System.out.println("5" + 2);

        // String s;
        //         // System.out.println("s = " + s);


        // PriorityQueue queue;

        Pattern pattern = Pattern.compile(".*?(?==\\()");
        System.out.println(pattern.matcher("1234567(((((").toString());
    }
}

abstract class Son extends AbstractDemo {

}
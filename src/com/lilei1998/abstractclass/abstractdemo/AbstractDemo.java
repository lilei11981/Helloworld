package com.lilei1998.abstractclass.abstractdemo;

/**
 * Created by lilei on 2017/6/30.
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Salary s = new Salary("arya", "winterfell", 14);
        Employee e = new Salary("Sansa", "Winterfell", 15);
        s.mailCheck();
        e.mailCheck();
    }
}
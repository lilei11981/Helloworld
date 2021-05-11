package com.company.java8;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-11-19
 * Time: 2:00 PM
 * Description:
 * Java8新特性 方法引用
 */

public class MethodReferences {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");
        names.forEach(System.out::println);
    }
}

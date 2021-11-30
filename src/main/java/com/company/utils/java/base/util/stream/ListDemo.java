package com.company.utils.java.base.util.stream;

import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        String[] strings = {"abb", "abcd", "fegc", "efe", "adfes"};
        maxLength(Arrays.asList(strings));
    }

    public static void maxLength(List<String> list) {
        System.out.println(list.stream().filter(s -> s.startsWith("a")).mapToInt(ListDemo::length).max().orElse(0));
    }

    private static int length(String a) {
        System.out.println("the length of " + a + " : " + a.length());
        return a.length();
    }
}

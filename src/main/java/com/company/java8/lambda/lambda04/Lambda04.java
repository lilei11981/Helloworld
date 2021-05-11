package com.company.java8.lambda.lambda04;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lilei
 * @date 2020-07-05 17:04
 * @apiNote
 */

public class Lambda04 {
    public static void main(String[] args) {
        String[] strings = {"12321", "238902183902", "38291392", "12"};
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(Arrays.toString(strings));
    }
}

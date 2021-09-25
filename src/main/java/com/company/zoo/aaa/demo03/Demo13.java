package com.company.zoo.aaa.demo03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author lilei
 * @date 2021-09-22 下午11:43
 * @apiNote
 */

public class Demo13 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        System.out.println(arrayList);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        String a = "我";
        String b = "是";
        System.out.println(a.compareTo(b));

        System.out.println("abc".compareTo("abcd"));
        System.out.println(String.valueOf(123));
        System.out.println(Integer.valueOf(123));

    }
}

package com.shrbank.datastructure;

import java.util.LinkedList;

/**
 * Created by lilei on 2017/7/13.
 */
public class LinkedListClear {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        System.out.println(list);
        list.subList(3, 5).clear();
        System.out.println(list);
    }
}

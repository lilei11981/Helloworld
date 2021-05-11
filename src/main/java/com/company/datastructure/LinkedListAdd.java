package com.company.datastructure;

import java.util.LinkedList;

/**
 * Created by lilei on 2017/7/13.
 * 使用LinkedList类的addFirst()和addLast()方法在链表的开头和结尾添加元素
 * // * 使用clear()方法来删除链表中的元素
 */
public class LinkedListAdd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list);
        list.addFirst("0");
        System.out.println(list);
        list.addLast("6");
        System.out.println(list);
//        list.subList(3, 5).clear();
//        System.out.println(list);
    }
}

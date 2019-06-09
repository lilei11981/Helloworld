package com.company.datastructure;

import java.util.LinkedList;

/**
 * Created by lilei on 2017/7/13.
 * 使用LinkedList类的getFirst()和getLast()方法来获取链表中的第一个和最后一个元素
 */
public class LinkedListGet {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("5");
        list.add("7");
        System.out.println("链表中的第一个元素为：" + list.getFirst());
        System.out.println("链表中的最后一个元素：" + list.getLast());
    }
}

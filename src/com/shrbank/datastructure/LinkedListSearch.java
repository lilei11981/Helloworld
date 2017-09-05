package com.shrbank.datastructure;

import java.util.LinkedList;

/**
 * Created by lilei on 2017/9/5 下午3:18.
 */
public class LinkedListSearch {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");
        linkedList.add("2");
        System.out.println(linkedList);
        System.out.println("元素 2 第一次出现的位置：" + linkedList.indexOf("2"));
        System.out.println("元素 2 最后一次出现的位置：" + linkedList.lastIndexOf("2"));
    }
}

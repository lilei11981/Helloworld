package com.shrbank.datastructure;

import java.util.LinkedList;

/**
 * Created by lilei on 2017/7/13.
 * 使用add()和set()方法来修改链接的元素
 */
public class LinkedListSet {
    public static void main(String[] args) {
        LinkedList<String> jon = new LinkedList<>();
        jon.add("A");
        jon.add("B");
        jon.add("c");
        jon.add("D");
        jon.add("E");
        System.out.println(jon);
        jon.set(2,"C");
        System.out.println(jon);
    }
}

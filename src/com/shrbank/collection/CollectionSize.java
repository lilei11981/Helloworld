package com.shrbank.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by lilei on 2017/7/13.
 */
public class CollectionSize {
    public static void main(String[] args) {
        System.out.println("集合实例！");
        int size;
        HashSet<String> collection = new HashSet<>();
        String str1 = "yellow", str2 = "white", str3 = "green", str4 = "blue";
        Iterator<String> iterator;
        collection.add(str1);
        collection.add(str2);
        collection.add(str3);
        collection.add(str4);
        System.out.print("集合数据：");
        iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        size = collection.size();
        if (collection.isEmpty()) {
            System.out.println("集合是空的！");
        } else {
            System.out.println("集合长度：" + size);
        }
        System.out.println();
    }
}

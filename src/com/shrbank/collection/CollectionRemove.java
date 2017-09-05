package com.shrbank.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by lilei on 2017/9/5 下午4:45.
 */
public class CollectionRemove {
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
        collection.remove(str2);
        System.out.println("删除之后 [" + str2 + "]");
        System.out.print("现在的集合数据：");
        iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        size = collection.size();
        System.out.println("集合大小：" + size);
    }
}

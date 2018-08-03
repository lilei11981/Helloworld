package com.lilei1998.collection;

import java.util.*;

/**
 * Created by lilei on 2017/7/13.
 * 1. Set和List都是Collection的子类
 * 2. Set不能重复，而List可以重复
 * 3. Set的顺序是固定的，
 */
public class CollectionListSetTraversal {
    public static void main(String[] args) {
        setTest();     // Set 集合的遍历
        listTest();    // List 集合的遍历
    }

    private static void setTest() {
        Set<String> set = new HashSet<>();  // 使用Set集合遍历
        set.add("B");
        set.add("A");
        set.add("D");
        set.add("A");     // 重复数据添加失败
        set.add("E");
        set.add("C");

        Iterator<String> it = set.iterator();   // 使用iterator遍历Set集合
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }

        System.out.println("----------------");

        for (String s : set) {        // 使用foreach语句遍历Set集合
            System.out.println(s);
        }
    }

    private static void listTest() {
        List<String> list = new ArrayList<>(); // 使用List集合遍历
        list.add("a");
        list.add("c");
        list.add("a");   // 可以重复添加数据
        list.add("e");
        list.add("b");

        System.out.println("--------------");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }

        System.out.println("------------");

        for (int i = 0, size = list.size(); i < size; i++) {
            String value = list.get(i);
            System.out.println(value);
        }

        System.out.println("------------");

        for (String s : list) {
            System.out.println(s);
        }
    }
}

package com.company.datastructure.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by lilei on 2017/9/5 下午4:31.
 */
public class CollectionReverse {
    public static void main(String[] args) {
        String[] abc = {"A", "B", "C", "D", "E"};
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(abc));
        ListIterator listIterator = list.listIterator();
        System.out.println("反转前：");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        Collections.reverse(list);
        listIterator = list.listIterator();
        System.out.println("反转后：");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}

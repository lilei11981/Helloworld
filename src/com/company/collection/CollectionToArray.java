package com.company.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lilei on 2017/9/5 下午7:13.
 */
public class CollectionToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        String[] strings = list.toArray(new String[0]);
        for (int i = 0; i < strings.length; i++) {
            String contents = strings[i];
            System.out.print(contents);
        }
    }
}

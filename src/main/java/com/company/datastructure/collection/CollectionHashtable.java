package com.company.datastructure.collection;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by lilei on 2017/9/5 下午7:29.
 */
public class CollectionHashtable {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        hashtable.put("1", "One");
        hashtable.put("2", "Two");
        hashtable.put("3", "Three");
        Enumeration<String> enumeration = hashtable.keys();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}

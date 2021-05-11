package com.company.datastructure.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by lilei on 2017/9/6 上午9:48.
 */
public class CollectionAddElements {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        displayAll(linkedList);
        List<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        displayAll(arrayList);
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        displayAll(hashSet);
        SortedSet<String> treeSet = new TreeSet<>();
        treeSet.add("X");
        treeSet.add("Y");
        treeSet.add("Z");
        treeSet.add("W");
        displayAll(treeSet);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("x");
        linkedHashSet.add("y");
        linkedHashSet.add("z");
        linkedHashSet.add("w");
        displayAll(linkedHashSet);
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("4", "Four");
        displayAll(map.keySet());
        displayAll(map.values());
        SortedMap<String, String> sortedMap = new TreeMap<>();
        sortedMap.put("1", "East");
        sortedMap.put("2", "South");
        sortedMap.put("3", "West");
        sortedMap.put("4", "North");
        displayAll(sortedMap.keySet());
        displayAll(sortedMap.values());
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("1", "King");
        linkedHashMap.put("2", "Queen");
        linkedHashMap.put("3", "Lord");
        linkedHashMap.put("4", "Lady");
        displayAll(linkedHashMap.keySet());
        displayAll(linkedHashMap.values());
    }

    private static void displayAll(Collection<String> collection) {
        for (String string : collection) {
            System.out.print(string + " ");
        }
        System.out.println();
    }
}

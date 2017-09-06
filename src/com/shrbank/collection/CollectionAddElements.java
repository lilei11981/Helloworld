package com.shrbank.collection;

import java.util.*;

/**
 * Created by lilei on 2017/9/6 上午9:48.
 */
public class CollectionAddElements {
    public static void main(String[] args) {
        List linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        displayAll(linkedList);
        List arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        displayAll(arrayList);
        Set hashSet = new HashSet();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        displayAll(hashSet);
        SortedSet treeSet = new TreeSet();
        treeSet.add("X");
        treeSet.add("Y");
        treeSet.add("Z");
        treeSet.add("W");
        displayAll(treeSet);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("x");
        linkedHashSet.add("y");
        linkedHashSet.add("z");
        linkedHashSet.add("w");
        displayAll(linkedHashSet);
        Map map = new HashMap();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("4", "Four");
        displayAll(map.keySet());
        displayAll(map.values());
        SortedMap sortedMap = new TreeMap();
        sortedMap.put("1", "East");
        sortedMap.put("2", "South");
        sortedMap.put("3", "West");
        sortedMap.put("4", "North");
        displayAll(sortedMap.keySet());
        displayAll(sortedMap.values());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("1", "King");
        linkedHashMap.put("2", "Queen");
        linkedHashMap.put("3", "Lord");
        linkedHashMap.put("4", "Lady");
        displayAll(linkedHashMap.keySet());
        displayAll(linkedHashMap.values());
    }

    public static void displayAll(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            String string = (String) iterator.next();
            System.out.print(string + " ");
        }
        System.out.println();
    }
}

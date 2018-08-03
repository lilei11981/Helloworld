package com.lilei1998.collection;

import java.util.TreeMap;

/**
 * Created by lilei on 2017/9/5 下午5:20.
 */
public class CollectionOutput {
    public static void main(String[] args) {
        System.out.println("TreeMap 实例！");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Sunday");
        treeMap.put(2, "Monday");
        treeMap.put(3, "Tuesday");
        treeMap.put(4, "Wednesday");
        treeMap.put(5, "Thursday");
        treeMap.put(6, "Friday");
        treeMap.put(7, "Saturday");
        System.out.println("TreeMap 键：" + treeMap.keySet());
        System.out.println("TreeMap 值：" + treeMap.values());
        System.out.println("键为 5 的值为：" + treeMap.get(5));
        System.out.println("第一个键 " + treeMap.firstKey() + " 的值为 " + treeMap.get(treeMap.firstKey()));
        System.out.println("最后一个键 " + treeMap.lastKey() + " 的值为 " + treeMap.get(treeMap.lastKey()));
        System.out.println("移除第一个数据：" + treeMap.remove(treeMap.firstKey()));
        System.out.println("现在 TreeMap 键为：" + treeMap.keySet());
        System.out.println("现在 TreeMap 值为：" + treeMap.values());
        System.out.println("移除最后一个数据：" + treeMap.remove(treeMap.lastKey()));
        System.out.println("现在 TreeMap 键为：" + treeMap.keySet());
        System.out.println("现在 TreeMap 值为：" + treeMap.values());
    }
}

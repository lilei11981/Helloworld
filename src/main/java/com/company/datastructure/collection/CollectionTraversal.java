package com.company.datastructure.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by lilei on 2017/7/13.
 * 使用Collection类的iterator()方法来遍历集合
 */
public class CollectionTraversal {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "1st");
        hashMap.put("2", "2nd");
        hashMap.put("3", "3rd");
        Collection collection = hashMap.values();      // 把hashMap值放入collection集合中
        for (Object aCollection : collection) {        // 使用 foreach 来遍历集合
            System.out.println(aCollection);
        }
        System.out.println("---------------");
        Iterator iterator = collection.iterator();     // 使用iterator()方法来遍历集合
        while (iterator.hasNext()) {                   // 如果下一项存在，则输出下一项
            System.out.println(iterator.next());
        }
    }
}

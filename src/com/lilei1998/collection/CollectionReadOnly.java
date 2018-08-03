package com.lilei1998.collection;


import java.util.*;

/**
 * Created by lilei on 2017/9/5 下午4:54.
 */
public class CollectionReadOnly {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "b");
        List<String> list2 = new ArrayList<>(list1);
        list2 = Collections.unmodifiableList(list2);
        try {
            list2.set(0, "new value");
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
        Set<String> set = new HashSet<>(list1);
        set = Collections.unmodifiableSet(set);
        Map map = new HashMap();
        map = Collections.unmodifiableMap(map);
        System.out.println(list2);
        System.out.println(set);
        System.out.println(map);
        System.out.println("集合现在是只读");
    }
}

package com.shrbank.datastructure;

import java.util.Collections;
import java.util.Vector;

/**
 * Created by lilei on 2017/7/13.
 */
public class VectorIndex {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("D");
        v.add("E");
        v.add("A");
        v.add("C");
        v.add("B");
        Collections.sort(v);
        System.out.println(v);
        int index = Collections.binarySearch(v, "A");
        System.out.println("元素索引值为：" + index);
    }
}

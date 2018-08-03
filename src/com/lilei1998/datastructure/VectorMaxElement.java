package com.lilei1998.datastructure;

import java.util.Collections;
import java.util.Vector;

/**
 * Created by lilei on 2017/7/13.
 * 使用Vector类的v.add()方法和Collection类的Collections.max()方法来获取向量的最大值
 */
public class VectorMaxElement {
    public static void main(String[] args) {
        Vector<Double> v = new Vector<>();
        v.add(3.14);
        v.add(2.7);
        v.add(1.414);
        v.add(1.73);
        Object obj = Collections.max(v);
        System.out.println("最大元素是：" + obj);
    }
}

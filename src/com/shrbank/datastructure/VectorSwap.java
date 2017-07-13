package com.shrbank.datastructure;

import java.util.Collections;
import java.util.Vector;

/**
 * Created by lilei on 2017/7/13.
 * 使用swap()函数来旋转向量
 */
public class VectorSwap {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");
        v.add("5");
        System.out.println(v);
        Collections.swap(v,1,3);
        System.out.println("旋转后：");
        System.out.println(v);
    }
}

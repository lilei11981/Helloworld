package com.company.datastructure.array;

import java.util.ArrayList;

/**
 * Created by lilei on 2017/9/1 下午5:51.
 */
public class ArraySearch {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList1.add(0, "A");
        arrayList1.add(1, "B");
        arrayList1.add(2, "C");
        arrayList2.add(0, "A");
        arrayList2.add(1, "B");
        arrayList2.add(2, "C");
        arrayList2.add(3, "D");
        System.out.println("arrayList1 中的元素：" + arrayList1);
        System.out.println("arrayList2 中的元素：" + arrayList2);
        System.out.println("arrayList1 是否包含字符串 A ? " + arrayList1.contains("A"));
        System.out.println("arrayList2 是否包含数组 arrayList1 ? " + arrayList2.contains(arrayList1));
    }
}

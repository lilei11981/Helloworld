package com.shrbank.array;

import java.util.ArrayList;

/**
 * Created by lilei on 2017/9/1 下午5:34.
 */
public class ArrayDiff {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList1.add(0, "A");
        arrayList1.add(1, "B");
        arrayList1.add(2, "C");
        arrayList2.add(0, "A");
        arrayList2.add(1, "B");
        arrayList2.add(2, "C");
        arrayList2.add(3, "D");
        System.out.println("arrayList1 中的元素：" + arrayList1);
        System.out.println("arrayList2 中的元素：" + arrayList2);
        arrayList1.removeAll(arrayList2);
        System.out.println("arrayList1 与 arrayList2 的差值：" + arrayList1);
    }
}

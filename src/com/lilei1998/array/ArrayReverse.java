package com.lilei1998.array;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by lilei on 2017/9/1 下午4:23.
 */
public class ArrayReverse {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("反转前排序：" + arrayList);
        Collections.reverse(arrayList);
        System.out.println("反转后排序：" + arrayList);
    }
}

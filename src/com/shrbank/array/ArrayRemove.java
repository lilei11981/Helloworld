package com.shrbank.array;

import java.util.ArrayList;

/**
 * Created by lilei on 2017/9/1 下午5:27.
 *
 */
public class ArrayRemove {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList = new ArrayList<>();  // 使用范型
        arrayList.add(0, "第 0 个元素");
        arrayList.add(1, "第 1 个元素");
        arrayList.add(2, "第 2 个元素");
        System.out.println("数组删除元素前：" + arrayList);
//        arrayList.clear();  //当执行clear()方法时， 会执行循环将arrayList中每一个坐标都设置为为null， 并设置数组的size为0。
        arrayList.remove(1);
        System.out.println("数组删除元素后：" + arrayList);
    }
}

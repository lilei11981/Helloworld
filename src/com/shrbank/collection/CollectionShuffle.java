package com.shrbank.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lilei on 2017/7/13.
 * 使用Collections类的shuffle()方法来打乱集合元素的顺序
 */
public class CollectionShuffle {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Integer(i));
        }
        System.out.println("打乱前：");
        System.out.println(list);

        for (int i = 1; i < 6; i++) {
            System.out.println("第 " + i + " 次打乱：");
            Collections.shuffle(list);
            System.out.println(list);
        }
    }
}

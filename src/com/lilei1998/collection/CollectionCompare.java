package com.lilei1998.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by lilei on 2017/7/13.
 * 将字符串转换为集合，并使用Collection类的min()和max()方法比较集合中的元素
 */
public class CollectionCompare {
    public static void main(String[] args) {
        String[] coins = {"Penny", "nickel", "dime", "Quarter", "dollar"};
        Set<String> set = new TreeSet<>();
        Collections.addAll(set, coins);
        System.out.println(Collections.min(set));        //  不忽略大小写，首字母ASCII值最小为P，最大为n； 忽略大小写，最小为d，最大为Q
        System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));
        for (int i = 0; i <= 10; i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.println(Collections.max(set));
        System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));
    }
}

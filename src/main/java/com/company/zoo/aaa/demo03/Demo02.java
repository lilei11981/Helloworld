package com.company.zoo.aaa.demo03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilei
 * @date 2021-09-13 下午10:23
 * @apiNote
 */

public class Demo02 {

    public static void main(String[] args) {
//        Object a = 1;
//        Object b = "1";
//        Object[] objects = {a, b};
//        Arrays.sort(objects);

        int n = 10;
        List<List<Integer>> lists = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            lists.add(null);
        }
        System.out.println(lists.size());
        System.out.println(lists.get(9));

    }
}

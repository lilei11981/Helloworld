package com.lilei1998.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by lilei on 2017/9/6 上午11:09.
 */
public class CollectionSubList {
    public static void main(String[] args) {
        List list = Arrays.asList("One Two Three Four Five Six One Two Three Four".split(" "));
        System.out.println("List: " + list);
        List subList = Arrays.asList("Three Four".split(" "));
        System.out.println("SubList：" + subList);
        System.out.println("indexOfSubList: " + Collections.indexOfSubList(list, subList));
        System.out.println("lastIndexOfSubList: " + Collections.lastIndexOfSubList(list, subList));
    }
}

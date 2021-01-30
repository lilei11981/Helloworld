package com.company.datastructure.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by lilei on 2017/9/5 下午7:23.
 */
public class CollectionMost {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One Two Three Four Five Six Seven Eight Nine Ten".split(" "));
        System.out.println(list);
        System.out.println("首字母最大值：" + Collections.max(list));
        System.out.println("首字母最小值：" + Collections.min(list));
    }
}

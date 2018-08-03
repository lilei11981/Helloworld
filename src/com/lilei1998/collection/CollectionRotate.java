package com.lilei1998.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by lilei on 2017/9/5 下午7:19.
 */
public class CollectionRotate {
    public static void main(String[] args) {
        List list = Arrays.asList("one two three four five six seven eight nine ten".split(" "));
        System.out.println("List: " + list);
        Collections.rotate(list, 3);
        System.out.println("Rotate: " + list);
    }
}

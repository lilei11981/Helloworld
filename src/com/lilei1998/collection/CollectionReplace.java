package com.lilei1998.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by lilei on 2017/9/6 上午11:00.
 */
public class CollectionReplace {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("King Queen Prince Princess Lord Lady Knight".split(" "));
        System.out.println("List: " + list);
        Collections.replaceAll(list, "Lord", "Hand");
        System.out.println("ReplaceAll: " + list);
    }
}

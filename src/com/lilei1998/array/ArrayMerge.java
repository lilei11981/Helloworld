package com.lilei1998.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lilei on 2017/9/1 下午4:52.
 */
public class ArrayMerge {
    public static void main(String[] args) {
        String a[] = {"A", "B", "C"};
        String b[] = {"D", "E", "F"};
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
    }
}

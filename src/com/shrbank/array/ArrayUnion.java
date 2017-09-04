package com.shrbank.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lilei on 2017/9/1 下午6:10.
 */
public class ArrayUnion {
    public static void main(String[] args) {
        String[] array1 = {"1", "2", "3"};
        String[] array2 = {"3", "4", "5"};
        String[] resultUnion = union(array1, array2);

        System.out.println("数组并集的结果如下：");
        for (String string : resultUnion) {
            System.out.println(string);
        }
    }

    public static String[] union(String[] array1, String[] array2) {
        Set<String> set = new HashSet<>();
        for (String string : array1) {
            set.add(string);
        }

        for (String string : array2) {
            set.add(string);
        }

        String[] result = {};
        return set.toArray(result);
    }
}

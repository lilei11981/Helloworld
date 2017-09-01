package com.shrbank.array;

import java.util.Arrays;

/**
 * Created by lilei on 2017/9/1 下午6:02.
 */
public class ArrayEquals {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4, 5, 6};
        int[] array3 = {1, 2, 3, 4};
        System.out.println("数组 array1 是否与数组 array2 相等？" + Arrays.equals(array1, array2));
        System.out.println("数组 array1 是否与数组 array3 相等？" + Arrays.equals(array1, array3));
    }
}

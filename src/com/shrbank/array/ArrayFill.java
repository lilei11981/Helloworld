package com.shrbank.array;

import java.util.Arrays;

/**
 * Created by lilei on 2017/9/1 下午4:57.
 */
public class ArrayFill {
    public static void main(String[] args) {
        int array[] = new int[6];
        Arrays.fill(array, 100);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        Arrays.fill(array, 3, 6, 50);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

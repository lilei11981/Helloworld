package com.company.zoo.aaa.demo03;

import java.util.Arrays;

/**
 * @author lilei
 * @date 2021-09-25 下午3:07
 * @apiNote
 */

public class Demo15 {
    public static void main(String[] args) {
        int[] arr = {8, 1, 4, 2, 6, 5, 3, 9, 0};
        System.out.println(Arrays.toString(arr));
        new Thread(() -> Arrays.sort(arr)).start();
        new Thread(() -> Arrays.sort(arr)).start();
        new Thread(() -> Arrays.sort(arr)).start();
        new Thread(() -> Arrays.sort(arr)).start();
        new Thread(() -> Arrays.sort(arr)).start();
        System.out.println(Arrays.toString(arr));
    }
}

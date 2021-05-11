package com.company.zoo.abc.demo06;

/**
 * @author lilei
 * @date 2020-06-28 16:16
 * @apiNote
 */

public class CallByValue02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] array) {
        // 将数组的第一个元素变为0
        array[0] = 0;
    }
}

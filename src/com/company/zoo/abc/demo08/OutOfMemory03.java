package com.company.zoo.abc.demo08;

/**
 * @author lilei
 * @date 2020-06-29 18:09
 * @apiNote 有效果
 */

public class OutOfMemory03 {
    public static void main(String[] args) {
        int[] a = new int[Integer.MAX_VALUE - 1];
    }
}

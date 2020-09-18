package com.company.zoo.aaa.demo;

import java.util.HashMap;

/**
 * @author lilei
 * @date 2020-07-02 14:43
 * @apiNote
 */

public class Demo03 {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 32; i++) {
            map.put(i, i);
        }
        System.out.println(map);
    }
}

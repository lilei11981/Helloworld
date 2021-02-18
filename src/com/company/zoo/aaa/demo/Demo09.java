package com.company.zoo.aaa.demo;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lilei
 * @date 2021-02-18 下午4:18
 * @apiNote
 */

public class Demo09 {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 32; i > 0; i--) {
            map.put(i, i);
        }
        System.out.println(map);
    }
}

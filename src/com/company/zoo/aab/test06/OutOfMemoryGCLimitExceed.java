package com.company.zoo.aab.test06;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author lilei
 * @date 2020-10-28 17:44
 * @apiNote
 */

public class OutOfMemoryGCLimitExceed {

    public static void addRandomDataToMap() {
        Map<Integer, String> dataMap = new HashMap<>();
        Random r = new Random();
        while (true) {
            dataMap.put(r.nextInt(), String.valueOf(r.nextInt()));
        }
    }

    public static void main(String[] args) {
        addRandomDataToMap();
    }
}

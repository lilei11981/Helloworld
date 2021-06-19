package com.company.zoo.aac;

import java.util.HashMap;

/**
 * @author lilei
 * @date 2021-06-19 上午9:22
 * @apiNote
 */

public class Demo07 {

    private static final HashMap<String, String> firstHashMap = new HashMap<>();

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 300; i++) {
                    firstHashMap.put(String.valueOf(i), String.valueOf(i));
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 300; i++) {
                    firstHashMap.put(String.valueOf(i + 300), String.valueOf(i + 300));
                }
            }
        };
        t1.start();
        t2.start();
        // SleepUtil.sleepSeconds(1);
        // for (int i = 0; i < 600; i++) {
        //     if (String.valueOf(i).equals(firstHashMap.get(String.valueOf(i)))) {
        //         System.out.println(String.valueOf(i) + ":" + firstHashMap.get(String.valueOf(i)));
        //         System.out.println(firstHashMap.size());
        //     }
        // }


    }

}

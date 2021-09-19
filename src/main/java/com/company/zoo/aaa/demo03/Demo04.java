package com.company.zoo.aaa.demo03;

import java.util.HashMap;
import java.util.UUID;

/**
 * @author lilei
 * @date 2021-09-18 下午11:47
 * @apiNote
 */

public class Demo04 {
    public static void main(String[] args) {
        final HashMap<String, String> map = new HashMap<String, String>(2);
        for (int i = 0; i < 100000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    map.put(UUID.randomUUID().toString(), "");
                }
            }).start();
        }
    }
}

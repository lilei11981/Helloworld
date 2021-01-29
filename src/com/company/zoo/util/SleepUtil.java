package com.company.zoo.util;

/**
 * @author lilei
 * @date 2021-01-29 下午12:24
 * @apiNote
 */

public class SleepUtil {

    public static void sleepSeconds(int num) {
        try {
            Thread.sleep(num * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

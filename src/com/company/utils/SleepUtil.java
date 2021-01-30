package com.company.utils;

/**
 * @author lilei
 * @date 2021-01-29 下午12:24
 * @apiNote
 */

public class SleepUtil {

    public static void sleepSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.company.pattern.create.singleton.classic;

import com.company.utils.SleepUtil;

/**
 * @author lilei
 * @date 2021-05-05 下午4:25
 * @apiNote NOTE: This is not thread safe!
 */

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            SleepUtil.sleepSeconds(1);
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a classic Singleton!";
    }
}

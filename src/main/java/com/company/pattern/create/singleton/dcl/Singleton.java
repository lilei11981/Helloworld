package com.company.pattern.create.singleton.dcl;

import com.company.utils.SleepUtil;

/**
 * @author lilei
 * @date 2021-05-05 下午4:30
 * @apiNote
 */

public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    SleepUtil.sleepSeconds(1);
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}

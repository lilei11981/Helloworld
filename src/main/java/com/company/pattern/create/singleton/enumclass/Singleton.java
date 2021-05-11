package com.company.pattern.create.singleton.enumclass;

/**
 * @author lilei
 * @date 2021-05-05 下午4:45
 * @apiNote
 */

public enum Singleton {
    UNIQUE_INSTANCE;

    public static Singleton getInstance() {
        return UNIQUE_INSTANCE;
    }
}

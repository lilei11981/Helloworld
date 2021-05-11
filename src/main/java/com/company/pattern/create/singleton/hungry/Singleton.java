package com.company.pattern.create.singleton.hungry;

/**
 * @author lilei
 * @date 2021-05-05 下午4:37
 * @apiNote 饿汉式，线程安全
 */

public class Singleton {
    private static final Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}

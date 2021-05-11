package com.company.pattern.create.singleton.subclass;

/**
 * @author lilei
 * @date 2021-05-05 下午4:49
 * @apiNote 内部类方式，线程安全，懒加载
 */

public class Singleton {

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static Singleton instance = new Singleton();
    }
}

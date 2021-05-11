package com.company.pattern.create.singleton.lazy;

/**
 * @author lilei
 * @date 2021-05-05 下午4:41
 * @apiNote 懒汉式，性能较差
 */

public class Singleton {
    private static volatile Singleton instance = null;    //保证 instance 在所有线程中同步

    private Singleton() {
    }    //private 避免类在外部被实例化

    public static synchronized Singleton getInstance() {
        //getInstance 方法前加同步
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

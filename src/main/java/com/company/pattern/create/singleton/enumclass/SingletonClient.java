package com.company.pattern.create.singleton.enumclass;

/**
 * @author lilei
 * @date 2021-05-05 下午4:47
 * @apiNote
 */

public class SingletonClient {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Singleton singleton = Singleton.getInstance();
                System.out.println(System.identityHashCode(singleton));
            }).start();
        }
    }
}

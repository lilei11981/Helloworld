package com.company.utils.pattern.singleton;

/**
 * @author lilei
 * @date 2020-11-25 16:48
 * @apiNote 还没使用就创建对象，浪费空间
 */

public class SingleObject01 {

    private static SingleObject01 INSTANCE = new SingleObject01();

    private SingleObject01() {
    }

    public static SingleObject01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(System.identityHashCode(getInstance()));
                }
            }).start();
        }
    }
}

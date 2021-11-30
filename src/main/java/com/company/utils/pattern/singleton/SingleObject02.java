package com.company.utils.pattern.singleton;

/**
 * @author lilei
 * @date 2020-11-25 16:54
 * @apiNote 单例模式，线程不安全
 */

public class SingleObject02 {

    private static SingleObject02 INSTANCE;

    private SingleObject02() {
    }

    public static SingleObject02 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new SingleObject02();
        }
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

package com.company.utils.pattern.singleton;

/**
 * @author lilei
 * @date 2020-11-25 17:18
 * @apiNote 双重检查
 */

public class SingleObject04 {

    private static volatile SingleObject04 INSTANCE;

    private SingleObject04() {
    }

    public static SingleObject04 getInstance() {

        if (INSTANCE == null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (SingleObject04.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingleObject04();
                }
            }
        }

        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " " + System.identityHashCode(getInstance()));
                }
            }).start();
        }
    }
}

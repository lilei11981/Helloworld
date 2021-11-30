package com.company.utils.pattern.singleton;

/**
 * @author lilei
 * @date 2020-11-25 17:00
 * @apiNote 使用 synchronized 给整个方法上锁，性能较低
 */

public class SingleObject03 {

    private static SingleObject03 INSTANCE;

    private SingleObject03() {
    }

    private static synchronized SingleObject03 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new SingleObject03();
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

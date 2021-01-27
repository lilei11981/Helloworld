package com.company.zoo.aab.test10;

/**
 * @author lilei
 * @date 2021-01-27 下午8:36
 * @apiNote
 */

public class Main {

    public static void main(String[] args) {

        Demo01 demo01 = new Demo01();

        new Thread(Demo01::method03).start();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            demo01.method08();
        }).start();

    }
}

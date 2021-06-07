package com.company.thread.multithread.multiways.demo01;

/**
 * @author lilei
 * @date 2021-06-06 下午9:38
 * @apiNote
 */

public class Demo02 {

    public static void main(String[] args) {


        for (int i = 0; i < 100000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    getNum();
                }
            }).start();
        }


    }


    private static void getNum() {

    }
}

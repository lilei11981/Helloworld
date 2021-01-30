package com.company.zoo.aaa.demo;

import com.company.utils.SleepUtil;

/**
 * @author lilei
 * @date 2021-01-29 下午12:16
 * @apiNote
 */

public class Demo28 {

    volatile boolean running = true;

    public static void main(String[] args) {

        Demo28 demo28 = new Demo28();
        new Thread(demo28::method).start();

        SleepUtil.sleepSeconds(1);

        demo28.running = false;


    }

    void method() {
        System.out.println("start");
        while (running) {

        }
        System.out.println("end");
    }
}

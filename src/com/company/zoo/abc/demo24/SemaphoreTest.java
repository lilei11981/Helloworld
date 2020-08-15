package com.company.zoo.abc.demo24;

/**
 * @author lilei
 * @date 2020-08-14 19:09
 * @apiNote
 */

public class SemaphoreTest {
    public static void main(String[] args) {
        SemaphoreService service = new SemaphoreService();
        for (int i = 0; i < 10; i++) {
            MyThread t = new MyThread("thread" + (i + 1), service);
            t.start();
        }
    }
}

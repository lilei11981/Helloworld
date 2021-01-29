package com.company.zoo.aaa.demo;

/**
 * @author lilei
 * @date 2021-01-29 下午12:28
 * @apiNote
 */

public class Demo29 {

    volatile static int x, y, a, b;

    public static void main(String[] args) throws Exception {
        int i = 0;
        for (; ; ) {
            i++;
            x = 0;
            y = 0;
            a = 0;
            b = 0;

            Thread one = new Thread(() -> {
                a = 1;
                x = b;
            });

            Thread two = new Thread(() -> {
                b = 1;
                y = a;
            });

            one.start();
            two.start();
            one.join();
            two.join();
            if (x == 0 && y == 0) {
                System.out.println("第" + i + "次");
                break;
            }
        }
    }
}

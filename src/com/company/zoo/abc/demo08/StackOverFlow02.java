package com.company.zoo.abc.demo08;

/**
 * @author lilei
 * @date 2020-06-29 18:16
 * @apiNote 没效果
 */

public class StackOverFlow02 {
    public static void main(String[] args) {
        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(123);
                }
            }).start();
        }
    }
}

package com.company.zoo.aaa.demo;

/**
 * @author lilei
 * @date 2020-07-24 13:38
 * @apiNote
 */

public class Demo15 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("外循环 " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("内循环 " + j);
                if (j == 5) {
                    break;
                }
            }

        }
    }
}

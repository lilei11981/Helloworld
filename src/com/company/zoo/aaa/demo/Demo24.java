package com.company.zoo.aaa.demo;

/**
 * @author lilei
 * @date 2021-01-20 下午5:03
 * @apiNote
 */

public class Demo24 {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i == 50) {
                throw new RuntimeException("运行时异常");
            }
            System.out.println(i);
        }
    }
}

package com.company.zoo.abc.demo08;

/**
 * @author lilei
 * @date 2020-06-29 18:12
 * @apiNote 有效果
 */

public class StackOverFlow01 {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        method();
    }
}

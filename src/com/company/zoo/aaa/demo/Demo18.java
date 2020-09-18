package com.company.zoo.aaa.demo;

/**
 * @author lilei
 * @date 2020-08-13 14:42
 * @apiNote
 */

public class Demo18 {

    public static void main(String[] args) {
        Demo18 demo18 = new Demo18();
        try {
            demo18.method();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void method() throws RuntimeException {
        throw new RuntimeException("new exception");
    }
}

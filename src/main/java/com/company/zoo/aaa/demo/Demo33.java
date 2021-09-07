package com.company.zoo.aaa.demo;

/**
 * @author lilei
 * @date 2021-08-23 下午11:16
 * @apiNote
 */

public class Demo33 {

    public static void main(String[] args) throws Exception {
        System.out.println(method1());
    }

    static int method1() throws Exception {
        method2();
        try {
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return 1;
        }
    }

    static void method2() throws Exception {
        throw new Exception("1");
    }
}

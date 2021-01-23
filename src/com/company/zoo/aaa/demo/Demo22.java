package com.company.zoo.aaa.demo;

/**
 * @author lilei
 * @date 2020-12-27 下午4:15
 * @apiNote -Xss160k
 */

public class Demo22 {
    private int stackLength = 1;

    public static void main(String[] args) {
        Demo22 demo22 = new Demo22();
        try {
            demo22.stackLeak();
        } catch (Exception e) {
            System.out.println(demo22.stackLength);
//            e.printStackTrace();
        }
    }

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }
}

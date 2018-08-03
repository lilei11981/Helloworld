package com.lilei1998.test.anonymousInternalClass;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2017-12-01
 * Time: 下午5:17
 * Description:
 * Thread类的匿名内部类实现
 */

public class Demo4 {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.print(i + " ");
                }
            }
        };
        thread.start();
    }
}

package com.company.innerclass.anonymousInternalClass;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2017-12-01
 * Time: 下午5:22
 * Description:
 * Runnable 接口的匿名内部类实现
 */

public class Demo5 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.print(i + " ");
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}

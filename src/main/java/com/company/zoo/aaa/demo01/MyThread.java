package com.company.zoo.aaa.demo01;

/**
 * @author lilei
 * @date 2021-09-11 下午10:18
 * @apiNote
 */

public class MyThread extends OtherClass implements Runnable {
    public static void main(String[] args) {
        //启动 MyThread，需要首先实例化一个 Thread，并传入自己的 MyThread 实例：
        Runnable myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
    }

    public void run() {
        System.out.println("MyThread.run()");
    }
}




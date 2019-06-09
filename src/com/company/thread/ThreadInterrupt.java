package com.company.thread;

import java.io.IOException;

/**
 * Created by lilei on 2017/9/6 下午5:25.
 */
public class ThreadInterrupt extends Thread {
    public static void main(String[] args) {
        Thread thread = new ThreadInterrupt();
        thread.start();
        System.out.println("在 50 秒内按任意键中断线程");
        try {
            System.in.read();
            thread.interrupt();
            thread.join();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
        System.out.println("线程已退出！");
    }

    @Override
    public void run() {
        try {
            sleep(50000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

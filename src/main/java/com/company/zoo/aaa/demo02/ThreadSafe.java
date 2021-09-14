package com.company.zoo.aaa.demo02;

/**
 * @author lilei
 * @date 2021-09-11 下午11:11
 * @apiNote
 */

public class ThreadSafe extends Thread {
    public static void main(String[] args) {
        ThreadSafe threadSafe = new ThreadSafe();
        threadSafe.start();
        threadSafe.interrupt();
    }

    public void run() {
        // 非阻塞过程中通过判断中断标志来退出
        while (!isInterrupted()) {
            // 阻塞过程捕获中断异常来退出
            try {
                Thread.sleep(5 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                //捕获到异常之后，执行 break 跳出循环
                break;
            }
        }
    }
}

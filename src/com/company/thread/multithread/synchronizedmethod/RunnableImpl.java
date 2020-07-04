package com.company.thread.multithread.synchronizedmethod;

import java.util.Random;

/**
 * @author lilei
 * @date 2020-07-03 13:20
 * @apiNote
 */

public class RunnableImpl implements Runnable {
    private static int ticket = 100;

    Random random = new Random();

    @Override
    public void run() {
        while (true) {
            try {
                int time = random.nextInt(1000);
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
            sellTicket();
            if (ticket == 0) {
                return;
            }
        }
    }

    public synchronized void sellTicket() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "-->正在卖" + ticket + "张票");
            ticket--;
        }
    }
}

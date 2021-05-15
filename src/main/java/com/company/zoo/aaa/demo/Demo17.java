package com.company.zoo.aaa.demo;

import com.company.utils.SleepUtil;

/**
 * @author lilei
 * @date 2020-08-11 10:01
 * @apiNote
 */

public class Demo17 {

    private static final int N = 10;

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        for (int i = 0; i < N; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    SleepUtil.sleepSeconds(1);
                    System.out.println(ticket.getCount());
                }
            }).start();
        }
    }

    static class Ticket {
        private volatile Integer count = 1;

        public Integer getCount() {
            return count++;
        }
    }

}



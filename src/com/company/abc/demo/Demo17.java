package com.company.abc.demo;

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
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(ticket.getCount());
                }
            }).start();
        }
    }

}

class Ticket {
    private volatile Integer count = 1;

    public Integer getCount() {
        return count++;
    }
}

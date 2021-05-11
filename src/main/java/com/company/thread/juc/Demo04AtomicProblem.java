package com.company.thread.juc;

/**
 * @author lilei
 * @date 2020-08-23 17:14
 * @apiNote 1. i++的原子性问题
 * int temp = i;
 * i = i + 1;
 * i = temp;
 * 用volatile解决不了
 */

public class Demo04AtomicProblem {

    public static void main(String[] args) {
        AtomicDemo atomicDemo = new AtomicDemo();
        for (int i = 0; i < 10; i++) {
            new Thread(atomicDemo).start();
        }
    }

    static class AtomicDemo implements Runnable {

        private int num = 0;

        @Override
        public void run() {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }
            num++;
            System.out.println(num);
        }
    }
}

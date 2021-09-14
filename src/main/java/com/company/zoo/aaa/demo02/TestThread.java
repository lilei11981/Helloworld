package com.company.zoo.aaa.demo02;

/**
 * @author lilei
 * @date 2021-09-12 上午12:23
 * @apiNote
 */


public class TestThread {
    public static void main(String[] args) {
        final MyData data = new MyData();
        for (int i = 0; i < 2; i++) {
            new Thread(data::add).start();
            new Thread(data::dec).start();
        }
    }

    static class MyData {
        private int j = 0;

        public synchronized void add() {
            j++;
            System.out.println("线程" + Thread.currentThread().getName() + " j 为：" + j);
        }

        public synchronized void dec() {
            j--;
            System.out.println("线程" + Thread.currentThread().getName() + " j 为：" + j);
        }

        public int getData() {
            return j;
        }
    }
}


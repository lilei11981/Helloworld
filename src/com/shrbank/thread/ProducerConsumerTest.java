package com.shrbank.thread;

/**
 * Created by lilei on 2017/9/6 下午5:42.
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
         Cubbyhole cubbyhole = new Cubbyhole();
         Producer producer = new Producer(cubbyhole, 1);
         Consumer consumer = new Consumer(cubbyhole, 1);
         producer.start();
         consumer.start();
    }
}

class Cubbyhole {
    private int contents;
    private boolean available = false;
    synchronized int get() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        notifyAll();
        return contents;
    }

    synchronized void put(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        contents = value;
        available = true;
        notifyAll();
    }
}

class Consumer extends Thread {
    private Cubbyhole cubbyhole;
    private int number;
    Consumer(Cubbyhole cubbyhole, int number) {
        this.cubbyhole = cubbyhole;
        this.number = number;
    }

    @Override
    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = cubbyhole.get();
            System.out.println("消费者 #" + this.number + " get: " + value);
        }
    }
}

class Producer extends Thread {
    private Cubbyhole cubbyhole;
    private int number;
    Producer(Cubbyhole cubbyhole, int number) {
        this.cubbyhole = cubbyhole;
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            cubbyhole.put(i);
            System.out.println("生产者 #" + this.number + " put: " + i);
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

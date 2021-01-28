package com.company.zoo.aaa.hw;

/**
 * @author lilei
 * @date 2021-01-28 下午2:29
 * @apiNote 用数组实现队列
 */

public class Test42 {

    private String[] data;
    private int head;
    private int tail;
    private int count;

    public Test42(int size) {
        data = new String[size];
        head = 0;
        tail = 0;
        count = 0;
    }

    public static void main(String[] args) {
        Test42 test42 = new Test42(3);
        System.out.println(test42.enqueue("1"));
        System.out.println(test42.enqueue("2"));
        System.out.println(test42.dequeue());
        System.out.println(test42.dequeue());
        System.out.println(test42.dequeue());
        test42.printQueue();
    }

    public boolean enqueue(String s) {
        if (count == 0) {
            data[head] = s;
            count++;
            return true;
        } else if (count == data.length) {
            return false;
        } else {
            data[++tail % data.length] = s;
            count++;
            return true;
        }
    }

    public String dequeue() {
        if (count == 0) {
            return null;
        } else {
            String s = data[head];
            head = ++head % data.length;
            return s;
        }
    }

    public void printQueue() {
        for (int i = 0; i < count; i++) {
            System.out.println(data[(head + i) % data.length]);
        }
    }
}

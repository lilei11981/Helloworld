package com.company.zoo.aaa.hw;


import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 用队列实现栈
 */


public class Test32 {
    private Queue<Integer> queueIn;
    private Queue<Integer> queueOut;

    public Test32() {
        queueIn = new LinkedBlockingQueue<>();
        queueOut = new LinkedBlockingQueue<>();
    }

    public static void main(String[] args) {
        Test32 test32 = new Test32();
//        int a = test32.pop();
//        System.out.println(a);

        test32.push(1);
        test32.push(2);
        System.out.println("--------------");
//        System.out.println(test32.queueIn);
//        System.out.println(test32.queueOut);
        System.out.println(test32.empty());

        System.out.println(test32.pop());

        System.out.println("--------------");
//        System.out.println(test32.queueIn);
//        System.out.println(test32.queueOut);
        System.out.println(test32.empty());

        System.out.println(test32.top());

        System.out.println("--------------");
//        System.out.println(test32.queueIn);
//        System.out.println(test32.queueOut);
        System.out.println(test32.empty());

        System.out.println(test32.pop());
        System.out.println(test32.empty());
    }

    public void push(int x) {
        while (!queueOut.isEmpty()) {
            queueIn.add(queueOut.poll());
        }
        queueIn.add(x);
    }

    public Integer pop() {
        while (!queueOut.isEmpty()) {
            queueIn.add(queueOut.poll());
        }
        int length = queueIn.size();
        for (int i = 0; i < length - 1; i++) {
            queueOut.add(queueIn.poll());
        }
        return queueIn.poll();
    }

    public Integer top() {
        while (!queueOut.isEmpty()) {
            queueIn.add(queueOut.poll());
        }
        int length = queueIn.size();
        for (int i = 0; i < length - 1; i++) {
            queueOut.add(queueIn.poll());
        }
        Integer result = queueIn.peek();
        queueOut.add(queueIn.poll());
        return result;
    }

    public boolean empty() {
        return queueIn.isEmpty() && queueOut.isEmpty();
    }
}

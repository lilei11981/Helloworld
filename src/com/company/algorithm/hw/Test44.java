package com.company.algorithm.hw;

import java.util.Stack;

/**
 * @author lilei
 * @date 2021-01-28 下午3:22
 * @apiNote 使用栈实现队列的下列操作：
 * <p>
 * push(x) -- 将一个元素放入队列的尾部。
 * pop() -- 从队列首部移除元素。
 * peek() -- 返回队列首部的元素。
 * empty() -- 返回队列是否为空。
 */

public class Test44 {
    private Stack<Integer> stackIn;
    private Stack<Integer> stackOut;

    public Test44() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public static void main(String[] args) {
        Test44 test44 = new Test44();
        test44.push(1);
        test44.push(2);
        test44.push(3);
        System.out.println(test44.peek());
        System.out.println(test44.pop());
        System.out.println(test44.pop());
        System.out.println(test44.pop());
        System.out.println(test44.empty());
    }

    public void push(int x) {
        while (!stackOut.isEmpty()) {
            stackIn.push(stackOut.pop());
        }
        stackIn.push(x);
    }

    public int pop() {
        while (!stackIn.isEmpty()) {
            stackOut.push(stackIn.pop());
        }
        return stackOut.pop();
    }

    public int peek() {
        while (!stackIn.isEmpty()) {
            stackOut.push(stackIn.pop());
        }
        return stackOut.peek();
    }

    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
}

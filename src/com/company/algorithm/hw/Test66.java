package com.company.algorithm.hw;

import java.util.Stack;

/**
 * @author lilei
 * @date 2021/2/2 10:32 下午
 * @apiNote 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */

public class Test66 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.empty() && stack2.empty()) {
            throw new RuntimeException("队列为空");
        }
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Test66 test66 = new Test66();
        test66.push(1);
//        test66.push(2);
        System.out.println(test66.pop());
        System.out.println(test66.pop());
    }
}

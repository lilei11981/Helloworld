package com.company.algorithm.nc;

import java.util.Stack;

/**
 * @author lilei
 * @date 2021-10-07 上午11:10
 * @apiNote
 */

public class NC076 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public static void main(String[] args) {
        NC076 nc076 = new NC076();
        nc076.push(1);
        nc076.push(2);
        nc076.push(3);
        System.out.println(nc076.pop());
        System.out.println(nc076.pop());
        nc076.push(4);
        System.out.println(nc076.pop());
        nc076.push(5);
        System.out.println(nc076.pop());
        System.out.println(nc076.pop());
    }

    public void push(int node) {
        while (!stack2.isEmpty()) {
            stack1.add(stack2.pop());
        }
        stack1.add(node);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.add(stack1.pop());
        }
        return stack2.pop();
    }
}

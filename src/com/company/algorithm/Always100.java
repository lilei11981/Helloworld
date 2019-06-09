package com.company.algorithm;


/**
 * Created by lilei on 2017/8/21 上午9:31.
 * 编写一个在 1，2，…，9（顺序不能变）数字之间插入 + 或 - 或什么都不插入
 * 使得计算结果总是 100 的程序，并输出所有的可能性
 * 例如：1 + 2 + 34 – 5 + 67 – 8 + 9 = 100
 */

import java.util.Stack;

public class Always100 {
    private static int count = 0;
    private static int countSum = 0;

    private static void execute(int start, Stack<Integer> stack, int sum,
                                Stack<String> operate, final int N) {

        if (start == N) {
            if (sum == 100) {
                for (int i = 0; i < stack.size(); i++) {
                    System.out.print(stack.get(i));
                    if (i < operate.size()) {
                        System.out.print(" " + operate.get(i) + " ");
                    }
                }
                System.out.print(" = 100");
                System.out.println();
                count++;
            }
            countSum++;
            return;
        }

        int next = start + 1;

        // j == 0 代表两数之间相连，j == 1 代表加，j == 2 代表减；

        for (int j = 0; j < 3; j++) {

            if (j == 0) {
                int preInt = stack.pop();
                int current = preInt * 10 + next;
                stack.push(current);
                if (!operate.isEmpty() && operate.peek().equals("+")) {
                    sum = sum - preInt + current;
                } else if (!operate.isEmpty() && operate.peek().equals("-")) {
                    sum = sum + preInt - current;
                } else {
                    sum = sum - preInt + current;
                }
                execute(next, stack, sum, operate, N);
                // 现场还原
                int reback = stack.pop();
                int preBack = reback / 10;
                stack.push(preBack);
                if (!operate.isEmpty() && operate.peek().equals("+")) {
                    sum = sum - reback + preBack;
                } else if (!operate.isEmpty() && operate.peek().equals("-")) {
                    sum = sum + reback - preBack;
                } else {
                    sum = sum - reback + preBack;
                }

            } else if (j == 1) {
                sum = sum + next;
                operate.push("+");
                stack.push(next);
                execute(next, stack, sum, operate, N);
                operate.pop();
                int addNum = stack.pop();
                sum = sum - addNum;

            } else if (j == 2) {
                sum = sum - next;
                operate.push("-");
                stack.push(next);
                execute(next, stack, sum, operate, N);
                operate.pop();
                int decNum = stack.pop();
                sum = sum + decNum;
            }
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        execute(1, stack, 1, new Stack<String>(), 9);

        System.out.println(count);
        System.out.println(countSum);
    }
}

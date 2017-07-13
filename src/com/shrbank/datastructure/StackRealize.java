package com.shrbank.datastructure;

/**
 * Created by lilei on 2017/7/13.
 * 创建用于插入元素的自定义函数push()方法和用于弹出元素的pop()方法来实现栈
 */
public class StackRealize {
    private int maxSize;
    private long[] stackArray;
    private int top;
    private StackRealize(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    private void push(long i) {
        stackArray[++top] = i;
    }

    private long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    private boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        StackRealize theStack = new StackRealize(10);
        theStack.push(1);
        theStack.push(2);
        theStack.push(3);
        theStack.push(4);
        theStack.push(5);
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}

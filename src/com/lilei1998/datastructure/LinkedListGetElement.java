package com.lilei1998.datastructure;

import java.util.LinkedList;

/**
 * Created by lilei on 2017/7/13.
 * 使用push()和pop()方法来获取链表的元素
 */
public class LinkedListGetElement {
    private LinkedList list = new LinkedList();

    public static void main(String[] args) {
        LinkedListGetElement stack = new LinkedListGetElement();
        for (int i = 30; i <= 40; i++) {
            stack.push(new Integer(i));
        }
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    public void push(Object v) {
        list.addFirst(v);
    }

    public Object top() {
        return list.getFirst();
    }

    public Object pop() {
        return list.removeFirst();
    }
}

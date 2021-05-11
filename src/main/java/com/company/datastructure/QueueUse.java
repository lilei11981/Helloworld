package com.company.datastructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lilei on 2017/7/13.
 * 队列是一种特殊的线性表，它只允许在表的前端进行删除操作，而在表的后端进行插入操作
 * LinkedList类实现了Queue接口，因此我们可以把linkedList当成Queue来用
 * add()和remove()方法在失败的时候会抛出异常，不推荐使用
 */
public class QueueUse {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");           // 使用offer() 方法添加元素
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");
        for (String q : queue) {
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("poll = " + queue.poll());    // 返回第一个元素，并在队列中删除
        for (String q : queue) {
            System.out.println(q);
        }

        System.out.println("===");
        System.out.println("element = " + queue.element());   // 返回第一个元素
        for (String q : queue) {
            System.out.println(q);
        }

        System.out.println("===");
        System.out.println("peek = " + queue.peek());     // 返回第一个元素
        for (String q : queue) {
            System.out.println(q);
        }
    }
}

package com.company.zoo.aaa.hw;

/**
 * @author lilei
 * @date 2021-01-28 下午3:06
 * @apiNote 用链表实现队列
 */

public class Test43 {

    private Node head = null;
    private Node tail = null;
    private int size = 5;
    private int count = 0;

    public static void main(String[] args) {
        Test43 test43 = new Test43();
        System.out.println(test43.enqueue("1"));
        System.out.println(test43.enqueue("2"));
        System.out.println(test43.enqueue("3"));
        System.out.println(test43.enqueue("4"));
        System.out.println(test43.enqueue("4"));
        System.out.println(test43.enqueue("4"));

        System.out.println(test43.dequeue());
//        System.out.println(test43.getSize());
        System.out.println(test43.dequeue());
        System.out.println(test43.dequeue());
        System.out.println(test43.dequeue());
        System.out.println(test43.dequeue());
        System.out.println(test43.dequeue());


    }

    public boolean enqueue(String data) {
        if (count == size) {
            return false;
        }
        if (count == 0) {
            Node node = new Node(data, null);
            head = node;
            tail = node;
        } else {
            tail.next = new Node(data, null);
            tail = tail.next;
        }
        count++;
        return true;
    }

    public Node dequeue() {
        if (count == 0) {
            return null;
        } else {
            Node node = head;
            head = head.next;
            count--;
            return node;
        }
    }

    public int getSize() {
        return this.size;
    }

    public class Node {
        public String data;
        public Node next;

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data='" + data + '\'' +
                    ", next=" + next +
                    '}';
        }
    }
}

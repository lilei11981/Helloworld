package com.company.zoo.aaa.hw;

/**
 * @author lilei
 * @date 2021-01-28 下午4:02
 * @apiNote 基于链表实现的栈
 */

public class Test46 {

    private Node head;
    private int count;
    private int size;

    public Test46(int size) {
        this.size = size;
        head = null;
        count = 0;
    }

    public static void main(String[] args) {
        Test46 test46 = new Test46(3);
        System.out.println(test46.push("1"));
        System.out.println(test46.push("2"));
        System.out.println(test46.push("3"));
        System.out.println(test46.push("4"));

        System.out.println(test46.head);

        System.out.println(test46.pop());
        System.out.println(test46.pop());
        System.out.println(test46.pop());
        System.out.println(test46.pop());
    }

    public boolean push(String data) {
        if (count == size) {
            return false;
        } else if (count == 0) {
            head = new Node(data, null, null);
        } else {
            head.next = new Node(data, null, head);
            head = head.next;
        }
        count++;
        return true;
    }

    public Node pop() {
        if (count == 0) {
            return null;
        } else {
            Node data = head;
            head = head.pre;
            count--;
            return data;
        }
    }

    public class Node {
        public String data;
        public Node next;
        public Node pre;

        public Node(String data, Node next, Node pre) {
            this.data = data;
            this.next = next;
            this.pre = pre;
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

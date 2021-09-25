package com.company.zoo.aaa.demo03;

/**
 * @author lilei
 * @date 2021-09-21 上午11:36
 * @apiNote
 */

public class Demo09 {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        System.out.println(head);
        System.out.println(reverseNode(head));
    }

    private static Node reverseNode(Node head) {
        Node next;
        Node prev = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}

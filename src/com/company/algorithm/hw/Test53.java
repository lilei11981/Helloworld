package com.company.algorithm.hw;

import java.util.Stack;

/**
 * @author lilei
 * @date 2021-02-01 下午2:33
 * @apiNote 判断回文链表
 */

public class Test53 {
    public static boolean isPail(ListNode head) {
        // write code here
        if (head == null) {
            return true;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode listNode = head;
        while (listNode != null) {
            stack.add(listNode);
            listNode = listNode.next;
        }
        listNode = head;
        while (listNode != null) {
            if (listNode.val != stack.pop().val) {
                return false;
            }
            listNode = listNode.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.val = 1;
        listNode.next = new ListNode();
        listNode.next.val = 2;
        listNode.next.next = new ListNode();
        listNode.next.next.val = 1;
        System.out.println(listNode);

        System.out.println(isPail(listNode));
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}

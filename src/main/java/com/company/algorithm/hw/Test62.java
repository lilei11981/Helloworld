package com.company.algorithm.hw;

/**
 * @author lilei
 * @date 2021-02-02 下午1:19
 * @apiNote 反转链表
 */

public class Test62 {

    public static ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
            System.out.println(pre);
//            System.out.println(head);
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        System.out.println(head);
        head.next = new ListNode(2);
//        System.out.println(head);
        head.next.next = new ListNode(3);
//        System.out.println(head);
        head.next.next.next = new ListNode(4);

        System.out.println(ReverseList(head));
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}

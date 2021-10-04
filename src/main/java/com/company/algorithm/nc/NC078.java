package com.company.algorithm.nc;

/**
 * @author lilei
 * @date 2021-10-04 下午8:27
 * @apiNote
 */

public class NC078 {
    public static void main(String[] args) {

        ListNode head = new ListNode();
        // ListNode head = new ListNode(1);
        // head.next = new ListNode(2);
        // head.next.next = new ListNode(3);
        System.out.println(head);
        System.out.println(ReverseList(head));
    }

    public static ListNode ReverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode next;
        ListNode prev = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {

        }

        public ListNode(int val) {
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

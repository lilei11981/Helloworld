package com.company.zoo.aaa.hw;

/**
 * @author lilei
 * @date 2021-01-28 下午7:30
 * @apiNote 两数相加
 */

public class Test48 {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        System.out.println(l1);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        System.out.println(l2);

        Test48 test48 = new Test48();
        System.out.println(test48.addTwoNumber(l1, l2));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        int ten = 0;
        for (; l1 != null || l2 != null; l1 = l1 == null ? null : l1.next, l2 = l2 == null ? null : l2.next, result = result.next) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            result.next = new ListNode((val1 + val2 + ten) % 10);
            ten = (val1 + val2 + ten) / 10;
        }
        if (ten > 0) {
            result.next = new ListNode(ten);
        }
        return head.next;
    }

    public ListNode addTwoNumber(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = l1, q = l2, result = head;
        int ten = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = ten + x + y;
            ten = sum / 10;
            result.next = new ListNode(sum % 10);
            result = result.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (ten > 0) {
            result.next = new ListNode(ten);
        }
        return head.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
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

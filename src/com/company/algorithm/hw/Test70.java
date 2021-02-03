package com.company.algorithm.hw;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lilei
 * @date 2021-02-03 下午2:56
 * @apiNote 输入两个链表，找出它们的第一个公共结点。
 * （注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
 */

public class Test70 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        l1.next.next = l3;
        l2.next = l3;

        System.out.println(FindFirstCommonNode(l1, l2));
    }

    public static ListNode findNode(ListNode pHead1, ListNode pHead2) {
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        Map<ListNode, Integer> map = new HashMap<>();
        while (p1 != null) {
            map.put(p1, null);
            p1 = p1.next;
        }
        while (p2 != null) {
            if (map.containsKey(p2)) {
                return p2;
            }
            p2 = p2.next;
        }
        return null;
    }

    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1 != p2) {
            p1 = p1 == null ? pHead2 : p1.next;
            p2 = p2 == null ? pHead1 : p2.next;
        }
        return p1;
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

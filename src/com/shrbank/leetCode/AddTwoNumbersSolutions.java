package com.shrbank.leetCode;

import java.awt.*;

/**
 * Created by lilei on 2017/11/8 下午3:04.
 * 给你两个表示两个非负数字的链表。
 * 数字以相反的顺序存储，其节点包含单个数字。
 * 将这两个数字相加并将其作为一个链表返回。
 * 输入：(2 -> 4 -> 3) + (5 -> 6 ->4)
 * 输出：7 -> 0 -> 8
 */
public class AddTwoNumbersSolutions {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode listNode = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p3 = listNode;
        while (p1 != null || p2 != null) {
            if (p1 != null) {
                carry += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                carry += p2.val;
                p2 = p2.next;
            }
            p3.next = new ListNode(carry % 10);
            p3 = p3.next;
            carry /= 10;
        }
        if (carry == 1) {
            p3.next = new ListNode(1);
        }

        return listNode.next;
    }
}

class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }
}

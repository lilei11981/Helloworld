package com.company.algorithm.hw;

/**
 * @author lilei
 * @date 2021-02-04 下午2:15
 * @apiNote 给定一个单链表，请设定一个函数，将链表的奇数位节点和偶数位节点分别放在一起，重排后输出。
 * 注意是节点的编号而非节点的数值。
 * 1.双指针
 * 2.先保存奇数头节点和偶数头节点（避免引用中的属性发生变化）
 * 3.一个引用指向奇数节点，一个引用指向偶数节点，开始往后处理结点指向
 * 4.结束的条件是，偶数节点不为null且偶数节点的next不为null
 * 5.最后将偶数头节点挂到奇数链表尾节点
 */

public class Test79 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        System.out.println(oddEvenList(head));
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public static ListNode oddEvenList(ListNode head) {
        // write code here
        if (head == null || head.next == null) {
            return head;
        }
        ListNode evenNode = head.next;
        ListNode odd = head;
        ListNode even = head.next;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenNode;
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

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

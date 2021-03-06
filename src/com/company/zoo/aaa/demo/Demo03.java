package com.company.zoo.aaa.demo;

import java.util.*;

/**
 * @author lilei
 * @date 2020-07-02 14:43
 * @apiNote
 */

public class Demo03 {
//    public static void main(String[] args) {
//
//        HashMap<Integer, Integer> map = new HashMap<>();
////        for (int i = 0; i < 32; i++) {
////            map.put(i, i);
////        }
//
//        for (int i = 32; i > 0; i--) {
//            map.put(i, i);
//        }
//        System.out.println(map);
//    }


//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> lists = new ArrayList<>();
//        if (nums == null || nums.length < 3) {
//            return lists;
//        }
//        Arrays.sort(nums);
//        int length = nums.length;
//        for (int i = 0; i < length; i++) {
//            for (int j = i + 1; j < length; j++) {
//                for (int k = j + 1; k < length; k++) {
//                    List<Integer> list = new ArrayList<>();
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        list.add(nums[i]);
//                        list.add(nums[j]);
//                        list.add(nums[k]);
//                        lists.add(list);
//                    }
//                }
//            }
//        }
//        return lists;
//    }
//
//
//    public static void main(String[] args) {
//        int[] nums = {-1,0,1,2,-1,-4};
//        System.out.println(threeSum(nums));
//    }

//    public static void main(String[] args) {
//        System.out.println(climbStairs(6));
//    }
//
//    private static int climbStairs(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        int first = 1;
//        int second = 2;
//        for (int i = 3; i <= n; i++) {
//            second = first + second;
//            first = second - first;
//        }
//        return second;
//    }

//    public static int climbStairs(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        int[] result = new int[n + 1];
//        result[0] = 1;
//        result[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            result[i] = result[i - 1] + result[i - 2];
//        }
//        return result[n];
//    }

//    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        ListNode next = new ListNode(2);
//        head.next = next;
//        next.next = head;
//
////        ListNode head = new ListNode(3);
////        head.next = new ListNode(2);
////        head.next.next = head.next;
////        ListNode listNode1 = new ListNode(2);
////        ListNode listNode2 = new ListNode(0);
////        ListNode listNode3 = new ListNode(-4);
////        head.next = listNode1;
////        listNode1.next = listNode2;
////        listNode2.next = listNode3;
////        listNode3.next = listNode1;
//
//        System.out.println(hasCycle(head));
//    }

//    private static boolean hasCycle(ListNode head) {
//        if (head == null || head.next == null) {
//            return false;
//        }
//
//        ListNode slow = head;
//        ListNode fast = head.next;
//        while (slow != fast) {
//            if (fast == null || fast.next == null) {
//                return false;
//            }
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return true;
//    }

//    public static boolean hasCycle(ListNode head) {
//        Set<ListNode> set = new HashSet<>();
//        while (head != null) {
//            if (!set.add(head)) {
//                return true;
//            }
//            head = head.next;
//        }
//        return false;
//    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

//    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(1);
//        System.out.println(isPalindrome(head));
//    }
//
//    private static boolean isPalindrome(ListNode head) {
//        if (head == null) {
//            return false;
//        }
//    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        System.out.println();
//        System.out.println(head);
//        System.out.println(reverseList(head));
        System.out.println(endOfFirstHalf(head));
    }

    private static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            System.out.println(prev);
        }
        return prev;
    }

    public static ListNode endOfFirstHalf(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


//    public static boolean isPalindrome(ListNode head) {
//        StringBuilder a = new StringBuilder();
//        while (head != null) {
//            a.append(head.val);
//            head = head.next;
//        }
//        int left = 0;
//        int right = a.length() - 1;
//        while (left < right) {
//            if (a.charAt(left) != a.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }

}

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

//    static class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode(int x) {
//            val = x;
//            next = null;
//        }
//
//        @Override
//        public String toString() {
//            return "ListNode{" +
//                    "val=" + val +
//                    ", next=" + next +
//                    '}';
//        }
//    }

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


//    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        System.out.println();
////        System.out.println(head);
////        System.out.println(reverseList(head));
//        System.out.println(endOfFirstHalf(head));
//    }
//
//    private static ListNode reverseList(ListNode head) {
//        ListNode curr = head;
//        ListNode prev = null;
//        while (curr != null) {
//            ListNode next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//            System.out.println(prev);
//        }
//        return prev;
//    }
//
//    public static ListNode endOfFirstHalf(ListNode head) {
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast.next != null && fast.next.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        return slow;
//    }


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

//    static class LRUCache {
//
//        int capacity;
//        Map<Integer, Integer> map;
//
//        public LRUCache(int capacity) {
//            this.capacity = capacity;
//            map = new LinkedHashMap<>(capacity);
//        }
//
//        public int get(int key) {
//            if (map.get(key) == null) {
//                return -1;
//            }
//            int num = map.get(key);
//            map.remove(key);
//            map.put(key, num);
//            return map.get(key);
//        }
//
//        public void put(int key, int value) {
//            if (map.containsKey(key)) {
//                map.remove(key);
//                map.put(key, value);
//                return;
//            }
//            if (map.size() == capacity) {
//                int num = map.entrySet().iterator().next().getKey();
//                map.remove(num);
//            }
//            map.put(key, value);
//        }
//
//
//        public static void main(String[] args) {
//            LRUCache lruCache = new LRUCache(2);
////            lruCache.put(1,1);
////            lruCache.put(2,2);
////            System.out.println(lruCache.map);
////            System.out.println(lruCache.get(1)); // 1
////            System.out.println(lruCache.map);
////            lruCache.put(3,3);
////            System.out.println(lruCache.get(2)); // -1
////            lruCache.put(4,4);
////            System.out.println(lruCache.get(1)); // -1
////            System.out.println(lruCache.get(3));
////            System.out.println(lruCache.get(4));
//
////            System.out.println(lruCache.get(2));
////            lruCache.put(2,6);
////            System.out.println(lruCache.map);
////            System.out.println(lruCache.get(1));
////            lruCache.put(1,5);
////            System.out.println(lruCache.map);
////            lruCache.put(1,2);
////            System.out.println(lruCache.map);
////            System.out.println(lruCache.get(1));
////            System.out.println(lruCache.map);
////            System.out.println(lruCache.get(2));
////            System.out.println(lruCache.map);
//
//            lruCache.put(2,1);
//            lruCache.put(1,1);
//            System.out.println(lruCache.map);
//            lruCache.put(2,3);
//            System.out.println(lruCache.map);
//            lruCache.put(4,1);
//            System.out.println(lruCache.map);
//            System.out.println(lruCache.get(1));
//            System.out.println(lruCache.map);
//            System.out.println(lruCache.get(2));
//            System.out.println(lruCache.map);
//        }
//    }


//    public static void main(String[] args) {
////        int[] array = {1,8,6,2,5,4,8,3,7};
////        int[] array = {1,1};
////        int[] array = {4,3,2,1,4};
//        int[] array = {1,2,1};
//        System.out.println(maxArea(array));
//    }
//
//    public static int maxArea(int[] height) {
//        if (height == null || height.length < 2) {
//            return 0;
//        }
//        int length = height.length;
//        int left = 0;
//        int right = length - 1;
//        int leftMax = height[left];
//        int rightMax = height[right];
//        int minHeight = Math.min(leftMax, rightMax);
//        int result = (right - left) * minHeight;
//        while (left < right) {
//            if (leftMax < rightMax) {
//                left++;
//                leftMax = Math.max(height[left], leftMax);
//            } else {
//                right--;
//                rightMax = Math.max(height[right], rightMax);
//            }
//            minHeight = Math.min(leftMax, rightMax);
//            result = Math.max(result, minHeight * (right - left));
//        }
//        return result;
//    }


//    public static void main(String[] args) {
////        int[] nums = {1,3,4,2,2};
////        int[] nums = {3,1,3,4,2};
////        int[] nums = {1,1};
//        int[] nums = {1,1,2};
//        System.out.println(findDuplicate(nums));
//    }
//
//    public static int findDuplicate(int[] nums) {
//        if (nums == null || nums.length < 2) {
//            return -1;
//        }
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            if (!set.add(num)) {
//                return num;
//            }
//        }
//        return -1;
//    }

//    public static int findDuplicate(int[] nums) {
//        if (nums == null || nums.length < 2) {
//            return -1;
//        }
//        int length = nums.length;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < length; i++) {
//            if (map.containsKey(nums[i])) {
//                return nums[i];
//            }
//            map.put(nums[i],i);
//        }
//        return -1;
//    }

//    static class Solution {
//
//        public static void main(String[] args) {
//            int[] nums = {1,2,2,4,5};
//            System.out.println(findDuplicate(nums));
//        }
//        public static int findDuplicate(int[] nums) {
//            int n = nums.length, ans = 0;
//            int bit_max = 31;
//            while (((n - 1) >> bit_max) == 0) {
//                bit_max -= 1;
//            }
//            for (int bit = 0; bit <= bit_max; ++bit) {
//                int x = 0, y = 0;
//                for (int i = 0; i < n; ++i) {
//                    if ((nums[i] & (1 << bit)) != 0) {
//                        x += 1;
//                    }
//                    if (i >= 1 && ((i & (1 << bit)) != 0)) {
//                        y += 1;
//                    }
//                }
//                if (x > y) {
//                    ans |= 1 << bit;
//                }
//            }
//            return ans;
//        }
//    }

//    static class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode(int val) {
//            this.val = val;
//            next = null;
//        }
//    }
//
//    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        ListNode next = new ListNode(2);
//        head.next = next;
//        next.next = head;
////        System.out.println(head);
//        System.out.println(detectCycle(head));
////        ListNode listNode = null;
////        System.out.println(detectCycle(listNode));
//    }
//
//    public static ListNode detectCycle(ListNode head) {
//        Set<ListNode> set = new HashSet<>();
//        while (head != null) {
//            if (set.contains(head)) {
//                return head;
//            }
//            set.add(head);
//            head = head.next;
//        }
//        return null;
//    }





}

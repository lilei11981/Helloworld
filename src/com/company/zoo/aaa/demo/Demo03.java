package com.company.zoo.aaa.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilei
 * @date 2020-07-02 14:43
 * @apiNote
 */

public class Demo03 {


    static List<Integer> list = new ArrayList<>();
    static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {0, 1};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return result;
    }

    public static void dfs(int cur, int[] nums) {
        if (cur == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[cur]);
        dfs(cur + 1, nums);
        list.remove(list.size() - 1);
        dfs(cur + 1, nums);
    }
    // public static void main(String[] args) {
    //
    //     // String s = "[[5,8],[3,9],[3,12]]";
    //     // String s = "[[5,8],[3,9],[5,12],[16,5]]";
    //     // String s = "[[2,3],[3,7],[4,3],[3,7]]";
    //     // s = s.replace(']', '}');
    //     // System.out.println(s.replace('[', '{'));
    //     int[][] rectangles = {{5, 8}, {3, 9}, {5, 12}, {16, 5}};
    //     // int[][] rectangles = {{2, 3}, {3, 7}, {4, 3}, {3, 7}};
    //     // int[][] rectangles = {{5, 8}, {3, 9}, {3, 12}};
    //
    //     System.out.println(countGoodRectangles(rectangles));
    // }
    //
    // private static int countGoodRectangles(int[][] rectangles) {
    //     int min = 0;
    //     int max = 0;
    //     int count = 1;
    //     int length = rectangles.length;
    //     for (int i = 0; i < length; i++) {
    //         min = Math.min(rectangles[i][0], rectangles[i][1]);
    //         if (min > max) {
    //             max = min;
    //             count = 1;
    //         } else if (min == max){
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // public static int countGoodRectangles(int[][] rectangles) {
    //     int rows = rectangles.length;
    //     Map<Integer, Integer> map = new HashMap<>();
    //     int max = Math.min(rectangles[0][0], rectangles[0][1]);
    //     map.put(max, 1);
    //     for (int i = 1; i < rows; i++) {
    //         int num = Math.min(rectangles[i][0], rectangles[i][1]);
    //         if (num < max) {
    //             continue;
    //         } else {
    //             max = num;
    //         }
    //         if (map.containsKey(max)) {
    //             int count = map.get(max);
    //             map.put(max, ++count);
    //         } else {
    //             map.put(max, 1);
    //         }
    //     }
    //     return map.get(max);
    // }


    // public static void main(String[] args) {
    //     // String s = "RLRRLLRLRL";
    //     // String s = "RLLLLRRRLR";
    //     // String s = "RLRRRLLRLL";
    //     String s = "LLLLRRRR";
    //     // System.out.println(s.substring(0,2));
    //     // System.out.println(s.substring(2));
    //     System.out.println(balancedStringSplit(s));
    //     // System.out.println(checkBalance(s));
    // }
    //
    // private static int balancedStringSplit(String s) {
    //     int result = 0;
    //     int count = 0;
    //     int length = s.length();
    //     for (int i = 0; i < length; i++) {
    //         if (s.charAt(i) == 'L') {
    //             count++;
    //         } else {
    //             count--;
    //         }
    //         if (count == 0) {
    //             result++;
    //         }
    //     }
    //     return result;
    // }

    // private static int balancedStringSplit(String s) {
    //     int result = 0;
    //     int left = 0;
    //     int right = 0;
    //     int length = s.length();
    //     for (int i = 0; i < length; i++) {
    //         if (s.charAt(i) == 'L') {
    //             left++;
    //         } else {
    //             right++;
    //         }
    //         if (left == right) {
    //             result++;
    //             left = 0;
    //             right = 0;
    //         }
    //     }
    //     return result;
    // }

    // public static int balancedStringSplit(String s) {
    //     int result = 0;
    //     int index = 2;
    //     int count = 0;
    //     while (s.length() != 0) {
    //         if (checkBalance(s.substring(0, index))) {
    //             result++;
    //             s = s.substring(index);
    //             count = 0;
    //         }
    //         index = 2 * ++count;
    //     }
    //     return result;
    // }
    //
    // public static boolean checkBalance(String s) {
    //     int length = s.length();
    //     int a = 0;
    //     int b = 0;
    //     for (int i = 0; i < length; i++) {
    //         if (s.charAt(i) == 'L') {
    //             a++;
    //         } else {
    //             b++;
    //         }
    //     }
    //     return a == b;
    // }

    // public static void main(String[] args) {
    //     String s = "110001";
    //     System.out.println(checkOnesSegment(s));
    // }
    //
    // private static boolean checkOnesSegment(String s) {
    //     int length = s.length();
    //     int count = 0;
    //     int start = 0;
    //     int end = 0;
    //     for (int i = 0; i < length; i++) {
    //         if (s.charAt(i) == '1') {
    //             if (count == 0) {
    //                 start = i;
    //             }
    //             end = i;
    //             count++;
    //         }
    //     }
    //     return count == end - start + 1;
    // }

    // public static boolean checkOnesSegment(String s) {
    //     return !s.contains("01");
    // }

    // public static void main(String[] args) {
    //     // int[] flowerbed = {1, 0, 0, 0, 1};
    //     int[] flowerbed = {1, 0, 1, 0, 1};
    //     int n = 0;
    //     System.out.println(canPlaceFlowers(flowerbed, n));
    // }
    //
    // private static boolean canPlaceFlowers(int[] flowerbed, int n) {
    //     int length = flowerbed.length;
    //     for (int i = 0; i < length; i++) {
    //         if (n <= 0) {
    //             return true;
    //         }
    //         if (flowerbed[i] == 1) {
    //             continue;
    //         }
    //         if (i > 0 && flowerbed[i - 1] == 1) {
    //             continue;
    //         }
    //         if (i < length - 1 && flowerbed[i + 1] == 1) {
    //             continue;
    //         }
    //         n--;
    //         flowerbed[i] = 1;
    //     }
    //     return n <= 0;
    // }

    // public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    //     int length = flowerbed.length;
    //     for (int i = 0; i < length; i++) {
    //         if (place(flowerbed, i)) {
    //             n--;
    //             if (n <= 0) {
    //                 return true;
    //             }
    //             flowerbed[i] = 1;
    //         }
    //     }
    //     return n <= 0;
    // }
    //
    // public static boolean place(int[] flowerbed, int i) {
    //     return flowerbed[i] == 0
    //             && (i == 0 || flowerbed[i - 1] == 0)
    //             && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
    // }

    // static Set<String> result = new TreeSet<>();
    // static List<String> list = new LinkedList<>();
    //
    // // static char[] chars;
    //
    // static int successCount = 0;
    // static int failCount = 0;
    //
    // public static void main(String[] args) {
    //     // Scanner scanner = new Scanner(System.in);
    //     // while (scanner.hasNext()) {
    //     //     String s = scanner.nextLine();
    //     //     set.clear();
    //     //     System.out.println(Arrays.toString(permutation(s)));
    //     // }
    //
    //     System.out.println(Arrays.toString(permutation("abb")));
    //     // System.out.println(list.size());
    //     System.out.println(successCount);
    //     System.out.println(failCount);
    // }
    //
    // public static String[] permutation(String s) {
    //     char[] chars = s.toCharArray();
    //     // Set<Character> characterSet = new HashSet<>();
    //     // for (char character : characters) {
    //     //     characterSet.add(character);
    //     // }
    //     // int length = characterSet.size();
    //     // char[] chars = new char[length];
    //     // int i = 0;
    //     // for (Character character : characterSet) {
    //     //     chars[i++] = character;
    //     // }
    //     dfs(0, chars);
    //     return result.toArray(new String[s.length()]);
    // }
    //
    // public static void dfs(int x, char[] chars) {
    //     if (x == chars.length - 1) {
    //         // System.out.println(Arrays.toString(chars));
    //         // if (result.add(new String(chars))) {
    //         //     successCount++;
    //         // } else {
    //         //     failCount++;
    //         // }
    //         result.add(new String(chars));
    //         return;
    //     }
    //     Set<Character> set = new TreeSet<>();
    //     for (int i = x; i < chars.length; i++) {
    //         if (set.contains(chars[i])) {
    //             continue;
    //         }
    //         set.add(chars[i]);
    //         swap(chars, x, i);
    //         // System.out.println(Arrays.toString(chars));
    //         dfs(x + 1, chars);
    //         swap(chars, x, i);
    //     }
    // }
    //
    // public static void swap(char[] chars, int i, int j) {
    //     char temp = chars[i];
    //     chars[i] = chars[j];
    //     chars[j] = temp;
    // }


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

    //    public static void main(String[] args) {
    //        Scanner scanner = new Scanner(System.in);
    //        String string = "";
    //        while (scanner.hasNext()) {
    //            string = scanner.nextLine();
    //            String[] strings = string.split(" ");
    //            int[] nums = new int[strings.length];
    //            for (int i = 0; i < strings.length; i++) {
    //                nums[i] = Integer.parseInt(strings[i]);
    //            }
    //            System.out.println(getMaxNum(nums));
    //        }
    //
    //    }
    //
    //    public static int getMaxNum(int[] nums) {
    //        int length = nums.length;
    //        if (length < 1) {
    //            return 0;
    //        }
    //        int min = nums[0];
    //        int result = 0;
    //        for (int i = 1; i < length; i++) {
    //            if (nums[i] < min) {
    //                min = nums[i];
    //            } else if (nums[i] - min > result) {
    //                result = nums[i] - min;
    //            }
    //        }
    //        return result;
    //    }
    //
    //
    //
    //    public static String getResult(String s) {
    //        Map<Character, Integer> map = new LinkedHashMap<>();
    //        char[] chars = s.toCharArray();
    //        Arrays.sort(chars);
    //        PriorityQueue<CharNum> queue = new PriorityQueue<>(new Comparator<CharNum>() {
    //            @Override
    //            public int compare(CharNum o1, CharNum o2) {
    //                if (o2.val > o1.val) {
    //                    return 1;
    //                } else if (o2.val == o1.val) {
    //                    return o1.c - o2.c;
    //                }
    //                return -1;
    //            }
    //        });
    //        for (char c : chars) {
    //            if (map.containsKey(c)) {
    //                int count = map.get(c);
    //                map.put(c, ++count);
    //            } else {
    //                map.put(c, 1);
    //            }
    //        }
    //        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
    //            queue.add(new CharNum(entry.getKey(), entry.getValue()));
    //        }
    //        StringBuilder result = new StringBuilder();
    //        while (queue.size() > 0) {
    //            CharNum charNum = queue.poll();
    //            for (int i = 0; i < charNum.val; i++) {
    //                result.append(charNum.c);
    //            }
    //        }
    //        return result.toString();
    //    }
    //
    //    static class CharNum {
    //        char c;
    //        int val;
    //
    //        public CharNum(char c, int val) {
    //            this.c = c;
    //            this.val = val;
    //        }
    //
    //        @Override
    //        public String toString() {
    //            return "CharNum{" +
    //                    "c=" + c +
    //                    ", val=" + val +
    //                    '}';
    //        }
    //    }

    //     public static void main(String[] args) {
    // //        String string = "03-03 08:30:00,25";
    // //        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss,ss");
    // //        try {
    // //            Date date = simpleDateFormat.parse(string);
    // //            System.out.println(date);
    // //        } catch (ParseException e) {
    // //            e.printStackTrace();
    // //        }
    //
    //         System.out.println(Integer.parseInt(String.valueOf(02)));
    //
    //     }


}

package com.company.zoo.aaa.demo;

/**
 * @author lilei
 * @date 2020-07-01 10:25
 * @apiNote
 */

public class Demo02 {

    // public static void main(String[] args) {
    //        int[] a = {1, 3, 2};
    //        Arrays.sort(a);
    //        System.out.println(Arrays.toString(a));


    //        int[] a = null;
    //        int[] b = {1, 2};
    //        boolean isTrue = Arrays.equals(a, b);
    //        System.out.println(isTrue);
    //
    //        int hashCode = Arrays.hashCode(a);
    //        System.out.println(hashCode);
    //
    //        System.out.println(31 * 32 + 2);
    //
    //        System.out.println(Arrays.hashCode(b));


    //        int[] a = {1,2,3};
    //        Spliterator.OfInt spliterator = Arrays.spliterator(a);
    //        System.out.println(spliterator.characteristics());


    // String[] a = {"a", "c", "b"};
    // Arrays.sort(a);
    // System.out.println(Arrays.toString(a));

    // Object a = null;
    // Object b = a;
    // System.out.println(b);

    // }


    // public static void main(String[] args) {
    //     Node head = new Node();
    //     System.out.println(head);
    //     head = head.next;
    //     System.out.println(head);
    //     head = head.next;
    //     System.out.println(head);
    // }
    //
    //
    // static class Node {
    //     int val;
    //     int min;
    //     Node next;
    //
    //     public Node() {
    //     }
    //
    //     public Node(int val, int min) {
    //         this(val, min, null);
    //     }
    //
    //     public Node(int val, int min, Node next) {
    //         this.val = val;
    //         this.min = min;
    //         this.next = next;
    //     }
    //
    //     @Override
    //     public String toString() {
    //         return "Node{" +
    //                 "val=" + val +
    //                 ", min=" + min +
    //                 ", next=" + next +
    //                 '}';
    //     }
    // }

    // public static void main(String[] args) {
    //     TreeNode root = new TreeNode(1);
    //     root.left = new TreeNode(2);
    //     root.right = new TreeNode(2);
    //     root.left.left = new TreeNode(3);
    //     root.left.right = new TreeNode(4);
    //     root.right.left = new TreeNode(4);
    //     root.right.right = new TreeNode(3);
    //
    //     System.out.println(isSymmetric(root));
    // }
    //
    // public static boolean isSymmetric(TreeNode root) {
    //     if (root == null) {
    //         return false;
    //     }
    //     return check(root.left, root.right);
    //
    // }
    //
    // private static boolean check(TreeNode left, TreeNode right) {
    //     if (left == null && right == null) {
    //         return true;
    //     }
    //     if (left == null || right == null || left.val != right.val) {
    //         return false;
    //     }
    //
    //     return check(left.left, right.right) && check(left.right, right.left);
    // }

    // private static boolean check(TreeNode left, TreeNode right) {
    //     Queue<TreeNode> queue = new LinkedList<>();
    //     queue.add(left);
    //     queue.add(right);
    //
    //     while (!queue.isEmpty()) {
    //         TreeNode x = queue.poll();
    //         TreeNode y = queue.poll();
    //         if (x == null && y == null) {
    //             continue;
    //         }
    //         if (x == null || y == null || x.val != y.val) {
    //             return false;
    //         }
    //         queue.add(x.left);
    //         queue.add(y.right);
    //         queue.add(x.right);
    //         queue.add(y.left);
    //     }
    //     return true;
    // }


    // public static class TreeNode {
    //     int val;
    //     TreeNode left;
    //     TreeNode right;
    //
    //     TreeNode() {
    //     }
    //
    //     TreeNode(int val) {
    //         this.val = val;
    //     }
    //
    //     TreeNode(int val, TreeNode left, TreeNode right) {
    //         this.val = val;
    //         this.left = left;
    //         this.right = right;
    //     }
    // }


    // public static int maxSubArray(int[] nums) {
    //     if (nums == null || nums.length == 0) {
    //         return Integer.MIN_VALUE;
    //     }
    //     int result = nums[0];
    //     int sum = 0;
    //     for (int num : nums) {
    //         if (sum > 0) {
    //             sum += num;
    //         } else {
    //             sum = num;
    //         }
    //         result = Math.max(sum, result);
    //     }
    //     return result;
    // }

    // public static void main(String[] args) {
    //     int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    //     System.out.println(maxSubArray(array));
    // }
    //
    // private static int maxSubArray(int[] nums) {
    //     // int length = nums.length;
    //     // int result = nums[0];
    //     // for (int i = 0; i < length; i++) {
    //     //     int num = nums[i];
    //     //     int max = num;
    //     //     for (int j = i + 1; j < length; j++) {
    //     //         num = nums[j] + num;
    //     //         if (num > max) {
    //     //             max = num;
    //     //         }
    //     //     }
    //     //     if (result < max) {
    //     //         result = max;
    //     //     }
    //     // }
    //     // return result;
    //
    //     int result = nums[0];
    //     int sum = 0;
    //     for (int num : nums) {
    //         sum = Math.max(sum + num, num);
    //         result = Math.max(sum, result);
    //     }
    //     return result;
    // }

    // public static void main(String[] args) {
    //     // TreeNode root = new TreeNode(1);
    //     // root.left = new TreeNode(2);
    //     // root.right = new TreeNode(3);
    //     // root.left.left = new TreeNode(4);
    //     // root.left.right = new TreeNode(5);
    //     // root.left.left.left = new TreeNode(6);
    //     // root.right.right = new TreeNode(7);
    //
    //     TreeNode root = new TreeNode();
    //     // System.out.println(root);
    //
    //     Demo02 demo02 = new Demo02();
    //     System.out.println(demo02.diameterOfBinaryTree(root));
    //
    // }
    //
    // static int ans = 0;
    //
    // public int diameterOfBinaryTree(TreeNode root) {
    //     len(root);
    //     return ans;
    // }
    //
    // private static int len(TreeNode root) {
    //     if (root == null) {
    //         return 0;
    //     }
    //     int leftLen = len(root.left);
    //     int rightLen = len(root.right);
    //     ans = Math.max(ans, leftLen + rightLen);
    //     return Math.max(leftLen, rightLen) + 1;
    // }
    //
    //
    // public static class TreeNode {
    //     int val;
    //     TreeNode left;
    //     TreeNode right;
    //     TreeNode () {}
    //
    //     TreeNode(int x) {
    //         val = x;
    //     }
    // }


    // public static void main(String[] args) {
    //     int[] nums = {2, 7, 11, 15};
    //     System.out.println(Arrays.toString(twoSum(nums, 9)));
    // }
    //
    // private static int[] twoSum(int[] nums, int target) {
    //     int[] result = new int[]{-1, -1};
    //     int length = nums.length;
    //     Map<Integer, Integer> map = new HashMap<>(length);
    //     // for (int i = 0; i < length; i++) {
    //     //     map.put(nums[i], i);
    //     // }
    //     for (int i = 0; i < length; i++) {
    //         if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
    //             result[0] = i;
    //             result[1] = map.get(target - nums[i]);
    //             return result;
    //         }
    //         map.put(nums[i], i);
    //     }
    //     return result;
    // }


    // public static int[] twoSum(int[] nums, int target) {
    //     int[] result = new int[2];
    //     int length = nums.length;
    //     for (int i = 0; i < length; i++) {
    //         result[0] = i;
    //         for (int j = i + 1; j < length; j++) {
    //             if (nums[i] + nums[j] == target) {
    //                 result[1] = j;
    //                 return result;
    //             }
    //         }
    //     }
    //     return new int[]{-1, -1};
    // }

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }


    public static int climbStairs(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

}

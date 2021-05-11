package com.company.zoo.aaa.demo;

/**
 * @author lilei
 * @date 2020-07-03 11:12
 * @apiNote
 */

public class Demo06 {

    // public static void main(String[] args) {
    //        Queue<Integer> queue = new LinkedList<>();
    //        Random r1 = new Random();
    //        for (int i = 0; i < 20; i++) {
    //            int num = r1.nextInt(100);
    //            queue.add(num);
    //        }
    //        System.out.println(queue);
    //        System.out.println(queue.element());
    //        System.out.println(queue.peek());
    //        System.out.println(queue.poll());
    //        System.out.println(queue.remove());
    //        System.out.println(queue);
    //        System.out.println("========================");

    //        LinkedList<Integer> linkedList = new LinkedList<>();
    //        Random r2 = new Random();
    //        for (int i = 0; i < 20; i++) {
    //            int num = r2.nextInt(100);
    //            linkedList.add(num);
    //        }
    //        System.out.println(linkedList);
    //        System.out.println(linkedList.getFirst());
    //        System.out.println(linkedList.getLast());
    //        System.out.println();

    //     long a = 100000000;
    //     long b = 10000;
    //     long result = a * b;
    //     System.out.println(result);
    //
    //
    // }

    // a - b
    // c - d

    // public static int a(int a, int b) {
    //     Random random = new Random();
    //     return random.nextInt(b - a) + a;
    // }
    //
    // public static int a() {
    //     Random random = new Random();
    //     return random.nextInt(5) + 1;
    // }
    //
    // public static int b(int a, int b) {
    //     int result;
    //     int mid = a + (b - a) / 2;
    //     if ((b - a) % 2 == 0) {
    //         return a(a, b) > mid ? 1 : 0;
    //     }
    //     do {
    //         result = a(a, b);
    //     } while (result == mid);
    //     return result > mid ? 1 : 0;
    // }
    //
    // public static int b() {
    //     // return a() > 3 ? 1 :0;
    //     int result;
    //     do {
    //         result = a();
    //         // if (result > 3) {
    //         //     result = 1;
    //         // } else if (result < 3) {
    //         //     result = 0;
    //         // }
    //     } while (result == 3);
    //     return result > 3 ? 1 : 0;
    // }
    //
    // public static int c(int a, int b, int c, int d) {
    //     int result;
    //     int num = f(c, d);
    //     do {
    //         result = 0;
    //         for (int i = num - 1; i >= 0; i--) {
    //             result += (b(a, b) << i);
    //         }
    //     } while (result > (d - c));
    //     return result;
    // }
    //
    // public static int f(int c, int d) {
    //     int result = 0;
    //     int num = 1;
    //     while ((d - c) > num) {
    //         num *= 2;
    //         result++;
    //     }
    //     return result;
    // }
    //
    // public static int c() {
    //     int result;
    //     do {
    //         result = (b() << 2) + (b() << 1) + b();
    //     } while (result == 7);
    //     return result;
    // }
    //
    // public static int d() {
    //     return Math.random() > 0.99 ? 1 : 0;
    // }
    //
    // public static int e() {
    //     // int result;
    //     // do {
    //     //     result = d();
    //     // } while (result == d());
    //     // return result;
    //     int a;
    //     int b;
    //     do {
    //         a = d();
    //         b = d();
    //     } while (a == b);
    //     return a;
    // }
    //
    //
    // public static void main(String[] args) {
    //     int[] array = new int[8];
    //     int a = 1;
    //     int b = 6;
    //     int c = 1;
    //     int d = 7;
    //     for (int i = 0; i < 30000; i++) {
    //         array[c(a, b, c, d)]++;
    //     }
    //     System.out.println(Arrays.toString(array));
    //
    //     // System.out.println(c(a, b, c, d));
    //
    //
    //     // System.out.println(f(1,1));
    // }

    // public static void main(String[] args) {
    //     int[] array = {3, 0, 6, 2, 5, 1, 7, 0}; // 13
    //     // int[] array = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    //     System.out.println(getNum(array));
    // }
    //
    // private static int getNum(int[] array) {
    //     if (array == null || array.length < 3) {
    //         return 0;
    //     }
    //     int length = array.length;
    //     int leftMax = array[0];
    //     int left = 1;
    //     int rightMax = array[length - 1];
    //     int right = length - 2;
    //     int result = 0;
    //     while (left <= right) {
    //         if (leftMax <= rightMax) {
    //             result += Math.max(leftMax - array[left], 0);
    //             leftMax = Math.max(leftMax, array[left]);
    //             left++;
    //         } else {
    //             result += Math.max(rightMax - array[right], 0);
    //             rightMax = Math.max(rightMax, array[right]);
    //             right--;
    //         }
    //     }
    //     return result;
    // }

    // private static int getNum(int[] array) {
    //     if (array == null || array.length < 3) {
    //         return 0;
    //     }
    //     int length = array.length;
    //     int[] leftMax = new int[length];
    //     leftMax[0] = array[0];
    //     for (int i = 1; i < length; i++) {
    //         leftMax[i] = Math.max(array[i], leftMax[i - 1]);
    //     }
    //     int[] rightMax = new int[length];
    //     rightMax[length - 1] = array[length - 1];
    //     for (int i = (length - 2); i > 0; i--) {
    //         rightMax[i] = Math.max(array[i], rightMax[i + 1]);
    //     }
    //     int result = 0;
    //     for (int i = 1; i < length - 1; i++) {
    //         result += (Math.min(leftMax[i], rightMax[i]) - array[i]);
    //     }
    //     return result;
    // }


    // public static TreeNode generateTreeNode(int[] array, int left, int right) {
    //     if (left > right) {
    //         return null;
    //     }
    //     TreeNode root = new TreeNode(array[right]);
    //     if (left == right) {
    //         return root;
    //     }
    //     int mid = left - 1;
    //     for (int i = left; i < right; i++) {
    //         if (array[i] < array[right]) {
    //             mid = i;
    //         }
    //     }
    //     root.left = generateTreeNode(array, left, mid);
    //     root.right = generateTreeNode(array, mid + 1, right - 1);
    //     return root;
    // }

    // public static TreeNode generateTreeNode(int[] array, int left, int right) {
    //     TreeNode root = new TreeNode(array[right]);
    //     if (left == right) {
    //         return root;
    //     }
    //     int mid = - 1;
    //     for (int i = left; i < right; i++) {
    //         if (array[i] < array[right]) {
    //             mid = i;
    //         }
    //     }
    //     if (mid == -1) {
    //         root.right = generateTreeNode(array, mid + 1, right - 1);
    //     } else if (mid == right - 1) {
    //         root.left = generateTreeNode(array, left, mid);
    //     } else {
    //         root.left = generateTreeNode(array, left, mid);
    //         root.right = generateTreeNode(array, mid + 1, right - 1);
    //     }
    //     return root;
    // }

    // public static TreeNode generateTreeNode(int[] array, int left, int right) {
    //     if (left > right) {
    //         return null;
    //     }
    //     TreeNode root = new TreeNode(array[right]);
    //     if (left == right) {
    //         return root;
    //     }
    //     int mid = left - 1;
    //     int leftIndex = left;
    //     int rightIndex = right;
    //
    //     while (leftIndex <= rightIndex) {
    //         int midIndex = leftIndex + ((rightIndex - leftIndex) >> 1);
    //         if (array[midIndex] < array[right]) {
    //             mid = midIndex;
    //             leftIndex = midIndex + 1;
    //         } else {
    //             rightIndex = midIndex - 1;
    //         }
    //     }
    //
    //     root.left = generateTreeNode(array, left, mid);
    //     root.right = generateTreeNode(array, mid + 1, right - 1);
    //     return root;
    // }
    //
    // public static void main(String[] args) {
    //     // int[] array = {1, 2, 3, 4, 5, 6, 7};
    //     // System.out.println(generateTreeNode(array));
    //
    //     for (int i = 0; i < 100; i++) {
    //         System.out.println(generateRandomBST(1, 2, 10));
    //     }
    // }
    //
    // private static TreeNode generateTreeNode(int[] array) {
    //     if (array == null) {
    //         return null;
    //     }
    //     return generateTreeNode(array, 0, array.length - 1);
    // }
    //
    // public static TreeNode generateRandomBST(int min, int max, int length) {
    //     if (min > max) {
    //         return null;
    //     }
    //     return createTreeNode(min, max, 1, length);
    // }
    //
    // private static TreeNode createTreeNode(int min, int max, int level, int length) {
    //     if (min > max || level > length) {
    //         return null;
    //     }
    //
    //     TreeNode root = new TreeNode(random(min, max));
    //     root.left = createTreeNode(min, root.val - 1, level + 1, length);
    //     root.right = createTreeNode(root.val + 1, max, level + 1, length);
    //     return root;
    // }
    //
    // private static int random(int min, int max) {
    //     return min + (int) (Math.random() * (max - min + 1));
    // }
    //
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
    //
    //     @Override
    //     public String toString() {
    //         return "TreeNode{" +
    //                 "val=" + val +
    //                 ", left=" + left +
    //                 ", right=" + right +
    //                 '}';
    //     }
    // }


}

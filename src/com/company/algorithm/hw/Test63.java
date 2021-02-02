package com.company.algorithm.hw;

import java.util.Arrays;

/**
 * @author lilei
 * @date 2021-02-02 下午1:41
 * @apiNote 分别按照二叉树先序，中序和后序打印所有的节点。
 */

public class Test63 {

    private static int preIndex = 0;
    private static int midIndex = 0;
    private static int postIndex = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(root);
        int[][] result = threeOrders(root);
        for (int[] res : result) {
            System.out.println(Arrays.toString(res));
        }
    }

    /**
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    public static int[][] threeOrders(TreeNode root) {
        // write code here
        int rootSize = getRootSize(root);
        int[][] result = new int[3][rootSize];
        preOrder(root, result);
        midOrder(root, result);
        postOrder(root, result);
        return result;
    }

    private static int getRootSize(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getRootSize(root.left) + getRootSize(root.right) + 1;
    }

    public static void preOrder(TreeNode root, int[][] result) {
        if (root == null) {
            return;
        }
        result[0][preIndex++] = root.val;
        preOrder(root.left, result);
        preOrder(root.right, result);
    }

    public static void midOrder(TreeNode root, int[][] res) {
        if (root == null) {
            return;
        }
        midOrder(root.left, res);
        res[1][midIndex++] = root.val;
        midOrder(root.right, res);
    }

    public static void postOrder(TreeNode root, int[][] res) {
        if (root == null) {
            return;
        }
        postOrder(root.left, res);
        postOrder(root.right, res);
        res[2][postIndex++] = root.val;
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}

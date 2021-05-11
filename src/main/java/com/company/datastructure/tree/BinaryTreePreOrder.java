package com.company.datastructure.tree;

import java.util.Stack;

/**
 * @author lilei
 * @date 2021-02-23 下午2:55
 * @apiNote 二叉树的前序遍历
 *
 * 前序遍历：根左右
 *      4
 *    /   \
 *   2     6
 *  / \   / \
 * 1   3 5   7
 *
 * 前序遍历：4 2 1 3 6 5 7
 */

public class BinaryTreePreOrder {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)), new TreeNode(6, new TreeNode(5, null, null), new TreeNode(7, null, null)));
        preOrder1(root);
    }

    public static void preOrder(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.print(treeNode.val + " ");
            preOrder(treeNode.left);
            preOrder(treeNode.right);
        }
    }

    public static void preOrder1(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();
        while (treeNode != null || !stack.empty()) {
            if (treeNode != null) {
                System.out.print(treeNode.val + " ");
                stack.push(treeNode);
                treeNode = treeNode.left;
            } else {
                treeNode = stack.peek();
                stack.pop();
                treeNode = treeNode.right;
            }
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
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

package com.company.datastructure.tree;

import java.util.Stack;

/**
 * @author lilei
 * @date 2021-02-23 下午3:12
 * @apiNote 二叉树的中序遍历
 *
 * 中序遍历：左根右
 *      4
 *    /   \
 *   2     6
 *  / \   / \
 * 1   3 5   7
 *
 * 中序遍历：1 2 3 4 5 6 7
 */

public class BinaryTreeMidOrder {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)), new TreeNode(6, new TreeNode(5, null, null), new TreeNode(7, null, null)));
        midOrder1(root);
    }

    public static void midOrder(TreeNode treeNode) {
        if (treeNode != null) {
            midOrder(treeNode.left);
            System.out.print(treeNode.val + " ");
            midOrder(treeNode.right);
        }
    }


    public static void midOrder1(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();
        while (treeNode != null || !stack.empty()) {
            if (treeNode != null) {
                stack.push(treeNode);
                treeNode = treeNode.left;
            } else {
                treeNode = stack.peek();
                stack.pop();
                System.out.print(treeNode.val + " ");
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

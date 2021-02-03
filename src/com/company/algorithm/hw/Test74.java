package com.company.algorithm.hw;

import java.util.Stack;

/**
 * @author lilei
 * @date 2021/2/3 10:54 下午
 * @apiNote 操作给定的二叉树，将其变换为源二叉树的镜像。
 */

public class Test74 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(root);
        Mirror(root);
        System.out.println(root);
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

    public static void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        TreeNode curNode;
        TreeNode tempNode;

        while (!stack.isEmpty()) {
            curNode = stack.pop();
            if (curNode == null) {
                continue;
            }
            if (curNode.left == null && curNode.right == null) {
                continue;
            }
            tempNode = curNode.left;
            curNode.left = curNode.right;
            curNode.right = tempNode;
            stack.push(curNode.left);
            stack.push(curNode.right);
        }
    }
}

package com.company.algorithm.nc;

import java.util.Stack;

public class NC013_2 {

    public static void main(String[] args) {
//        TreeNode root = new TreeNode();
//        root.val = 1;
//        root.right = new TreeNode();
//        root.right.val = 2;

        TreeNode root = new TreeNode();
        root.val = 1;
        root.right = new TreeNode();
        root.right.val = 2;

        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> level = new Stack<>();
        stack.push(root);
        level.push(1);
        int max = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int temp = level.pop();
            max = Math.max(temp, max);
            if (node.left != null) {
                stack.push(node.left);
                level.push(temp + 1);
            }
            if (node.right != null) {
                stack.push(node.right);
                level.push(temp + 1);
            }
        }
        return max;
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }
}

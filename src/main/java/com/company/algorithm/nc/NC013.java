package com.company.algorithm.nc;

public class NC013 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }

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


    public static int maxDepth (TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}

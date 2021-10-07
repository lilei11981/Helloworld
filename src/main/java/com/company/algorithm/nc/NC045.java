package com.company.algorithm.nc;

/**
 * @author lilei
 * @date 2021-10-04 下午10:22
 * @apiNote
 */

public class NC045 {

    static int left = 0;
    static int mid = 0;
    static int right = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.val = 1;
        root.left = new TreeNode();
        root.left.val = 2;
        root.right = new TreeNode();
        root.right.val = 3;
        int[][] result = threeOrders(root);
        int n = result.length;
        int l = result[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(" " + result[i][j]);
            }
            System.out.println();
        }
    }

    /**
     *
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    public static int[][] threeOrders(TreeNode root) {
        // write code here
        int[][] arr = new int[3][getSize(root)];
        threeOrders(root, arr);
        return arr;
    }

    public static void threeOrders(TreeNode root, int[][] arr) {
        if (root == null) {
            return;
        }
        arr[0][left++] = root.val;
        threeOrders(root.left, arr);
        arr[1][mid++] = root.val;
        threeOrders(root.right, arr);
        arr[2][right++] = root.val;
    }

    public static int getSize(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + getSize(root.left) + getSize(root.right);
    }

    public static class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;
    }
}

package com.company.utils;

/**
 * @author lilei
 * @date 2021-02-27 下午6:53
 * @apiNote
 */

public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void minOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        minOrder(treeNode.left);
        System.out.print(treeNode.val + " ");
        minOrder(treeNode.right);
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}

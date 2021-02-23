package com.company.datastructure.tree;

/**
 * @author lilei
 * @date 2021-02-23 下午3:34
 * @apiNote 二叉树的后序遍历
 *
 * 后序遍历：左右根
 *      4
 *    /   \
 *   2     6
 *  / \   / \
 * 1   3 5   7
 *
 * 后序遍历：1 3 2 5 7 6 4
 */

public class BinaryTreePostOrder {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)), new TreeNode(6, new TreeNode(5, null, null), new TreeNode(7, null, null)));
        postOrder(root);
    }

    public static void postOrder(TreeNode treeNode) {
        if (treeNode != null) {
            postOrder(treeNode.left);
            postOrder(treeNode.right);
            System.out.print(treeNode.val + " ");
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

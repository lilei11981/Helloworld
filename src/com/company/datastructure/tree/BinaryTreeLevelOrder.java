package com.company.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lilei
 * @date 2021-02-23 下午5:20
 * @apiNote 二叉树的层序遍历
 *      4
 *    /   \
 *   2     6
 *  / \   / \
 * 1   3 5   7
 * 层序遍历：4 2 6 1 3 5 7
 */

public class BinaryTreeLevelOrder {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)), new TreeNode(6, new TreeNode(5, null, null), new TreeNode(7, null, null)));
        levelOrder(root);
    }

    private static void levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            System.out.print(treeNode.val + " ");
            if (treeNode.left != null) {
                queue.offer(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.offer(treeNode.right);
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

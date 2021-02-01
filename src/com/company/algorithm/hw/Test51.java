package com.company.algorithm.hw;

import java.util.LinkedList;

/**
 * @author lilei
 * @date 2021-02-01 下午2:08
 * @apiNote 二叉树的最大深度
 */

public class Test51 {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.val = 1;
        treeNode.left = new TreeNode();
        treeNode.left.left = new TreeNode();
        LinkedList<TreeNode> list = new LinkedList<>();
        list.offer(treeNode);
        System.out.println(list);
        System.out.println(list.size());


//        System.out.println(maxDepth1(treeNode));
    }

    public static int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<TreeNode> list = new LinkedList<>();
        list.offer(root);
        int max = 0;
        int level = 0;
        int size = 0;
        int cur = 0;
        while (!list.isEmpty()) {
            size = list.size();
            max = Math.max(max, size);
            cur = 0;
            while (cur < size) {
                TreeNode node = list.poll();
                cur++;
                if (node != null && node.left != null) {
                    list.offer(node.left);
                }
                if (node != null && node.right != null) {
                    list.offer(node.right);
                }
            }
            level++;
        }
        //System.out.println("二叉树最大宽度为："+max)；
        return level;
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

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

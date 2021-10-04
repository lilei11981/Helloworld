package com.company.algorithm.nc;

import java.util.Deque;
import java.util.LinkedList;

public class NC013_1 {

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
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);
        int count = 0;
        while (!deque.isEmpty()) {
            int size = deque.size();
            while (size > 0) {
                TreeNode cur = deque.poll();
                if (cur.left != null) {
                    deque.addLast(cur.left);
                }
                if (cur.right != null) {
                    deque.addLast(cur.right);
                }
                size--;
            }
            count++;
        }
        return count;
    }
}

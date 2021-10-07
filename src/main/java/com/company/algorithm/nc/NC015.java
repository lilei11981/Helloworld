package com.company.algorithm.nc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lilei
 * @date 2021-10-07 上午10:29
 * @apiNote
 */

public class NC015 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.val = 3;
        root.left = new TreeNode();
        root.left.val = 9;
        root.right = new TreeNode();
        root.right.val = 20;
        root.right.left = new TreeNode();
        root.right.left.val = 15;
        root.right.right = new TreeNode();
        root.right.right.val = 7;
        System.out.println(levelOrder(root));
    }

    /**
     *
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList <>>
     */
    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> stack = new LinkedList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            int n = stack.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = stack.poll();
                list.add(node.val);
                if (node.left != null) {
                    stack.add(node.left);
                }
                if (node.right != null) {
                    stack.add(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }

    public static class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;
    }
}

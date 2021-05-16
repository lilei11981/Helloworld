package com.company.zoo.aaa.demo;

import java.util.List;

/**
 * @author lilei
 * @date 2021-05-15 下午10:32
 * @apiNote
 */

public class Demo16 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        return null;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

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
    }
}

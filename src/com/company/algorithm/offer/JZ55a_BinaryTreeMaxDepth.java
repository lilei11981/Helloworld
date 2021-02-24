package com.company.algorithm.offer;

/**
 * @author lilei
 * @date 2021-02-24 下午4:46
 * @apiNote 剑指 Offer 55 - I. 二叉树的深度
 * 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 *
 * 例如：
 *
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class JZ55a_BinaryTreeMaxDepth {

    private static void midOrder(TreeNode treeNode) {
        if (treeNode != null) {
            midOrder(treeNode.left);
            System.out.print(treeNode.val + " ");
            midOrder(treeNode.right);
        }
    }

    public static int getMaxDepth(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        return Math.max(getMaxDepth(treeNode.left), getMaxDepth(treeNode.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);
        // treeNode.right.right.right = new TreeNode(11);
        // midOrder(treeNode);
        System.out.println(getMaxDepth(treeNode));
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
    }
}

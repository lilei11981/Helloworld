package com.company.algorithm.leetcode;

/**
 * @author lilei
 * @date 2021-02-18 下午5:53
 * @apiNote 翻转二叉树
 * 翻转一棵二叉树。
 * 示例：
 *
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 中序遍历：1 2 3 4 6 7 9
 *
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 * 中序遍历：9 7 6 4 3 2 1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/invert-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class LC226_InvertBinaryTree {

    public static void midOrder(TreeNode treeNode) {
        if (treeNode != null) {
            midOrder(treeNode.left);
            System.out.print(treeNode.val + " ");
            midOrder(treeNode.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)), new TreeNode(7, new TreeNode(6, null, null), new TreeNode(9, null, null)));
        midOrder(root);
        TreeNode result = invertTree1(root);
        System.out.println();
        midOrder(result);
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode rightNode = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(rightNode);
        return root;
    }

    public static TreeNode invertTree1(TreeNode root) {
        if (root == null) {
            return null;
        }
        invertTree1(root.left);
        TreeNode rightNode = root.right;
        root.right = root.left;
        root.left = rightNode;
        invertTree1(root.left);
        return root;
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

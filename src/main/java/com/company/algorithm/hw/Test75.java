package com.company.algorithm.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author lilei
 * @date 2021/2/3 11:39 下午
 * @apiNote 请根据二叉树的前序遍历，中序遍历恢复二叉树，并打印出二叉树的右视图
 * 先序 根左右
 * 中序 左根右
 * 后续 左右根
 */

public class Test75 {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 3};
        int[] b = {4, 2, 5, 1, 3};
        System.out.println(Arrays.toString(solve(a, b)));
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 求二叉树的右视图
     *
     * @param xianxu  int整型一维数组 先序遍历
     * @param zhongxu int整型一维数组 中序遍历
     * @return int整型一维数组
     */
    public static int[] solve(int[] xianxu, int[] zhongxu) {
        // write code here
        TreeNode root = reBuild(xianxu, zhongxu);
        return bfs(root);
    }

    public static int[] bfs(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode tmp = root;
        while (!queue.isEmpty()) {
            for (int size = queue.size(); size > 0; size--) {
                tmp = queue.poll();
                if (tmp.left != null) {
                    queue.offer(tmp.left);
                }
                if (tmp.right != null) {
                    queue.offer(tmp.right);
                }
            }
            list.add(tmp.val);
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static TreeNode reBuild(int[] preOrder, int[] inOrder) {
        // 先序遍历确定根节点，中序遍历确定左右子树
        if (preOrder == null || preOrder.length == 0) {
            return null;
        }

        int val = preOrder[0];
        int pos = 0;
        int len = preOrder.length;

        TreeNode root = new TreeNode(val);
        for (; pos < len; pos++) {
            if (inOrder[pos] == val) {
                break;
            }
        }
        root.left = reBuild(Arrays.copyOfRange(preOrder, 1, pos + 1), Arrays.copyOfRange(inOrder, 0, pos));
        root.right = reBuild(Arrays.copyOfRange(preOrder, pos + 1, len), Arrays.copyOfRange(inOrder, pos + 1, len));
        return root;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}

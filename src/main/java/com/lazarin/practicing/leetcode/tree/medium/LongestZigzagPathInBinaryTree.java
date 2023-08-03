package com.lazarin.practicing.leetcode.tree.medium;

import com.lazarin.practicing.leetcode.tree.TreeNode;

//https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree
public class LongestZigzagPathInBinaryTree {

    //approach 1 - DFS; T:O(N); S:O(N)
    public int longestZigZag(TreeNode root) {
        dfs(root, false, 0);
        dfs(root, true, 0);
        return pathLength;
    }

    int pathLength = 0;
    private void dfs(TreeNode node, boolean goLeft, int steps) {
        if (node == null) {
            return;
        }
        pathLength = Math.max(pathLength, steps);
        if (goLeft) {
            dfs(node.left, false, steps + 1);
            // begin a new zigzag path that only includes the edge leading to the
            // right child as it cannot be merged with the ongoing path
            dfs(node.right, true, 1);
        } else {
            dfs(node.left, false, 1);
            dfs(node.right, true, steps + 1);
        }
    }

    //approach 2 - DFS no global variable; T:O(N); S:O(N)
    public int longestZigZag2(TreeNode root) {
        return Math.max(dfs2(root, false, 0), dfs2(root, true, 0));
    }

    private int dfs2(TreeNode node, boolean goLeft, int steps) {
        if (node == null) {
            return steps - 1;
        }
        //pathLength = Math.max(pathLength, steps);

        int left = 0, right = 0;

        if (goLeft) {
            left = dfs2(node.left, false, steps + 1);
            right = dfs2(node.right, true, 1);
        } else {
            left = dfs2(node.left, false, 1);
            right = dfs2(node.right, true, steps + 1);
        }

        return Math.max(left, right);
    }

}

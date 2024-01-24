package com.lazarin.practicing.leetcode.tree.easy;

//https://leetcode.com/problems/root-equals-sum-of-children/description/
public class RootEqualsSumOfChildren {

    //T: O(1); S: O(1)
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }

    public class TreeNode {
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
    }
}

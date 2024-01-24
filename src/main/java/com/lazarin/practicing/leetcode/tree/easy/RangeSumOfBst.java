package com.lazarin.practicing.leetcode.tree.easy;

//https://leetcode.com/problems/range-sum-of-bst
public class RangeSumOfBst {

    //approach - DFS
    //T: O(N) where N is the number of nodes in the tree
    //S: O(H) where H is the height of the tree - this represent the maximum depth of the recursive call stack
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = inOrder(root, low, high);
        return sum;
    }

    private int inOrder(TreeNode root, int low, int high){
        if(root == null) return 0;

        int currentSum = 0;
        if(low <= root.val) {
            currentSum += inOrder(root.left, low, high);
        }

        if(root.val >= low && root.val <= high){
            currentSum += root.val;
        }
        if(high > root.val) {
            currentSum += inOrder(root.right, low, high);
        }
        return currentSum;
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

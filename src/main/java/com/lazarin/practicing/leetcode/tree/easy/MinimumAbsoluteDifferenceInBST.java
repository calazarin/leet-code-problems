package com.lazarin.practicing.leetcode.tree.easy;

//https://leetcode.com/problems/minimum-absolute-difference-in-bst/
public class MinimumAbsoluteDifferenceInBST {

    /**
     * approach - DSF in order traversal
     * BST in-order traversal result is a sorted array
     * So, we just need to traverse the tree and calc current node value - previous one
     * T: O(N) where N is the amount of nodes
     * S: O(N) for the auxialiary stack
     */
    int prev = Integer.MAX_VALUE;
    int ans = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return ans;
    }

    public void inOrder(TreeNode root){
        if(root.left!=null) inOrder(root.left);
        ans = Math.min(ans,Math.abs(root.val-prev));
        prev = root.val;
        if(root.right!=null) inOrder(root.right);
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

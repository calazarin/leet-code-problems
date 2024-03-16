package com.lazarin.practicing.leetcode.tree.medium;

//https://leetcode.com/problems/maximum-binary-tree/description/
public class MaximumBinaryTree {

    //approach - recursion
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(0, nums.length - 1,nums);
    }

    private TreeNode helper(int startIndex, int endIndex, int[] nums){
        if(startIndex > endIndex){
            return null;
        }
        int[] max = findMax(nums, startIndex, endIndex);
        TreeNode root = new TreeNode(max[0]);
        root.left = helper(startIndex, max[1] - 1, nums);
        root.right = helper(max[1] + 1, endIndex, nums);
        return root;
    }

    private int[] findMax(int[] nums, int minIndex, int endIndex){
        int maxIndex = -1;
        int max = Integer.MIN_VALUE;
        for(int i = minIndex; i <= endIndex; i++) {
            int newMax = Math.max(nums[i], max);
            if(newMax > max) {
                maxIndex = i;
                max = newMax;
            }
        }
        return new int[]{max, maxIndex};
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

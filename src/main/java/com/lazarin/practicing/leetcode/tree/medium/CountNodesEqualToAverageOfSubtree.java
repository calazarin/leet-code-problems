package com.lazarin.practicing.leetcode.tree.medium;

//https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/
public class CountNodesEqualToAverageOfSubtree {

    private int count = 0;

    //Approach dfs => T: O(N); S:O(N)
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return count;
    }

    private int[] dfs(TreeNode root) {

        if(root == null) {
            return new int[]{0, 0};
        }

        int[] leftSubTree = dfs(root.left);
        int[] rightSubTree = dfs(root.right);

        int nodeSum = leftSubTree[0] + rightSubTree[0] + root.val;
        int nodeCount = leftSubTree[1] + rightSubTree[1] + 1;

        if(root.val == (nodeSum / nodeCount)) {
            count += 1;
        }

        return new int[] {nodeSum, nodeCount};
    }

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){}

        public TreeNode(int val){
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
}

package com.lazarin.practicing.leetcode.tree.easy;

//https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/description/
public class SumOfRooTtoLeafBinaryNumbers {

    /**
     * approach - DFS + bite shifting
     * T: O(N) where N is the amount of nodes in the binary tree
     * S: O(H) where H is the height of the tree
     * binary number represented by the path from the root to any node
     * is the binary number of its parent left shifted by one bit + the value of current node
     */
    public int sumRootToLeaf(TreeNode root) {
        return calculateSum(root, 0);
    }

    private int calculateSum(TreeNode node, int currentSum) {
        if(node == null) return 0;

        int totalSum = (currentSum << 1) + node.val;
        int leftSubTreeSum = calculateSum(node.left, totalSum);
        int rightSubTreeSum = calculateSum(node.right, totalSum);
        if (leftSubTreeSum == 0 && rightSubTreeSum == 0) {
            return totalSum;
        } else {
            return leftSubTreeSum + rightSubTreeSum;
        }
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

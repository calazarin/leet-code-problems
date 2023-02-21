package com.lazarin.blindlistandmore.tree.easy;

import com.lazarin.blindlistandmore.tree.TreeNode;

//https://leetcode.com/problems/path-sum/
public class PathSum {

    public static void main(String args[]){

    }

    //T: O(N) - where N is the amount of nodes in the tree
    //S: O(H) where H is the height of the given tree
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum, 0);
    }

    private boolean dfs(TreeNode root, int targetSum, int currentSum){

        if(root == null){
            return false;
        }

        currentSum += root.val;

        if(root.left == null && root.right == null){
            return currentSum == targetSum;
        }

        return dfs(root.left, targetSum, currentSum)
                || dfs(root.right, targetSum, currentSum);
    }
}

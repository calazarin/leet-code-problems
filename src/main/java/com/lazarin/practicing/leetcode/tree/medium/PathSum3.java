package com.lazarin.practicing.leetcode.tree.medium;

import com.lazarin.practicing.leetcode.tree.TreeNode;

import java.util.HashMap;

//https://leetcode.com/problems/path-sum-iii
public class PathSum3 {

    //approach 1 - T: O(N^2)
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;

        //every node is considered as root; then we start a DFS on it
        return pathSum(root.left, targetSum) +
                pathSum(root.right, targetSum) + //not counting current root
                pathSumFrom(root, targetSum); //counting with current root
    }

    private int pathSumFrom(TreeNode root, long targetSum){
        if(root == null) return 0;

        int count = 0;

        if(root.val == targetSum){
            count = 1;
        }

        long newSum = targetSum - root.val;
        count += pathSumFrom(root.left, newSum);
        count += pathSumFrom(root.right, newSum);

        return count;
    }

    //approach 2 (optimized) - using a prefix sum; T:O(N)
    public int pathSum2(TreeNode root, int targetSum) {
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0l,1); //takes care when root node itself is a valid path
        return pathSumPrefixSum(root, 0, targetSum, map);
    }

    private int pathSumPrefixSum(TreeNode root, long runningSum, int target, HashMap<Long, Integer> map) {

        if (root == null){
            return 0;
        }

        runningSum += root.val;
        //check if there is any previous path that, removing it, completes our target
        int count = map.getOrDefault(runningSum - target, 0);
        map.put(runningSum, map.getOrDefault(runningSum, 0) + 1); //increment map with current running sum

        count += pathSumPrefixSum(root.left, runningSum, target, map);
        count += pathSumPrefixSum(root.right, runningSum, target, map);

        //once we are done, we backtrack as we're- dealing with paths not subtree
        map.put(runningSum, map.get(runningSum) - 1);

        return count;
    }
}

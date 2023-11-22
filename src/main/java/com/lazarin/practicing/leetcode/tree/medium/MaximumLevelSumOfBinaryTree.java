package com.lazarin.practicing.leetcode.tree.medium;

import com.lazarin.practicing.leetcode.trie.medium.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
public class MaximumLevelSumOfBinaryTree {

    //approach 1 - BFS - T:O(N); S:O(N)
    public int maxLevelSum(TreeNode root) {

        Integer maxSum = Integer.MIN_VALUE;
        int currLevel = 1, maxLevel = 1;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()){

            int levelSize = queue.size();
            int levelSum = 0;

            for(int i = 0; i < levelSize; i++){

                TreeNode curr = queue.remove();
                levelSum += curr.val;

                if(curr.left != null) {
                    queue.add(curr.left);
                }
                if(curr.right != null) {
                    queue.add(curr.right);
                }
            }

            if(levelSum > maxSum){
                maxSum = levelSum;
                maxLevel = currLevel;
            }

            currLevel++;
        }

        return maxLevel;
    }

    //approach 2 - DFS - T:O(N); S:O(N)
    public int maxLevelSum2(TreeNode root) {
        List<Integer> sumOfNodesAtLevel = new ArrayList<>();
        dfs(root, 0, sumOfNodesAtLevel);

        int maxSum = Integer.MIN_VALUE;
        int ans = 0;

        for (int i = 0; i < sumOfNodesAtLevel.size(); i++) {
            if (maxSum < sumOfNodesAtLevel.get(i)) {
                maxSum = sumOfNodesAtLevel.get(i);
                ans = i + 1;
            }
        }

        return ans;
    }

    public void dfs(TreeNode node, int level, List<Integer> sumOfNodesAtLevel) {
        if (node == null) {
            return;
        }

        if (sumOfNodesAtLevel.size() == level) {
            sumOfNodesAtLevel.add(node.val);
        } else {
            sumOfNodesAtLevel.set(level, sumOfNodesAtLevel.get(level) + node.val);
        }

        dfs(node.left, level + 1, sumOfNodesAtLevel);
        dfs(node.right, level + 1, sumOfNodesAtLevel);
    }
}

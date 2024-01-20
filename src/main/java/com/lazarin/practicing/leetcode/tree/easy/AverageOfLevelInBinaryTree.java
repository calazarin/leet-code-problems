package com.lazarin.practicing.leetcode.tree.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
public class AverageOfLevelInBinaryTree {

    //approach - BFS
    //T: O(N)
    //S: O(N)
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avg = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int qSize = queue.size();
            double sum = 0d;
            for(int i = 0; i < qSize; i++) {
                TreeNode curr = queue.poll();
                sum += curr.val;
                if(curr.left != null) queue.offer(curr.left);
                if(curr.right != null) queue.offer(curr.right);
            }
            double res = sum / qSize;
            avg.add(res);
        }

        return avg;
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

package com.lazarin.practicing.leetcode.twopointers.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
public class TwoSumIVInputIsABst {

    //approach - in order traversal (return as elements in a sorted fashion) + two pointers
    //T:O(N); S:O(N)
    public boolean findTarget(TreeNode root, int k) {
        //in order traversal returns all items sorted
        //left -> node -> right
        List<Integer> values = new ArrayList<Integer>();
        dfs(root, values);

        int i = 0, j = values.size() - 1;

        while(i < j) {
            int currSum = values.get(i) + values.get(j);

            if (currSum == k) {
                return true;
            } else if(values.get(i) + values.get(j) > k){
                j--;
            } else if(values.get(i) + values.get(j) < k){
                i++;
            }

        }
        return false;
    }

    public void dfs(TreeNode root, List<Integer> values) {

        if(root == null) return;

        dfs(root.left, values);
        values.add(root.val);
        dfs(root.right, values);

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


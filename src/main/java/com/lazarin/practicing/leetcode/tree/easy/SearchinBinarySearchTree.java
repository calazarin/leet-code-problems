package com.lazarin.practicing.leetcode.tree.easy;

import com.lazarin.practicing.leetcode.tree.TreeNode;

//https://leetcode.com/problems/search-in-a-binary-search-tree
public class SearchinBinarySearchTree {

    //approach 1 - DFS - T: O(N) where N is height of the tree; S:(N) where N is the number of nodes in the tree
    public TreeNode searchBST(TreeNode root, int val) {
        return dfs(root, val);
    }

    private TreeNode dfs(TreeNode root, int target){

        if(root == null) return null;

        if(root.val == target) return root;

        if(root.val > target) {
            //go left
            return dfs(root.left, target);
        }

        if(root .val < target){
            //go right
            return dfs(root.right, target);
        }

        return null;
    }
}

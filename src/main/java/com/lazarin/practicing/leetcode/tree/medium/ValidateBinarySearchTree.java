package com.lazarin.practicing.leetcode.tree.medium;

import com.lazarin.practicing.leetcode.tree.TreeNode;

//https://leetcode.com/problems/validate-binary-search-tree/
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return valid(root, null, null);
    }

    private boolean valid(TreeNode node, Integer min, Integer max){
        if(node == null) return true;

        if(max != null && node.val >= max || min != null && node.val <= min){
            return false;
        }

        return valid(node.left, min, node.val) &&
                valid(node.right, node.val, max);
    }
}
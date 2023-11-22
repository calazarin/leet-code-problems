package com.lazarin.practicing.leetcode.tree.easy;

import com.lazarin.practicing.leetcode.trie.medium.TreeNode;

//https://leetcode.com/problems/invert-binary-tree/
public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        if(root.left == null && root.right == null) return root;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}

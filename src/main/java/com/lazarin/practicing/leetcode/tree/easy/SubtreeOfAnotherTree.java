package com.lazarin.practicing.leetcode.tree.easy;

import com.lazarin.practicing.leetcode.trie.medium.TreeNode;

//https://leetcode.com/problems/subtree-of-another-tree/
public class SubtreeOfAnotherTree {

    //approach 1
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root == null && subRoot == null){
            return true;
        } else if(root.val == subRoot.val
                && root.left.val == subRoot.left.val
                && root.right.val == subRoot.right.val){
            return true;
        } else if(root.left != null && subRoot.left == null ||
                    root.right != null && subRoot.right == null ||
                    root.left == null && subRoot.left != null ||
                    root.right == null && subRoot.right != null){
            return false;
        }

        return isSubtree(root.right, subRoot.right)
                && isSubtree(root.left, subRoot.left);
    }

    //approach 2
    public boolean isSubtree2(TreeNode root, TreeNode subRoot) {
        if(root == null) {
            return false;
        } else if(isSameTree(root, subRoot)){
            return true;
        } else {
            return isSubtree2(root.left, subRoot)
                    || isSubtree2(root.right, subRoot);
        }
    }

    private boolean isSameTree(TreeNode root, TreeNode subRoot) {

        if(root == null && subRoot == null){
            return  true;
        }

        if(root != null && subRoot !=null && root.val == subRoot.val){
            return isSameTree(root.left, subRoot.left) &&
                    isSameTree(root.right, subRoot.right);
        }

        return false;
    }
}

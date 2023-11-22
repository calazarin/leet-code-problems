package com.lazarin.practicing.leetcode.tree.medium;

import com.lazarin.practicing.leetcode.trie.medium.TreeNode;

//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
public class LowestCommonAncestorOfBinarySearchTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode currentNode = root;
        while(currentNode != null){
            if(p.val > currentNode.val && q.val > currentNode.val){
                currentNode = currentNode.right;
            } else if (p.val < currentNode.val && q.val < currentNode.val) {
                currentNode = currentNode.left;
            } else { //split occours
                return currentNode;
            }
        }
        return currentNode;
    }

}

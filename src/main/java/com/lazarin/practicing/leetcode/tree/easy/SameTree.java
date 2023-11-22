package com.lazarin.practicing.leetcode.tree.easy;

import com.lazarin.practicing.leetcode.trie.medium.TreeNode;

import java.util.Stack;

//https://leetcode.com/problems/same-tree/
public class SameTree {

    //approach 1
    public boolean isSameTree(TreeNode p, TreeNode q) {

        Stack<TreeNode> treeStack = new Stack<>();
        treeStack.add(p);
        while (treeStack.size() > 0){
            TreeNode currentNode = treeStack.pop();
            if(currentNode.right != null) treeStack.add(currentNode.right);
            if(currentNode.left != null) treeStack.add(currentNode.left);
        }

        return false;
    }

    //When, solving with recursion, always think in the base case
    //then try to solve sub-problems first
    //approach 2
    public boolean isSameTree2(TreeNode p, TreeNode q) {
        if(p == null && q == null) { //first base case
            return true;
        } else if(p == null || q == null){ //second base case
            return false;
        } else if(p.val != q.val){ //third base case
            return false;
        } else {
            return isSameTree2(p.left, q.left) &&
                    isSameTree2(p.right, q.right);
        }
    }
}

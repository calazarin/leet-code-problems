package com.lazarin.practicing.leetcode.tree.easy;

import com.lazarin.practicing.leetcode.trie.medium.TreeNode;

public class StackData {
    TreeNode node;
    int depth;
    public StackData(TreeNode stackNode, int stackDepth){
        node = stackNode;
        depth = stackDepth;
    }
}

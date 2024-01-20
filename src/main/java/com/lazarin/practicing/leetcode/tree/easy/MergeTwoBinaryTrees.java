package com.lazarin.practicing.leetcode.tree.easy;

import java.util.Stack;

//https://leetcode.com/problems/merge-two-binary-trees/description/
public class MergeTwoBinaryTrees {

    //approach 1 - recursion
    //T: O(M) where M is the amount of nodes across the two given trees
    //S: O(M)
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if(t1 == null) return t2;
        if(t2 == null) return t1;

        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        return t1;
    }

    //approach 2 - iteratively
    //T: O(n)
    //S: O(n)
    public TreeNode mergeTrees_2(TreeNode t1, TreeNode t2) {
        if(t1 == null) return t2;
        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[]{t1, t2});
        while(!stack.isEmpty()) {
            TreeNode[] nodes = stack.pop();
            if(nodes[0] == null || nodes[1] == null) continue;
            nodes[0].val += nodes[1].val;

            if(nodes[0].left == null) {
                nodes[0].left = nodes[1].left;
            } else {
                stack.push(new TreeNode[]{nodes[0].left, nodes[1].left});
            }

            if(nodes[0].right == null) {
                nodes[0].right = nodes[1].right;
            } else {
                stack.push(new TreeNode[]{nodes[0].right, nodes[1].right});
            }
        }
        return t1;
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

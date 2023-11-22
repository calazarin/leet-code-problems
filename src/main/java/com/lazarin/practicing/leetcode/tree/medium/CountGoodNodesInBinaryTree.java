package com.lazarin.practicing.leetcode.tree.medium;

import com.lazarin.practicing.leetcode.trie.medium.TreeNode;

import java.util.Stack;

//https://leetcode.com/problems/count-good-nodes-in-binary-tree
public class CountGoodNodesInBinaryTree {

    class Container{
        TreeNode node;
        int currentMax;
        Container(TreeNode node, int currentMax){
            this.node = node;
            this.currentMax = currentMax;
        }
    }

    //approach 1: iteratively; T:O(N); S: O(N)
    //we do need a container to track the max so far from parent
    public int goodNodes(TreeNode root) {

        if(root == null){
            return 0;
        }

        int counter = 0;
        Stack<Container> stack = new Stack<Container>();
        Container cont = new Container(root, Integer.MIN_VALUE);
        stack.push(cont);

        while(!stack.isEmpty()) {

            Container container = stack.pop();
            TreeNode node = container.node;
            int maxVal = container.currentMax;

            if(node.val >= maxVal) {
                counter++;
                maxVal = node.val;
            }

            if(node.left != null) {
                stack.push(new Container(node.left, maxVal));
            }

            if(node.right != null) {
                stack.push(new Container(node.right, maxVal));
            }

        }
        return counter;
    }

    //approach 2 - recursive dfs
    public int goodNodes2(TreeNode root){
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int max){
        if(root == null) return 0;

        int counter = 0;

        if(root.val >= max){
            counter++;
        }

        max = Math.max(root.val, max);

        counter += dfs(root.left,max);
        counter += dfs(root.right, max);

        return counter;
    }

}

package com.lazarin.practicing.leetcode.tree.easy;

import com.lazarin.practicing.leetcode.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/binary-tree-preorder-traversal/
public class BinaryTreePreorderTraversal {

    public static void main(String args[]){

    }

    //approach 1: recursive dfs
    //T: O(N) - We visit each node once and perform a constant amount of work at each node.
    //S: O(H)
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        dfs(root, nodes);
        return nodes;
    }

    private void dfs(TreeNode root, List<Integer> nodes){
        if(root == null){
            return;
        }
        nodes.add(root.val);
        dfs(root.left, nodes);
        dfs(root.right, nodes);
    }

    //approach 2 - iteratively
    public List<Integer> preorderTraversal2(TreeNode root) {

        List<Integer> nodes = new ArrayList<>();
        if(root != null){
            Stack<TreeNode> stack = new Stack<>();
            stack.add(root);
            while(!stack.isEmpty()){
                TreeNode curr = stack.pop();
                nodes.add(curr.val);

                //first in, last out!
                if(curr.right != null){
                    stack.add(curr.right);
                }
                if(curr.left != null){
                    stack.add(curr.left);
                }

            }
        }
        return nodes;
    }
}

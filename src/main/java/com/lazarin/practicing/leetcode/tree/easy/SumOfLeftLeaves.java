package com.lazarin.practicing.leetcode.tree.easy;

import com.lazarin.practicing.leetcode.trie.medium.TreeNode;

import java.util.Stack;

//https://leetcode.com/problems/sum-of-left-leaves/
public class SumOfLeftLeaves {

    //T: O(n) where N is the amount of nodes in the tree
    //S: O(n) where N nodes
    public int sumOfLeftLeaves(TreeNode root) {

        Stack<TreeNode> t_stack = new Stack<>();
        Stack<Integer> p_stack = new Stack<>(); //0 => r, -1 => left; 1 => r

        t_stack.add(root);
        p_stack.add(0);

        int sum = 0;
        while(!t_stack.isEmpty()){

            TreeNode currentNode = t_stack.pop();
            Integer position = p_stack.pop();

            if(currentNode.left == null && currentNode.right == null && position.equals(-1)){
                sum+=currentNode.val;
            } else {
                if(currentNode.left != null){
                    p_stack.add(-1);
                    t_stack.add(currentNode.left);
                }
                if(currentNode.right != null){
                    p_stack.add(1);
                    t_stack.add(currentNode.right);
                }
            }
        }
        return sum;
    }

    /**
     * Iterative - 2
     */
    public int sumOfLeftLeaves2(TreeNode root) {

        if(root == null) return 0;
        int ans = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.empty()) {
            TreeNode node = stack.pop();
            if(node.left != null) {
                if (node.left.left == null && node.left.right == null){
                    ans += node.left.val;
                }else{
                    stack.push(node.left);
                }
            }
            if(node.right != null) {
                if (node.right.left != null || node.right.right != null)
                    stack.push(node.right);
            }
        }
        return ans;
    }

    //recursive
    public int sumOfLeftLeaves3(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left != null && root.left.left == null && root.left.right == null){
            return root.left.val + sumOfLeftLeaves3(root.right);
        } else {
            return sumOfLeftLeaves3(root.left) + sumOfLeftLeaves3(root.right);
        }
    }
}

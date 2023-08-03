package com.lazarin.practicing.leetcode.tree.easy;

import com.lazarin.practicing.leetcode.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/leaf-similar-trees
public class LeafSimilarTrees {

    //approach 1 - DFS iteratively; T: O(N); S:O(N)
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return collectLeaves(root1).equals(collectLeaves(root2));
    }

    private List<Integer> collectLeaves(TreeNode root){

        List<Integer> leaves = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        while(!stack.isEmpty()){

            TreeNode curr = stack.pop();

            if(curr.left == null && curr.right == null){
                leaves.add(curr.val);
            } else {

                if(curr.right != null) {
                    stack.add(curr.right);
                }

                if(curr.left != null){
                    stack.add(curr.left);
                }
            }
        }
        return leaves;
    }

    //approach 2 - using recursion; T: O(T1+ T2); S: O(T1+ T2)
    public boolean leafSimilar2(TreeNode root1, TreeNode root2) {
        return dfs(root1, new ArrayList<Integer>())
                .equals(dfs(root2, new ArrayList<Integer>()));
    }

    private List<Integer> dfs(TreeNode root, List<Integer> leaves){

        if(root == null) {
            return new ArrayList<>(leaves);
        }

        if(root.left == null && root.right == null){
            leaves.add(root.val);
        }

        dfs(root.left, leaves);
        dfs(root.right, leaves);

        return leaves;
    }
}

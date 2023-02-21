package com.lazarin.blindlistandmore.tree.easy;

import com.lazarin.blindlistandmore.tree.TreeNode;
import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/binary-tree-postorder-traversal/
public class BinaryTreePostOrderTraversal {

    public static void main(String args[]){

    }

    //approach 1 - iteratively using linked list and add first
    public List<Integer> postorderTraversal(TreeNode root) {

        LinkedList<Integer> answer = new LinkedList<>();
        if(root == null){
            return answer;
        }
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            answer.addFirst(current.val);
            if(current.left != null){
                stack.add(current.left);
            }
            if(current.right != null){
                stack.add(current.right);
            }
        }
        return answer;
    }

    //approach 2 - recursive
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> answer = new LinkedList<>();
        dfs(root, answer);
        return answer;
    }

    private void dfs(TreeNode root, List<Integer> answer) {
        if(root == null){
            return;
        }
        dfs(root.left,answer);
        dfs(root.right,answer);
        answer.add(root.val);
    }

}

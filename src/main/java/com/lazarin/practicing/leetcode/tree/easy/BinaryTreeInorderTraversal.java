package com.lazarin.practicing.leetcode.tree.easy;

import com.lazarin.practicing.leetcode.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/binary-tree-inorder-traversal/
public class BinaryTreeInorderTraversal {

    /*
    Inorder
    1. Traverse the left subtree, i.e., call Inorder(left->subtree)
    2. Visit the root
    3. Traverse the right subtree, i.e., call Inorder(right->subtree)

    Preorder
    1. Visit the root.
    2. Traverse the left subtree, i.e., call Preorder(left->subtree)
    3. Traverse the right subtree, i.e., call Preorder(right->subtree)

    Postorder
    1. Traverse the left subtree, i.e., call Postorder(left->subtree)
    2. Traverse the right subtree, i.e., call Postorder(right->subtree)
    3. Visit the root

     */
    public static void main(String args[]){

    }

    //T: O(N)
    //S: O(N)
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resp = new ArrayList<>();
        inorder(root, resp);
        return resp;
    }

    private void inorder(TreeNode root, List<Integer> resp){
        if(root == null){
            return;
        }
        inorder(root.left, resp);
        resp.add(root.val);
        inorder(root.right, resp);
    }

    //T: O(N)
    //O: O(N)
    public List<Integer> inorderTraversal2(TreeNode root) {

        List<Integer> resp = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root; //curr is our pointer

        while(curr != null || !stack.isEmpty()){

            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            resp.add(curr.val);
            curr = curr.right;
        }
        return resp;
    }
}

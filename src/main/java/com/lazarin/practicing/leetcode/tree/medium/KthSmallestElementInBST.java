package com.lazarin.practicing.leetcode.tree.medium;

import com.lazarin.practicing.leetcode.tree.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

//https://leetcode.com/problems/kth-smallest-element-in-a-bst/
public class KthSmallestElementInBST {

    //Approach - if we run a BST in-order and put all elements in an array,
    //we are good!
    //Time complexity : O(N)O(N)O(N) to build a traversal.
    //Space complexity : O(N)O(N)O(N) to keep an inorder traversal.
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> nums = inOrder(root, new ArrayList<>());
        return nums.get(k - 1);
    }

    private ArrayList<Integer> inOrder(TreeNode root, ArrayList<Integer> result){

        if(root == null){
            return result;
        }

        inOrder(root.left, result);
        result.add(root.val);
        inOrder(root.right, result);
        return result;
    }


    //iteratively
    public int kthSmallest2(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<>();
        int n = 0;
        TreeNode curr = root;
        while(curr != null && !stack.isEmpty()){

            while(curr != null){
                stack.add(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            n++;

            if(n == k){
                return curr.val;
            }

            curr = curr.right;
        }
        return 0;
    }
}

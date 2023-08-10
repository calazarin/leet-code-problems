package com.lazarin.practicing.leetcode.tree.medium;

import com.lazarin.practicing.leetcode.tree.TreeNode;

//https://leetcode.com/problems/delete-node-in-a-bst
public class DeleteNodeInaBST {

    //approach 1 - keep in mind this is a BST; smaller nodes go to left -T:O(H)
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;

        if(root.val == key) {
            return helper(root);
        }

        TreeNode dummy = root;
        while(root != null) {
            if(root.val > key){
                if(root.left != null && root.left.val == key){
                    root.left = helper(root.left);
                    break;
                } else {
                    root = root.left;
                }
            } else {
                if(root.right != null && root.right.val == key){
                    root.right = helper(root.right);
                }else {
                    root = root.right;
                }
            }
        }
        return dummy;
    }

    private TreeNode helper(TreeNode root){
        if(root.left == null){
            return root.right;
        } else if(root.right == null) {
            return root.left;
        } else {
            TreeNode rightChild = root.right;
            TreeNode lastRight = findLastRight(root.left);
            lastRight.right = rightChild;
            return root.left;
        }
    }

    private TreeNode findLastRight(TreeNode root){
        if(root.right == null){
            return root;
        }
        return findLastRight(root.right);
    }

    //approach 2
    public TreeNode deleteNode2(TreeNode root, int key) {

        if(root == null) return null;

        if (key > root.val) { //it is a BST; then, go right as value is greater than root
            root.right = deleteNode2(root.right, key);
        } else if (key < root.val) {  //it is a BST; then, go left as value is greater than root
            root.left = deleteNode2(root.left, key);
        } else {
            //we found the node, lets delete it
            if (root.left == null){
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }
            //now, find the min node in the right subtree because this needs to be the new root
            TreeNode current = root.right;
            while (current.left != null){
                current = current.left;
            }
            root.val = current.val;
            //now remove the duplicated node
            root.right = deleteNode2(root.right, root.val);
        }
        return root;
    }
}

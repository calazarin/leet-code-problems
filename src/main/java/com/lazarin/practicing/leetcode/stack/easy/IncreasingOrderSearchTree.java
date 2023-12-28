package com.lazarin.practicing.leetcode.stack.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/increasing-order-search-tree/
public class IncreasingOrderSearchTree {

    public TreeNode increasingBST(TreeNode root) {

        List<Integer> nodes = new ArrayList<>();

        inOrder(root, nodes);

        if(nodes.isEmpty()) return null;

        TreeNode newRoot = new TreeNode(nodes.get(0));
        TreeNode temp = newRoot;

        for(int i = 1; i < nodes.size(); i++) {
            TreeNode node = new TreeNode(nodes.get(i));
            temp.right = node;
            temp = node;
        }
        return newRoot;
    }

    private void inOrder(TreeNode node, List<Integer> values) {
        if(node == null) return;

        inOrder(node.left, values);
        values.add(node.val);
        inOrder(node.right, values);
    }

    TreeNode temp = null;
    TreeNode newRoot = null;

    public TreeNode increasingBST_2(TreeNode root) {
        temp = null;
        inorder(root);
        return newRoot;
    }

    public void inorder(TreeNode root){

        if(root==null) return;

        inorder(root.left);

        TreeNode newNode = new TreeNode(root.val);
        if(temp == null) {
            temp = newNode;
            newRoot = newNode;
        } else {
            temp.right= newNode;
            temp = newNode;
        }
        inorder(root.right);

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

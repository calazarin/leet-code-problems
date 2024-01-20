package com.lazarin.practicing.leetcode.tree.easy;

import java.util.LinkedList;

//https://leetcode.com/problems/count-complete-tree-nodes/
public class CountCompleteTreeNodes {

    //approach 1 - BFS ("brute force" )
    //T: O(N); S:O(H) -> h is the height of a binary tree (at maximum O(logN))
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode curr = queue.pop();
                count += 1;
                if(curr.left != null) queue.push(curr.left);
                if(curr.right != null) queue.push(curr.right);
            }
        }
        return count;
    }

    //approach 2 - take decision based on the heights of the left and right subtree
    //T: O((logn)^2); S: O(logn)
    public int countNodes_2(TreeNode root) {
        if(root == null) return 0;
        int left = getLeftHeight(root);
        int right = getRightHeight(root);

        if(left == right) return ((2 << left) - 1); //2^left

        else return countNodes_2(root.left) + countNodes_2(root.right) + 1;
    }

    private int getLeftHeight(TreeNode node){
        int count = 0;
        while(node.left != null) {
            count++;
            node = node.left;
        }
        return count;
    }

    private int getRightHeight(TreeNode node){
        int count  = 0;
        while(node.right != null) {
            count++;
            node = node.right;
        }
        return count;
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

package com.lazarin.practicing.leetcode.tree.easy;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/find-mode-in-binary-search-tree/
public class FindModeInBinarySearchTree {

    //approach 1 - in order traversal + arraylist + counter + prev
    //T: O(N); S: O(N) where N is the amount of nodes in the tree
    Integer prev;
    int count = 1;
    int max = 0;
    public int[] findMode(TreeNode root) {
        List<Integer> modes = new ArrayList<>();

        inOrder(root, modes);

        int[] ans = new int[modes.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = modes.get(i);
        }
        return ans;
    }

    private void inOrder(TreeNode root, List<Integer> modes) {
        if(root == null) return;
        inOrder(root.left, modes);

        if(prev != null) {
            if(prev == root.val){
                count++;
            } else {
                count = 1;
            }
        }

        if(count > max) {
            modes.clear();
            modes.add(root.val);
            max = count;
        } else if(count == max){
            modes.add(root.val);
        }

        prev = root.val;
        inOrder(root.right, modes);
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

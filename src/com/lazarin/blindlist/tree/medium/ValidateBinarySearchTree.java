package com.lazarin.blindlist.tree.medium;

import com.lazarin.blindlist.tree.TreeNode;

//https://leetcode.com/problems/validate-binary-search-tree/
public class ValidateBinarySearchTree {

    public static void main(String arg[]){

        TreeNode t5 = new TreeNode(5);
        TreeNode t4 = new TreeNode(4);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode t3 = new TreeNode(3);

        t6.left = t3;
        t6.right = t7;
        t5.left = t4;
        t5.right = t6;

        System.out.print(isValidBST(t5));

    }

    public static boolean isValidBST(TreeNode root) {
        return valid(root, null, null);
    }

    private static boolean valid(TreeNode node, Integer min, Integer max){
        if(node == null) return true;

        if(max != null && node.val >= max || min != null && node.val <= min){
            return false;
        }

        return valid(node.left, min, node.val) &&
                valid(node.right, node.val, max);
    }


}

package com.lazarin.learning.recursion.tree;

import java.util.List;

public class BinarySearchTreeMain {

    public static void main(String args[]){
        List<Integer> data = List.of(100, 80, 50, 90, 30, 60, 90, 85, 95, 120, 110, 108, 115, 140, 150);
        TreeNode root = null;
        for(Integer node : data){
            root = insertNode(root, node);
        }
        printLeaves(root);
    }

    public static void printLeaves(TreeNode root){
        if(root == null) return;
        //leaf node; there are no children
        if(root.left == null && root.right == null){
            System.out.print(root.value + ", ");
            return;
        }
        //left hand side first
        if(root.left != null) printLeaves(root.left);
        if(root.right != null) printLeaves(root.right);

    }

    public static TreeNode insertNode(TreeNode head, int data){

        //base case
        if(head == null) {
            head = new TreeNode();
            head.value = data;
            return head;
        }

        if(head.value < data){
            head.right = insertNode(head.right, data);
        } else {
            head.left = insertNode(head.left, data);
        }
        return head;
    }

}

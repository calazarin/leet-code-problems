package com.lazarin.blindlistandmore.tree;

import java.util.Stack;

public class SameTree {

    public static void main(String args[]){

        TreeNode rootTree1 = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(1);
        rootTree1.left = n1;
        rootTree1.right = n2;

        TreeNode rootTree2 = new TreeNode(1);
        TreeNode n1_1 = new TreeNode(1);
        TreeNode n2_2 = new TreeNode(2);
        rootTree2.left = n1_1;
        rootTree2.right = n2_2;

        System.out.println(isSameTree2(rootTree1,rootTree2));

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        Stack<TreeNode> treeStack = new Stack<>();
        treeStack.add(p);
        while (treeStack.size() > 0){
            TreeNode currentNode = treeStack.pop();
            System.out.println(currentNode.val);
            if(currentNode.right != null) treeStack.add(currentNode.right);
            if(currentNode.left != null) treeStack.add(currentNode.left);
        }

        return false;
    }

    //When, solving with recursion, always think in the base case
    //then try to solve sub-problems first
    public static boolean isSameTree2(TreeNode p, TreeNode q) {
        if(p == null && q == null) { //first base case
            return true;
        } else if(p == null || q == null){ //second base case
            return false;
        } else if(p.val != q.val){ //third base case
            return false;
        } else {
            return isSameTree2(p.left, q.left) &&
                    isSameTree2(p.right, q.right);
        }
    }
}

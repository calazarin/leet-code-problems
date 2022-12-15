package com.lazarin.blindlistandmore.tree;

public class InvertTree {

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

        System.out.println(invertTree(rootTree1));
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        if(root.left == null && root.right == null) return root;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}

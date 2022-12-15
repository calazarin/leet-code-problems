package com.lazarin.blindlistandmore.tree;

public class LowestCommonAncestorOfBinarySearchTree {

    public static void main(String args[]){
        TreeNode rootTree1 = new TreeNode(6);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(8);
        TreeNode n3 = new TreeNode(0);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(7);
        TreeNode n6 = new TreeNode(9);
        rootTree1.left = n1;
        rootTree1.right = n2;

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode currentNode = root;
        while(currentNode != null){
            if(p.val > currentNode.val && q.val > currentNode.val){
                currentNode = currentNode.right;
            } else if (p.val < currentNode.val && q.val < currentNode.val) {
                currentNode = currentNode.left;
            } else { //split occours
                return currentNode;
            }
        }
        return currentNode;
    }

    private TreeNode isLCA(TreeNode root, TreeNode p, TreeNode q) {

        if(root.left != null && root.right != null){

            if(root.left.val == p.val && root.right.val == q.val){
                return root;
            }
        } else {



        }

        return null;
    }

}

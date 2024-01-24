package com.lazarin.learning.leetcode.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//N-ary tree implementation
public class NAryTreeMain {

    public class TreeNode{
        int val;
        List<TreeNode> children = new LinkedList<>();

        TreeNode(int data){
            val = data;
        }

        TreeNode(int data,List<TreeNode> child){
            val = data;
            children = child;
        }
    }

    public static void main(String[] args) {
        NAryTreeMain.TreeNode root = new NAryTreeMain().new TreeNode(1);
        root.children.add(new NAryTreeMain().new TreeNode(2));
        root.children.add(new NAryTreeMain().new TreeNode(3));
        root.children.add(new NAryTreeMain().new TreeNode(4));
        root.children.get(0).children.add(new NAryTreeMain().new TreeNode(5));
        root.children.get(0).children.add(new NAryTreeMain().new TreeNode(6));
        root.children.get(0).children.add(new NAryTreeMain().new TreeNode(7));
        root.children.get(1).children.add(new NAryTreeMain().new TreeNode(8));
        root.children.get(2).children.add(new NAryTreeMain().new TreeNode(9));
        root.children.get(2).children.add(new NAryTreeMain().new TreeNode(10));
        root.children.get(2).children.add(new NAryTreeMain().new TreeNode(11));
        printNAryTreeLevelOrderTraversal(root);
    }

    private static void printNAryTreeLevelOrderTraversal(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i=0;i<len;i++) {
                TreeNode node = queue.poll();
                assert node != null;
                System.out.print(node.val + " ");
                for (TreeNode item : node.children) {
                    queue.offer(item);
                }
            }
            System.out.println();
        }
    }

}

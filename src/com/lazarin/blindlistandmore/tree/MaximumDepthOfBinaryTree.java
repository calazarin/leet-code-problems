package com.lazarin.blindlistandmore.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaximumDepthOfBinaryTree {

    public static void main(String args[]){

        TreeNode root = new TreeNode(3);
        TreeNode n1 = new TreeNode(9);
        TreeNode n2 = new TreeNode(20);
        TreeNode n3 = new TreeNode(15);
        TreeNode n4 = new TreeNode(7);

        n2.right = n4;
        n2.left = n3;

        root.left = n1;
        root.right = n2;

        System.out.println(maxDepth2(root));
   }

   // we need to use deep first search (in this case, recursive)
    //T: O(n); S O(n)
    public static int maxDepth(TreeNode root) {

        if(root == null) return 0;

        //+1 because it is our current position
        return 1 +  Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    //breath search solution
    public static int maxDepth2(TreeNode root) {

        if(root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        var level = 0;

        queue.add(root);
        while(!queue.isEmpty()){

            for(int i = 0; i < queue.size(); i++){
                TreeNode current = queue.poll();
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
            level++;
        }

        return level;

    }

    //deep first iterative
    public static int maxDepth3(TreeNode root) {

        Stack<StackData> stack = new Stack<StackData>();
        stack.add(new StackData(root, 1));
        var result = 0;
        while(stack.size() > 0){

            StackData nodeData = stack.pop();
            result = Math.max(result, nodeData.depth);
            if(nodeData.node.right != null) stack.add(new StackData(nodeData.node.right, nodeData.depth + 1));
            if(nodeData.node.left != null) stack.add(new StackData(nodeData.node.left, nodeData.depth + 1));
        }
        return result;
    }

}

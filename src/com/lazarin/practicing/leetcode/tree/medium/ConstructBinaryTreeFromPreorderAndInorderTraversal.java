package com.lazarin.practicing.leetcode.tree.medium;

import com.lazarin.practicing.leetcode.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

//pre-order (when we visit the node? pre)
//node -> left -> right

//in-order  (when we visit the node? in)
//left -> node -> right

//post-order  (when we visit the node? post)
//left -> right -> node

//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public static void main(String args[]) {

    }

    public TreeNode buildTree(int[] preorder, int[] inorder){
        Map<Integer, Integer> inMap = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            inMap.put(inorder[i], i);
        }

        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);
    }

    private TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd,
                           Map<Integer, Integer> inMap) {

        if(preStart > preEnd || inStart > inEnd){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);

        int inRootIndex = inMap.get(root.val);

        int numsLeft = inRootIndex - inStart;

        root.left = build(preorder, preStart + 1, preStart + numsLeft,
                inorder, inStart, inRootIndex - 1, inMap);

        root.right = build(preorder, preStart + numsLeft + 1, preStart + preEnd,
                inorder, inRootIndex + 1, inEnd, inMap);

        return root;
    }
}
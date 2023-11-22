package com.lazarin.practicing.leetcode.tree.medium;

import com.lazarin.practicing.leetcode.trie.medium.TreeNode;

import java.util.HashMap;
import java.util.Map;


//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

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
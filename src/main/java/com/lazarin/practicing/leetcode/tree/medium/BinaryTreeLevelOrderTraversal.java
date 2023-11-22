package com.lazarin.practicing.leetcode.tree.medium;

import com.lazarin.practicing.leetcode.trie.medium.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/binary-tree-level-order-traversal/
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> levelResult = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode currentNode = queue.remove();
                levelResult.add(currentNode.val);
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }
            result.add(levelResult);
        }

        return result;
    }

}

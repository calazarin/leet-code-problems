package com.lazarin.practicing.leetcode.tree.easy;

import com.lazarin.practicing.leetcode.trie.medium.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/balanced-binary-tree/
public class MinimumDepthOfBinaryTree {

    //T: O(N) where N is the number of nodes
    //S: O(N) N is the height of the tree
    public int minDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 1;
        }

        if(root.left == null){
            return 1 + minDepth(root.right);
        }

        if(root.right == null){
            return 1 + minDepth(root.left);
        }

        //var left = root.left != null ? minDepth(root.left) : Integer.MAX_VALUE;
        //var right = root.right != null ? minDepth(root.right) : Integer.MAX_VALUE;
        return 1 + Math.min(minDepth(root.left),minDepth(root.right));

    }

    //BFS - same time and space complexity
    public int minDepth2(TreeNode root) {
        if(root == null){
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        int depth = 1;
        q.add(root);
        while(!q.isEmpty()){
            var size = q.size();
            while(size-- > 0){
                root = q.poll();

                if(root.left == null && root.right == null){
                    return depth;
                }
                if(root.left != null){
                    q.add(root.left);
                }
                if(root.right != null){
                    q.add(root.right);
                }
            }
            depth++;
        }
        return depth;
    }

}

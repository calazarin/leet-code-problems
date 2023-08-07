package com.lazarin.practicing.leetcode.tree.easy;

import com.lazarin.practicing.leetcode.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/symmetric-tree/
public class SymmetricTree {

    //recursive
    //T: O(N) where N is the # of nodes in the tree
    //S: O(N) where N is the number of recursive calls bound by the height of the tree
    public boolean isSymmetric2(TreeNode root) {
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode leftTree, TreeNode rightTree){

        if(leftTree == null && rightTree == null){
            return true;
        }

        if (leftTree == null || rightTree == null){
            return false;
        }

        return leftTree.val == rightTree.val &&
                isMirror(leftTree.left, rightTree.right) &&
                isMirror(leftTree.right, rightTree.left);
    }

    //T: O(N) where N is the # of nodes in the tree
    //S: O(N) as we need a queue if the maxium amount of nodes of trees
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        queue.add(root);

        while(!queue.isEmpty()){

            TreeNode t1 = queue.poll();
            TreeNode t2 = queue.poll();

            if(t1 == null && t2 == null){
                continue;
            }

            if(t1 == null || t2 == null){
                return false;
            }

            if(t1.val != t2.val){
                return false;
            }

            queue.add(t1.left);
            queue.add(t2.right);

            queue.add(t1.right);
            queue.add(t2.left);

        }
        return true;
    }

    private boolean checkSides(List<Integer> left, List<Integer> right){
        if (left.size() != right.size()){
            return false;
        } else {
            left.sort(Integer::compareTo);
            right.sort(Integer::compareTo);
            return left.containsAll(right);
        }
    }
}

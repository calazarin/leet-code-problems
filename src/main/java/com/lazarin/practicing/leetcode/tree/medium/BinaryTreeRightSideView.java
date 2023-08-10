package com.lazarin.practicing.leetcode.tree.medium;

import com.lazarin.practicing.leetcode.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/binary-tree-right-side-view
public class BinaryTreeRightSideView {

    //approach 1; T:O(N); S:O(N)
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if(root == null) return answer;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            TreeNode last = queue.peekLast();
            answer.add(last.val);
            for(int i  = 0; i < size; i++){
                TreeNode curr = queue.pollFirst();
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
        }
        return answer;
    }

    //approach 2; T:O(N); S:O(N)
    public List<Integer> rightSideView2(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if(root == null) return answer;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i  = 0; i < size; i++){
                TreeNode curr = queue.poll();
                if(i == size - 1){
                    answer.add(curr.val);
                }
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
        }
        return answer;
    }
}

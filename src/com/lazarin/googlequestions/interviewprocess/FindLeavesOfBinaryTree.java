package com.lazarin.googlequestions.interviewprocess;

import com.lazarin.blindlist.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-leaves-of-binary-tree
public class FindLeavesOfBinaryTree {

    //DFS with Sorting
    public static void main(String args[]){

    }

    //Time: O(N)
    //Space: O(N)
    public List<List<Integer>> findLeaves(TreeNode root) {

        List<List<Integer>> resp = new ArrayList<>();
        getHeight(root,resp);
        return resp;

    }

    private int getHeight(TreeNode root, List<List<Integer>> resp){

        if(root == null){
            return -1;
        }
        //left side height
        int leftSideHeight = getHeight(root.left, resp);
        int rightSideHeight = getHeight(root.right, resp);

        int currentNodeHeight = Math.max(leftSideHeight, rightSideHeight) + 1;

        if (resp.size() == currentNodeHeight) {
            resp.add(new ArrayList<>());
        }

        resp.get(currentNodeHeight).add(root.val);
        return currentNodeHeight;

    }
}

//root = 1
//resp = [ ]
//stack
// 1 / resp = [[4, 5], [2]] / currentNodeHeight = 1
// 3 / resp = [[4, 5, 3], [2], [1]] / 0



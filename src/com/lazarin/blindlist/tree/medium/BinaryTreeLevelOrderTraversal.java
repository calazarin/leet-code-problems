package com.lazarin.blindlist.tree.medium;

import com.lazarin.blindlist.tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/binary-tree-level-order-traversal/
public class BinaryTreeLevelOrderTraversal {

      public static void main(String args[]){

          /*
            Input: root = [3,9,20,null,null,15,7]
            Output: [[3],[9,20],[15,7]]
            */
          TreeNode tree = new TreeNode(3);
          TreeNode tree9 = new TreeNode(9);
          TreeNode tree20 = new TreeNode(20);
          TreeNode tree15 = new TreeNode(15);
          TreeNode tree7 = new TreeNode(7);

          tree20.left = tree15;
          tree20.right = tree7;

          tree.left = tree9;
          tree.right = tree20;

          var resp = levelOrder(tree);

          /*
            Input: root = [1]
            Output: [[1]]
         */


         /*
           Input: root = []
           Output: []
         */


      }

    public static List<List<Integer>> levelOrder(TreeNode root) {

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

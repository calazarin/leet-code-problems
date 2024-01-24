package com.lazarin.practicing.leetcode.tree.easy;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/maximum-depth-of-n-ary-tree/description/
public class MaximumDepthOfNaryTree {

   //approach - recursion, DFS
   //T: O(N); S: (H)
   public int maxDepth(Node node){
        if(node == null) return 0;
        int max = 0;
        for(Node child : node.children){
            max = Math.max(max, maxDepth(child));
        }
        return max + 1;
    }

    //approach 2 - iterative, BFS
    //T: O(N); S: O(N)
    public int maxDepth_2(Node root){
        int depth = 0;
        if (root == null) return depth;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            for(int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                if(node != null && node.children != null && !node.children.isEmpty()){
                    for(Node child : node.children) {
                        queue.offer(child);
                    }
                }
            }
            depth += 1;
        }

        return depth;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}

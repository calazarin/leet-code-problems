package com.lazarin.practicing.leetcode.stack.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/n-ary-tree-postorder-traversal/
public class NaryTreePostorderTraversal {


    //post-order: left, right, root
    //approach 1 - recursion (DFS) - T:O(N); S: O(N)
    public List<Integer> postorder(Node root) {
        List<Integer> nodes = new ArrayList<>();
        postOrder(root, nodes);
        return nodes;
    }

    private void postOrder(Node root, List<Integer> nodes){
        if(root == null) return;

        for(Node child : root.children){
            postOrder(child, nodes);
        }
        nodes.add(root.val);
    }

    //approach 2 - iteratively
    public List<Integer> postorder_2(Node root) {

        LinkedList<Integer> nodes = new LinkedList<>();
        if(root == null) return nodes;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){

            Node curr = stack.pop();
            nodes.addFirst(curr.val);

            for(Node child : curr.children){
                stack.push(child);
            }

        }
        return nodes;
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

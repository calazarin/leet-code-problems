package com.lazarin.practicing.leetcode.stack.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/n-ary-tree-preorder-traversal/
public class NaryTreePreorderTraversal {

    //approach 1 - recursive
    //T: O(N); S:O(N)
    public List<Integer> preorder(Node root) {
        List<Integer> nodes = new ArrayList<>();
        preorder(root, nodes);
        return nodes;
    }

    private void preorder(Node root, List<Integer> nodes){
        if(root == null) return;

        nodes.add(root.val);

        if(root.children != null){
            for(Node node : root.children) {
                preorder(node, nodes);
            }
        }

    }

    //approach 2 - recursive
    //T: O(N); S: O(N)
    public List<Integer> preorder_2(Node root) {
        List<Integer> nodes = new ArrayList<>();

        if(root == null) return nodes;

        Stack<Node> stack = new Stack();
        stack.push(root);

        while(!stack.isEmpty()) {

            Node curr = stack.pop();
            nodes.add(curr.val);

            for(int i = curr.children.size() - 1; i >= 0; i--){
                Node child = curr.children.get(i);
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

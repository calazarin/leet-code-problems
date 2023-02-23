package com.lazarin.learning.leetcode.tree;

import java.util.LinkedList;

public class TreeIncludesMain {

    public static void main(String args[]){
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;

        var result = breathFirstSearch(a, "E");
        System.out.println(result);
    }

    public static boolean breathFirstSearch(Node root, String target){

        if(root == null) return false;

        LinkedList<Node> queue = new LinkedList();
        queue.add(root);

        while(!queue.isEmpty()){
            Node currentNode = queue.pop();
            if(currentNode.value.equals(target)) return true;
            if(currentNode.left != null) queue.add(currentNode.left);
            if(currentNode.right != null) queue.add(currentNode.right);
        }

        return false;
    }

    public static boolean breathFirstSearchRecursive(Node root, String target){

        if(root == null) return false;

        if(root.value.equals(target)) return true;

        return breathFirstSearchRecursive(root.left, target) ||
                breathFirstSearchRecursive(root.left, target);

    }
}

package com.lazarin.learning.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BreathFirstTraversalMain {

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

        var result = breathFirstValues(a);
        System.out.println(result);
    }

    public static List<String> breathFirstValues(Node root) {

        if (root == null) return new ArrayList<>();

        LinkedList<Node> queue = new LinkedList();
        List<String> result = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node currentNode = queue.poll();
            result.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode  .right);
            }
        }
        return result;
    }
}

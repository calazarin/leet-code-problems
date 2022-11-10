package com.lazarin.learning.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DeepFirstTraversalMain {

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

        var result = deepFirstValuesRecursive(a);
        System.out.println(result);
    }

    public static List<String> deepFirstValues(Node root){
        List<String> result = new ArrayList<>();
        if(root == null) return result;

        Stack<Node> stack = new Stack<>();
        stack.add(root);

        while(stack.size() > 0){

            Node currentNode = stack.pop();

            result.add(currentNode.value);

            if(currentNode.right != null){
                stack.add(currentNode.right);
            }

            if(currentNode.left != null){
                stack.add(currentNode.left);
            }

        }
        return result;

    }

    public static List<String> deepFirstValuesRecursive(Node root){

        if(root == null) return new ArrayList<>();
        var result = new ArrayList<String>();
        result.add(root.value);
        result.addAll(deepFirstValuesRecursive(root.left));
        result.addAll(deepFirstValuesRecursive(root.right));
        return result;
    }


}

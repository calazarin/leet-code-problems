package com.lazarin.learning.tree;

public class TreeSumMain {

    public static void main(String args[]){
        NodeInt a = new NodeInt(1);
        NodeInt b = new NodeInt(10);
        NodeInt c = new NodeInt(20);
        NodeInt d = new NodeInt(30);
        NodeInt e = new NodeInt(40);
        NodeInt f = new NodeInt(50);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;

        var result = sumTreeNodes(a);
        System.out.println(result);
    }

    public static int sumTreeNodes(NodeInt root){

        if(root == null) return 0;

        return root.value + sumTreeNodes(root.left)
                + sumTreeNodes(root.right);
    }

}

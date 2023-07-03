package com.lazarin.learning.leetcode.tree;

public class TreeMinMain {

    public static void main(String args[]){
        NodeInt a = new NodeInt(80);
        NodeInt b = new NodeInt(1);
        NodeInt c = new NodeInt(20);
        NodeInt d = new NodeInt(3);
        NodeInt e = new NodeInt(40);
        NodeInt f = new NodeInt(2);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;

        var result = findMinimumValue(a);
        System.out.println(result);
    }

    public static int findMinimumValue(NodeInt root){

        if(root == null) return Integer.MAX_VALUE;

        var minLeftSide = findMinimumValue(root.left);
        var minRightSide = findMinimumValue(root.left);
        var rootValue = root.value;

        var result = Integer.MAX_VALUE;
        if(minLeftSide < minRightSide && minLeftSide < result){
            result = minLeftSide;
        } else {
            result = minRightSide;
        }

        if(rootValue < result) return rootValue;
        else return result;
    }

}

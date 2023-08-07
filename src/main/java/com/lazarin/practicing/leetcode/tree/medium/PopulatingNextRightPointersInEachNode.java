package com.lazarin.practicing.leetcode.tree.medium;

import java.util.LinkedList;

//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
public class PopulatingNextRightPointersInEachNode {

    //T: O(N)
    //S: O(N)
    //we need to traverse all nodes in the tree
    public Node connect(Node root) {

        if(root == null){
            return root;
        }

        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            //4
            int qSize = queue.size();
            Node prev = null; //4

            for(int i = 0; i < qSize; i++){
                Node curr = queue.poll(); //6
                if(curr.left != null) {
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
                if(prev != null){
                    prev.next = curr;
                }
                prev = curr;
            }

        }
        return root;
    }

    //Approach 2 - constant memory usage solution
    //T: O(N)
    //S: O(1)
    public Node connect2(Node root) {

        Node curr = root;
        //next level always point to root.left
        Node next = root.left != null ? root.left : null;
        while(curr != null && next != null){

            curr.left.next = curr.right;
            if (curr.next != null){
                curr.right.next = curr.next.left;
            }
            curr = curr.next;
            if(curr == null){
                curr = next;//sets to next level if next is null
                next = curr.left;
            }

        }

        return root;
    }
}

package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.easy.ListNode;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNodeFromEndOfList {

    public static void main(String args[]){

        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode node1 = new com.lazarin.practicing.leetcode.linkedlist.easy.ListNode(1);
        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode node2 = new com.lazarin.practicing.leetcode.linkedlist.easy.ListNode(2);
        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode node3 = new com.lazarin.practicing.leetcode.linkedlist.easy.ListNode(3);
        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode node4 = new com.lazarin.practicing.leetcode.linkedlist.easy.ListNode(4);
        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode node5 = new com.lazarin.practicing.leetcode.linkedlist.easy.ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        removeNthNodeFromEndOfList(node1, 2);
    }

    public static com.lazarin.practicing.leetcode.linkedlist.easy.ListNode removeNthNodeFromEndOfList(com.lazarin.practicing.leetcode.linkedlist.easy.ListNode head, int n){


        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode dummyNode = new com.lazarin.practicing.leetcode.linkedlist.easy.ListNode(0, head);

        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode leftPointer = dummyNode;
        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode rightPointer = head;

        while(n > 0){
            rightPointer = rightPointer.next;
            --n;
        }

        while(rightPointer != null){
           // dummyNode = dummyNode.next;
            leftPointer = leftPointer.next;
            rightPointer = rightPointer.next;
        }

        leftPointer.next = leftPointer.next.next;
       // leftPointer = dummyNode;

        traverseList(head);

        return dummyNode.next;
    }

    public static void traverseList(com.lazarin.practicing.leetcode.linkedlist.easy.ListNode head){
        ListNode currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.val + " - ");
            currentNode = currentNode.next;
        }
    }
}

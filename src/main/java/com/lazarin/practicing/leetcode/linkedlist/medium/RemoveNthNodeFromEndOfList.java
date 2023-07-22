package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNodeFromEndOfList {

    public static void main(String args[]){

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        removeNthNodeFromEndOfList(node1, 2);
    }

    public static ListNode removeNthNodeFromEndOfList(ListNode head, int n){

        ListNode dummyNode = new ListNode(0, head);

        ListNode leftPointer = dummyNode;
        ListNode rightPointer = head;

        while(n > 0){
            rightPointer = rightPointer.next;
            --n;
        }

        while(rightPointer != null){
            leftPointer = leftPointer.next;
            rightPointer = rightPointer.next;
        }

        leftPointer.next = leftPointer.next.next;

        return dummyNode.next;
    }
}

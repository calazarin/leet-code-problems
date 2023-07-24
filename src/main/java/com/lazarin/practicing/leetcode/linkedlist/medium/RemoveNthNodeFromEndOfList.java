package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNodeFromEndOfList {

    public static ListNode removeNthNodeFromEndOfList(ListNode head, int n){

        ListNode dummyNode = new ListNode(0, head);

        ListNode leftPointer = dummyNode;
        ListNode rightPointer = head;

        while(n > 0 && rightPointer != null){
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

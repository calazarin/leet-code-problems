package com.lazarin.practicing.leetcode.linkedlist.easy;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

//https://leetcode.com/problems/reverse-linked-list
public class ReverseLinkedList {

    // T O(n) // M O(1)
    public ListNode reverseList(ListNode head) {

        ListNode previous = null;
        ListNode currentPointer = head;

        while(currentPointer != null) {
            ListNode tmp = currentPointer.next;
            currentPointer.next = previous;
            previous = currentPointer;
            currentPointer = tmp;
        }
        return previous;
    }

    public ListNode reverseListRecursively(ListNode head){

        if(head == null) return null;

        ListNode newHead = head;

        if(head.next != null) {
            newHead = reverseListRecursively(head.next);
            head.next.next = head;
        }

        head.next = null;
        return newHead;
    }
}

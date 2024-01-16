package com.lazarin.practicing.leetcode.linkedlist.easy;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

//https://leetcode.com/problems/middle-of-the-linked-list/description/
public class MiddleOfLinkedList {

    //approach - slow and fast pointers
    //T: O(N) where N is the amount of nodes
    //S: O(1)
    public ListNode middleNode(ListNode head) {

        ListNode p1;
        ListNode p2;
        p1 = head;
        p2 = head;

        while(p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        return p1;

    }
}

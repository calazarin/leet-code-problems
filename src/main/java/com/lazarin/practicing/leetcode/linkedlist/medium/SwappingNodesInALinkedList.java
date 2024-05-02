package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
public class SwappingNodesInALinkedList {

    //approach - using pointers and replacing the values
    //T: O(N); S:O(1)
    public ListNode swapNodes(ListNode head, int k) {

        ListNode p1 = head;
        ListNode p2 = head;
        ListNode p3 = head;

        for(int i = 1; i < k; i++){
            p2 = p2.next;
        }

        while(p2.next != null) {
            p2 = p2.next;
            p1 = p1.next;
        }

        for(int i = 1; i < k; i++){
            p3 = p3.next;
        }

        int tmp = p3.val;
        p3.val = p1.val;
        p1.val = tmp;
        return head;
    }

    //approach - using pointers and replacing the values
    //T: O(N); S:O(1)
    public ListNode swapNodes2(ListNode head, int k) {

       ListNode curr = head;
       for (int i = 0; i < k -1; i++) {
           curr = curr.next;
       }

       ListNode left = curr;
       ListNode right = head;

       while(curr.next != null) {
           curr = curr.next;
           right = right.next;
       }

       int tmp = right.val;
       right.val = left.val;
       left.val = tmp;
       return head;
    }
}

package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

//https://leetcode.com/problems/merge-nodes-in-between-zeros/description/
public class MergeNodesInBetweenZeros {

    //approach 1
    //T: O(N); S:O(N)
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode newHead = dummy;
        int sum = 0;
        ListNode node = head;
        while (node != null) {
            if (node.val == 0) {
                if (sum != 0) {
                    dummy.next = new ListNode(sum);
                    dummy = dummy.next;
                    sum = 0;
                }
            } else {
                sum += node.val;
            }
            node = node.next;
        }
        return newHead.next;
    }

    //approach 2 - different implementation
    //T: O(N); S:O(N)
    public ListNode mergeNodes2(ListNode head) {
        // Create two pointers
        ListNode temp = head;
        ListNode p = head.next;

        // Run a loop till p == null
        while(p != null) {
            // create a variable to store the sum of node values between two zeros
            int sum = 0;

            // run a loop to sum values of nodes
            while(p.val != 0) {
                sum += p.val;
                p = p.next;
            }

            // create newNode with sum value and add it to linked list
            temp.next = new ListNode(sum);
            temp = temp.next;

            p = p.next;
        }
        // return head.next because we don't need first node of head which is zero
        return head.next;
    }
}

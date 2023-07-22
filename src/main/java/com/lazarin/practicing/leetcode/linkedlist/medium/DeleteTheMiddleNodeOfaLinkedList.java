package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list
public class DeleteTheMiddleNodeOfaLinkedList {

    //approach 1: fast and slow pointers (tortoise algorithm) - T:O(N); S:(1)
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head.next.next;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //remove the node
        slow.next = slow.next.next;
        return head;
    }

    //approach 2: 2 passes - T: O(N); S: O(1)
    public ListNode deleteMiddle2(ListNode head) {
        // Edge case: return None if there is only one node
        if (head.next == null)
            return null;

        int count = 0;
        ListNode p1 = head, p2 = head;

        // First pass, count the number of nodes in the linked list using 'p1'.
        while (p1 != null) {
            count += 1;
            p1 = p1.next;
        }

        // Get the index of the node to be deleted.
        int middleIndex = count / 2;

        // Second pass, let 'p2' move toward the predecessor of the middle node.
        for (int i = 0; i < middleIndex - 1; ++i)
            p2 = p2.next;

        // Delete the middle node and return 'head'.
        p2.next = p2.next.next;
        return head;
    }

}

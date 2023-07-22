package com.lazarin.practicing.leetcode.linkedlist.easy;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

//https://leetcode.com/problems/remove-linked-list-elements/description/
public class RemoveLinkedListElements {

    //T: O(N)
    //S: O(1)
    public ListNode removeElements(ListNode head, int val) {

        if(head == null) return head;

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode current = dummy;

        while(current != null){

            while(current.next != null && current.next.val == val){
                current.next = current.next.next;
            }
            current = current.next;

        }

        return dummy.next;
    }

}

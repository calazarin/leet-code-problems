package com.lazarin.practicing.leetcode.linkedlist.easy;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while(current != null){

            while(current.next != null && current.val == current.next.val){
                current.next = current.next.next;
            }
            current = current.next;
        }

        return head;
    }
}

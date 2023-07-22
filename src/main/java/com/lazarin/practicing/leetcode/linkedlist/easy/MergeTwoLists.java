package com.lazarin.practicing.leetcode.linkedlist.easy;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

//https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                dummy.next = l1;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }
            //do not override the previous set dummy; move ahead
            dummy = dummy.next;
        }

        if(l1 != null){
            dummy.next = l1;
        } else {
            dummy.next = l2;
        }

        return head.next;
    }
}

package com.lazarin.practicing.leetcode.linkedlist.medium;


import com.lazarin.practicing.leetcode.linkedlist.ListNode;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
public class RemoveDuplicatesFromSortedListII {

    //using two pointers (prev and head) and a dummy node
    //T: O(n)
    //S: O(1)
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;

        while(head != null){

            if(head.next != null && head.val == head.next.val){
                //skip equal nodes
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                prev.next = head.next;
            } else {
                prev = prev.next;
            }
            head = head.next;
        }

        return dummy.next;
    }

    //recursive
    //T: O(N)
    //S: O(1) as we do not keep the entire list in the stack
    public ListNode deleteDuplicates2(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode next = head.next;
        if(next.val == head.val){
            while(next != null && next.val == head.val){
                next = next.next;
            }
            return deleteDuplicates2(next);
        } else {
            head.next = deleteDuplicates2(next);
            return head;
        }
    }
}


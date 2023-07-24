package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

//https://leetcode.com/problems/sort-list/
public class SortList {

    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        //slit the list into two halfs
        ListNode left = head;
        ListNode right = getMid(head);
        ListNode tmp = right.next;
        right.next = null;
        right = tmp;

        left = sortList(left);
        right = sortList(right);

        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {

        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while(left != null && right != null){
            if(left.val < right.val){
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }

        if(left != null){
            tail.next = left;
        }

        if(right != null){
            tail.next = right;
        }
        return dummy.next;
    }

    private ListNode getMid(ListNode head) {
        //two pointers approach
        ListNode slowPointer = head;
        ListNode fastPointer = head.next;
        while(fastPointer != null && fastPointer.next != null){

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

        }
        return slowPointer;
    }
}

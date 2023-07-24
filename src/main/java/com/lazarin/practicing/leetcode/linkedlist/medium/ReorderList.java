package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

//https://leetcode.com/problems/reorder-list/
public class ReorderList {

    //T: O(N)
    // to find the middle node -> O(N)
    // to reverse the second part -> N/2
    //to merge the 2 list -> N/2
    //S: O(1)
    public void reorderList(ListNode head) {

        if(head == null || head.next == null) return;

       //find the middle of inked list with slow and fast pointers [Problem 876]
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while(fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        //reverse the second part of the list in place [Problem 206]
        //1->2->3->4->5->6 to 1->2->3-> 6->5->4
        ListNode previous = null;
        ListNode current = slowPointer;
        ListNode temp = null;
        while(current != null){
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        //merge the two sorted linked lists [Problem 21]
        ListNode first = head;
        ListNode second = previous;
        while(second.next != null){
            temp = first.next;
            first.next = second;
            first = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }
    }


}

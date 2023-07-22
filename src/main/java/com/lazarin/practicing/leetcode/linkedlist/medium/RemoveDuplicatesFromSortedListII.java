package com.lazarin.practicing.leetcode.linkedlist.medium;


import com.lazarin.practicing.leetcode.linkedlist.ListNode;

import static com.lazarin.practicing.leetcode.linkedlist.ListNode.createList;
import static com.lazarin.practicing.leetcode.linkedlist.ListNode.print;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
public class RemoveDuplicatesFromSortedListII {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public static void main(String args[]){

        /*Input: head = [1,2,3,3,4,4,5]
        Output: [1,2,5]*/
        ListNode head = createList(new int[]{1,2,3,3,4,4,5}, 0);
        ListNode newHead = deleteDuplicates(head);
        print(newHead);

        System.out.print("\n");

        /*Input: head = [1,1,1,2,3]
        Output: [2,3]*/
        ListNode head2 = createList(new int[]{1,1,1,2,3}, 0);
        ListNode newHead2 = deleteDuplicates(head2);
        print(newHead2);

    }

    //using two pointers (prev and head) and a dummy node
    //T: O(n)
    //S: O(1)
    public static ListNode deleteDuplicates(ListNode head) {

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


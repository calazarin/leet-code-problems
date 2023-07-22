package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

//https://leetcode.com/problems/rotate-list/
public class RotateList {

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

        /*Input: head = [1,2,3,4,5], k = 2
        Output: [4,5,1,2,3]*/

    }

    /** most optimal approach
     * T: O(N)
     * S: O(1)
     *  1. get the length of entire list
     *  2. count from beginning needed jumps before cut the list (length - k - 1)
     *      2.1 if length is multiple of k, result will be the same as original input list
     *  3. cut the list after adjusting k (where k > list length)
     *      3.1 last node points to head
     *      3.2 note ath position length - k points to null
    */
    public ListNode rotateRight2(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;

        //compute the length
        ListNode curr = head;
        int length = 1;
        while(curr.next != null){
            curr = curr.next;
            length++;
        }

        //point the last node to head
        curr.next = head;

        //adjust k if k > counter
        k = k % length;
        k = length - k;

        while(k > 0 ){
            curr = curr.next;
            k--;
        }
        //make the new head and breaks the connection
        head = curr.next;
        curr.next = null;

        return head;
    }

    //naive approach
    //T: (K*m)
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null) return head;

        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode curr = head;

        for(int i = 1; i <= k; i++){

            while(curr.next != null){
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
            curr.next = dummy.next;
            dummy.next = curr;
            prev = dummy;

        }
        return dummy.next;
    }
}

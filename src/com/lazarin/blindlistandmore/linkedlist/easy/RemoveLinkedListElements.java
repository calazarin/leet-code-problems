package com.lazarin.blindlistandmore.linkedlist.easy;

import com.lazarin.blindlistandmore.linkedlist.ListNode;

//https://leetcode.com/problems/remove-linked-list-elements/description/
public class RemoveLinkedListElements {

    public static void main(String args[]){

        /*Input: head = [1,2,6,3,4,5,6], val = 6
        Output: [1,2,3,4,5]*/

       /* Input: head = [], val = 1
        Output: []*/

      /*  Input: head = [7,7,7,7], val = 7
        Output: []*/

    }

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

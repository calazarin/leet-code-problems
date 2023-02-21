package com.lazarin.blindlistandmore.linkedlist.easy;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RemoveDuplicatesFromSortedList {

    public static void main(String args[]){

     /*   Input: head = [1,1,2]
        Output: [1,2]*/

        /*
        Input: head = [1,1,2,3,3]
        Output: [1,2,3]*/

    }

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

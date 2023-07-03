package com.lazarin.practicing.leetcode.linkedlist.medium;

//https://leetcode.com/problems/swap-nodes-in-pairs/
public class SwapNodesInPairs {

    public static void main(String args[]){
       /* Input: head = [1,2,3,4]
        Output: [2,1,4,3]*/

       /* Input: head = []
        Output: []*/

       /* Input: head = [1]
        Output: [1]*/
    }

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
    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr != null && curr.next != null){ //we need to have at least 2 nodes
            //save next pair
            ListNode nxtPair = curr.next.next;
            ListNode second = curr.next;

            //reverse
            second.next = curr;
            curr.next = nxtPair;
            //put second to first positoin
            prev.next = second;

            //uppdate pointers
            prev = curr;
            curr = nxtPair;
        }
        return dummy.next;
    }
}

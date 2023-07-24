package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

//https://leetcode.com/problems/partition-list/
public class PartitionList {

    /**
     * approach 1
     * create 2 temp lists: left and right
     * left receives nodes < x
     * right receives nodes >= x
     * then put all together
     *
     * T: O(N)
     * S: O(1)
     * */
    public ListNode partition(ListNode head, int x) {
        //dummy nodes used as reference
        ListNode left = new ListNode();
        ListNode right = new ListNode();
        //tails nodes easily point to last node
        ListNode leftTail = left;
        ListNode rightTail = right;

        while (head != null){
            if(head.val < x){
                leftTail.next = head;
                leftTail = leftTail.next;
            } else {
                rightTail.next = head;
                rightTail = rightTail.next;
            }
            head = head.next;

            leftTail.next = right.next;
            rightTail.next = null;
        }

        return left.next;
    }
}

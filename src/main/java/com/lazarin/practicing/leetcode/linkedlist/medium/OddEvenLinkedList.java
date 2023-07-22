package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

//https://leetcode.com/problems/odd-even-linked-list
public class OddEvenLinkedList {

    //T: O(N); S: O(1)
    public ListNode oddEvenList(ListNode head) {

       if (head == null) return null;

       ListNode odd = head;
       ListNode even = head.next;
       ListNode evenHead = even;

       while(even != null && even.next != null){
           odd.next = odd.next.next;
           odd = odd.next;

           even.next = even.next.next;
           even = even.next;
       }

       odd.next = evenHead;
       return head;
    }
}

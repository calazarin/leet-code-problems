package com.lazarin.practicing.leetcode.linkedlist.easy;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

public class ReverseSinglyLinkedList {

    public static void main(String args[]){

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        ListNode n3 = new ListNode(3);
        n2.next = n3;
        ListNode n4 = new ListNode(4);
        n3.next = n4;
        ListNode n5 = new ListNode(5);
        n4.next = n5;
        ListNode reversed = reverseListRecursion(n1);
    }

    public static ListNode reverseList(ListNode head) {

        ListNode previous = null;
        ListNode tmp;
        ListNode current = head;

        while(current != null) {
            tmp = current.next;
            current.next = previous;
            previous = current;
            current = tmp;
        }

        return previous;
    }

    public static ListNode reverseListRecursion(ListNode node) {

        if(node == null) return null;

        ListNode newHead = node;

        if(node.next != null){
            newHead = reverseListRecursion(node.next);
            node.next.next = node;
        }
        node.next = null;
        return newHead;
    }
}

package com.lazarin.blindlistandmore.linkedlist;

import static com.lazarin.blindlistandmore.linkedlist.RemoveNthNodeFromEndOfList.traverseList;

public class ReverseLinkedList {

    public static void main(String args[]){

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        traverseList(node1);
        //var newHead = reverseList(node1);
        var newHead = reverseListRecursively(node1);
        System.out.print("\n \n");
        traverseList(newHead);
    }

    // T O(n) // M O(1)
    public static ListNode reverseList(ListNode head) {

        ListNode previous = null;
        ListNode currentPointer = new ListNode(head.val, head.next);

        while(currentPointer != null) {
            ListNode tmp = currentPointer.next;
            currentPointer.next = previous;
            previous = currentPointer;
            currentPointer = tmp;
        }
        return previous;
    }

    public static ListNode reverseListRecursively(ListNode head){


        if(head == null) return null;

        ListNode newHead = head;
        if(head.next != null) {
            newHead = reverseListRecursively(head.next);
            head.next.next = head;
        }
        head.next = null;
        return newHead;

    }
}

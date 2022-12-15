package com.lazarin.learning.linkedlists;

import com.lazarin.blindlistandmore.linkedlist.ListNode;

import static com.lazarin.learning.linkedlists.ReverseSinglyLinkedList.printLinkedList;

public class MergeTwoSortedLists {

    public static void main(String args[]){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        ListNode n4 = new ListNode(4);
        n2.next = n4;

        ListNode n1_1 = new ListNode(1);
        ListNode n1_3 = new ListNode(3);
        n1_1.next = n1_3;
        ListNode n1_4 = new ListNode(4);
        n1_3.next = n1_4;

        ListNode newList = mergeTwoLists(n1, n1_1);
        printLinkedList(newList);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if(list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        return dummy.next;
    }

    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while(list1 != null &&  list2 != null){
            if(list1.val <= list2.val){

            }
        }
        return null;
    }
}

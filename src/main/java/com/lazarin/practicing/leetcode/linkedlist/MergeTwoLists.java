package com.lazarin.practicing.leetcode.linkedlist;

//https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoLists {


    public static void main(String args[]){

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node4;

        System.out.println("\nFirst list: ");
        RemoveNthNodeFromEndOfList.traverseList(node1);

        ListNode node2_1 = new ListNode(1);
        ListNode node2_3 = new ListNode(3);
        ListNode node2_4 = new ListNode(4);
        node2_1.next = node2_3;
        node2_3.next = node2_4;

        System.out.println("\nSecond list:");
        RemoveNthNodeFromEndOfList.traverseList(node2_1);

        var newMergedListHead = mergeTwoLists(node1, node2_1);

        System.out.println("\nFinal list: ");
        RemoveNthNodeFromEndOfList.traverseList(newMergedListHead);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                dummy.next = l1;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }
            //do not override the previous set dummy; move ahead
            dummy = dummy.next;
        }

        if(l1 != null){
            dummy.next = l1;
        } else {
            dummy.next = l2;
        }

        return head.next;
    }
}

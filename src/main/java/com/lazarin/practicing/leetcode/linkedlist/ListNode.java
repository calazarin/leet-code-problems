package com.lazarin.practicing.leetcode.linkedlist;

import lombok.EqualsAndHashCode;

//Definition for singly-linked list.
@EqualsAndHashCode
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void print(ListNode head){
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode createList(int[] values, int index){

        if(index == values.length - 1){
            return new ListNode(values[index], null);
        }

        ListNode createdNode = createList(values, index + 1);
        return new ListNode(values[index], createdNode);
    }
}

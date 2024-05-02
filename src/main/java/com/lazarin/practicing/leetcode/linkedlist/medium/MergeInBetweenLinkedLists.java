package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

//https://leetcode.com/problems/merge-in-between-linked-lists/
public class MergeInBetweenLinkedLists {

    //approach - using pointers
    //T:O(n+m); S:O(1)
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1;
        int i = 0;
        for(; i < a - 1; i++) {
            curr = curr.next;
        }

        ListNode leftCut = curr;
        for(; i <= b; i++) {
            curr = curr.next;
        }

        leftCut.next = list2;
        while(list2.next != null) {
            list2 = list2.next;
        }

        list2.next = curr;
        return list1;
    }
}

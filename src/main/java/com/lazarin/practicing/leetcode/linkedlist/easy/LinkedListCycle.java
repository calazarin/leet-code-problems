package com.lazarin.practicing.leetcode.linkedlist.easy;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {

    //T: O(N) - where n is the amount of nodes in the list
    //S: O(N) - we need a data structure to store all nodes until they repet
    public boolean hasCycle(ListNode head) {

        Set<ListNode> visited = new HashSet<>();

        ListNode current = head;
        while(current != null){
            if(visited.contains(current)){
                return true;
            }
            visited.add(current);
            current = current.next;
        }
        return false;
    }

    //solution without extra space
    //slow pointer and fast pointer
    //T: O(N) - where n is the number of nodes
    //S: O(1) constant space!
    public boolean hasCycle2(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}

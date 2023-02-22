package com.lazarin.practicing.leetcode.linkedlist.easy;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {

    public static void main(String args[]){

        /*Input: head = [3,2,0,-4], pos = 1
        Output: true
        Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).*/

        /*Input: head = [1,2], pos = 0
        Output: true
        Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.*/

        /*Input: head = [1], pos = -1
        Output: false
        Explanation: There is no cycle in the linked list.*/
    }

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

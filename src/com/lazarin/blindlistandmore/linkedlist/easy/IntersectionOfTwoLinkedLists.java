package com.lazarin.blindlistandmore.linkedlist.easy;

import com.lazarin.blindlistandmore.linkedlist.ListNode;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/intersection-of-two-linked-lists/
public class IntersectionOfTwoLinkedLists {
    public static void main(String args[]){

    }

    //t: O(N+N) where N is the length of linked list A and M the length of B
    //s: O(M) where M is the amount of nodes in B we are storing in the set
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visitedNodes = new HashSet<>();
        while(headB != null){
            visitedNodes.add(headB);
            headB = headB.next;
        }
        while (headA != null){
            if(visitedNodes.contains(headA)){
                return headA;
            }
            headA = headA.next;
        }
        return null;
    }

    //T: O(N+M)
    //O: O(1)
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {

        ListNode p1 = headA;
        ListNode p2 = headB;

        while(p1 != p2){
            p1 = p1 == null ? headB : p1.next;
            p2 = p2 == null ? headA : p2.next;
        }
        return p1;
    }
}

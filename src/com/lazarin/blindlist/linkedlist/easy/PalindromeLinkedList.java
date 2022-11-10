package com.lazarin.blindlist.linkedlist.easy;

import com.lazarin.blindlist.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLinkedList {

    public static void main(String args[]){

    }

    //T: O(3N) -> O(N)
    //S: O(2N) -> O(N)
    public boolean isPalindrome(ListNode head){

        List<Integer> vals = new ArrayList<>();

        //convert linked list into array list
        ListNode currentNode = head;
        while(currentNode != null){
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        //Reverse vals array list
        List<Integer> reservedVals = new ArrayList<>();
        for(int i = vals.size(); i >= 0; i --){
            reservedVals.add(vals.get(i));
        }

        //check if the two array list are equal to each other
        for(int i = 0;i < vals.size(); i++){
            if(vals.get(i) != reservedVals.get(i)){
                return false;
            }
        }
        return true;
    }

    //changing the input in place (less memory)
    //1. find the 2 halves - T: O(N)
    //2. reverse second half (leet code 206) -> T: O(N)
    //3. compare first and second half -> T:O(N)
    //4. reverse the second half again -> T: O(N)
    //TOTAL => T: O(4N) -> O(N)
    //S: O(N)
    public boolean isPalindrome1(ListNode head){
        if(head == null) return true;

        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);

        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        boolean result = true;

        while(result && p2 != null){
            if(p1.val != p2.val) result = false;
            p1 = p1.next;
            p2 = p2.next;
        }
        //reverse back
        firstHalfEnd.next = reverseList(secondHalfStart);
        return result;
    }

    private ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            var nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    private ListNode endOfFirstHalf(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next; //2x s
            slow = slow.next; //1x s
        }
        return slow;
    }
}

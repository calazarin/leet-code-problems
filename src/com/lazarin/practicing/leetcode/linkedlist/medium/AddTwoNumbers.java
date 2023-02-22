package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.easy.ListNode;

import static com.lazarin.learning.linkedlists.ReverseSinglyLinkedList.printLinkedList;

public class AddTwoNumbers {

    public static void main(String args[]){
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode n2 = new com.lazarin.practicing.leetcode.linkedlist.easy.ListNode(2);
        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode n4 = new com.lazarin.practicing.leetcode.linkedlist.easy.ListNode(4);
        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode n3 = new com.lazarin.practicing.leetcode.linkedlist.easy.ListNode(3);
        n2.next = n4;
        n4.next = n3;

        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode n5= new com.lazarin.practicing.leetcode.linkedlist.easy.ListNode(5);
        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode n6 = new com.lazarin.practicing.leetcode.linkedlist.easy.ListNode(6);
        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode n4_2 = new com.lazarin.practicing.leetcode.linkedlist.easy.ListNode(4);

        n5.next = n6;
        n6.next = n4_2;

        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode newHead = addTwoNumbers.addTwoNumbers(n2, n5);
        printLinkedList(newHead);
    }

    public com.lazarin.practicing.leetcode.linkedlist.easy.ListNode addTwoNumbers2(com.lazarin.practicing.leetcode.linkedlist.easy.ListNode l1, com.lazarin.practicing.leetcode.linkedlist.easy.ListNode l2) {

        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode dummy = new com.lazarin.practicing.leetcode.linkedlist.easy.ListNode();
        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode current = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            var v1 = l1 != null ? l1.val : 0;
            var v2 = l2 != null ? l2.val : 0;

            //new digit
            int val = v1 + v2 + carry;
            carry = val / 10;
            val = val % 10;
            current.next = new com.lazarin.practicing.leetcode.linkedlist.easy.ListNode(val);

            //update pointers
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        return dummy.next;
    }

    public com.lazarin.practicing.leetcode.linkedlist.easy.ListNode addTwoNumbers(com.lazarin.practicing.leetcode.linkedlist.easy.ListNode l1, com.lazarin.practicing.leetcode.linkedlist.easy.ListNode l2) {

        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode refNode = new com.lazarin.practicing.leetcode.linkedlist.easy.ListNode();
        com.lazarin.practicing.leetcode.linkedlist.easy.ListNode head = refNode;
        int carry = 0;
        while(l1 != null && l2 != null){

            var sum = l1.val + l2.val + carry;
            if(sum >= 10){
                var leftDigit = sum / 10;
                carry = leftDigit;
            } else {
                carry = 0;
            }

            var nodeVl = carry == 0 ? sum : sum % 10;
            com.lazarin.practicing.leetcode.linkedlist.easy.ListNode newNode = new com.lazarin.practicing.leetcode.linkedlist.easy.ListNode(nodeVl);

            head.next = newNode;
            l1 = l1.next;
            l2 = l2.next;
            head = head.next;
        }

        while(l1 != null){

            var sum = l1.val + carry;
            if(sum >= 10){
                var leftDigit = sum / 10;
                carry = leftDigit;
            } else {
                carry = 0;
            }

            var nodeVl = carry == 0 ? sum : sum % 10;
            com.lazarin.practicing.leetcode.linkedlist.easy.ListNode newNode = new com.lazarin.practicing.leetcode.linkedlist.easy.ListNode(nodeVl);
            head.next = newNode;
            l1 = l1.next;
            head = head.next;
        }

        while(l2 != null){

            var sum = l2.val + carry;
            if(sum >= 10){
                var leftDigit = sum / 10;
                carry = leftDigit;
            } else {
                carry = 0;
            }

            var nodeVl = carry == 0 ? sum : sum % 10;
            com.lazarin.practicing.leetcode.linkedlist.easy.ListNode newNode = new com.lazarin.practicing.leetcode.linkedlist.easy.ListNode(nodeVl);
            head.next = newNode;
            l2 = l2.next;
            head = head.next;

        }

        if(carry != 0){
            com.lazarin.practicing.leetcode.linkedlist.easy.ListNode newNode = new ListNode(carry);
            head.next = newNode;
        }

        return refNode.next;
    }

}

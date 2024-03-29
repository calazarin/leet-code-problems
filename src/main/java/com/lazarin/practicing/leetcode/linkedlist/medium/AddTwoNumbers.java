package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode();
        ListNode current = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            var v1 = l1 != null ? l1.val : 0;
            var v2 = l2 != null ? l2.val : 0;

            //new digit
            int val = v1 + v2 + carry;
            carry = val / 10;
            val = val % 10;
            current.next = new ListNode(val);

            //update pointers
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        return dummy.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode refNode = new ListNode();
        ListNode head = refNode;
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
            ListNode newNode = new ListNode(nodeVl);

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
            ListNode newNode = new ListNode(nodeVl);
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
            ListNode newNode = new ListNode(nodeVl);
            head.next = newNode;
            l2 = l2.next;
            head = head.next;

        }

        if(carry != 0){
            ListNode newNode = new ListNode(carry);
            head.next = newNode;
        }

        return refNode.next;
    }

}

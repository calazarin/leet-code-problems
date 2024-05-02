package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/
public class InsertGreatestCommonDivisorsInLinkedList {

    //T:O(N); S:O(1)
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy = head;
        ListNode p1 = head;
        ListNode p2 = head.next;

        while(p2 != null) {
            int num1 = p1.val;
            int num2 = p2.val;
            int newNodeVal = findGCD(num1, num2);
            ListNode newNode = new ListNode(newNodeVal);
            p1.next = newNode;
            newNode.next = p2;
            p1 = p1.next.next;
            p2 = p2.next;
        }

        return dummy;
    }

    private int findGCD(int num1, int num2) {
        Set<Integer> f1 = getFactors(num1);
        Set<Integer> f2 = getFactors(num2);
        List<Integer> cf = new ArrayList<>();
        for(Integer n : f1) {
            if(f2.contains(n)){
                cf.add(n);
            }
        }
        cf.sort(Collections.reverseOrder());
        return cf.get(0);
    }

    private Set<Integer> getFactors(int num) {
        Set<Integer> factors = new HashSet<>();
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }
}

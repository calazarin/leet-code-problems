package com.lazarin.practicing.leetcode.linkedlist.medium;

import com.lazarin.practicing.leetcode.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

//https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list
public class MaxTwinSumOfLinkedList {

    //approach 1 - using stack + queue; T:O(N); S:O(N)
    public int pairSum(ListNode head) {

        ListNode curr = head;
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int sum = Integer.MIN_VALUE;

        int i = 0;
        while(curr != null){
            if(i % 2 == 0) {
                queue.add(curr.val);
            } else {
                stack.push(curr.val);
            }
            curr = curr.next;
            i++;
        }

        while(!queue.isEmpty() && !stack.isEmpty()){
            sum = Math.max(sum, queue.poll() + stack.pop());
        }

        return sum;
    }

    //approach 2 - using a list; T: O(N); S: O(N)
    public int pairSum2(ListNode head) {

        ListNode current = head;
        List<Integer> values = new ArrayList<>();

        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        int i = 0, j = values.size() - 1, maxSum = 0;

        while (i < j) {

            maxSum = Math.max(maxSum, values.get(i) + values.get(j));
            i++;
            j--;
        }
        return maxSum;
    }

    //approach 3 - only 1 stack; T:O(N); S:O(N)
    public int pairSum3(ListNode head) {

        ListNode current = head;
        Stack<Integer> stack = new Stack<Integer>();

        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        current = head;
        int size = stack.size(), count = 1, maxSum = 0;

        while (count <= size / 2) { //iterate until the half

            maxSum = Math.max(maxSum, current.val + stack.pop());
            current = current.next;
            count++;
        }

        return maxSum;
    }

    //approach 4 - reverse half of the list; T:O(N); S:O(1)
    public int pairSum4(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Get middle of the linked list.
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Reverse second half of the linked list.
        ListNode nextNode, prev = null;
        while (slow != null) {
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        ListNode start = head;
        int maximumSum = 0;
        while (prev != null) {
            maximumSum = Math.max(maximumSum, start.val + prev.val);
            prev = prev.next;
            start = start.next;
        }

        return maximumSum;
    }
}

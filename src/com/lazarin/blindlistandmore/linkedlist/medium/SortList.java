package com.lazarin.blindlistandmore.linkedlist.medium;

//https://leetcode.com/problems/sort-list/
public class SortList {

    public static void main(String args[]){
       /* Input: head = [4,2,1,3]
        Output: [1,2,3,4]*/

      /*  Input: head = [-1,5,3,4,0]
        Output: [-1,0,3,4,5]*/
    }

    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        //slit the list into two halfs
        ListNode left = head;
        ListNode right = getMid(head);
        ListNode tmp = right.next;
        right.next = null;
        right = tmp;

        left = sortList(left);
        right = sortList(right);

        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {

        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while(left != null && right != null){
            if(left.val < right.val){
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }

        if(left != null){
            tail.next = left;
        }

        if(right != null){
            tail.next = right;
        }
        return dummy.next;
    }

    private ListNode getMid(ListNode head) {
        //two pointers approach
        ListNode slowPointer = head;
        ListNode fastPointer = head.next;
        while(fastPointer != null && fastPointer.next != null){

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

        }
        return slowPointer;
    }
}

package com.lazarin.blindlist.linkedlist;

public class ListNode {
    public  Integer val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    ListNode(Integer val, ListNode next) { this.val = val; this.next = next; }
}

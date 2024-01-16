package com.lazarin.learning.leetcode.linkedlists.number;

public class ReverseList {

    public static void main(String ...args){

        var a = new LinkedNode(2);
        var b = new LinkedNode(8);
        var c = new LinkedNode(3);
        var d = new LinkedNode(7);

        a.next = b;
        b.next = c;
        c.next = d;

        //2 -> 8 -> 3 -> 7 -> null
        //7 -> 3 -> 8 -> 2 -> null
        var newHead = reverseList(a, null);
        System.out.print(newHead.value);
    }

    public static LinkedNode reverseList(LinkedNode head, LinkedNode previous){

        if(head == null ) return previous;
        LinkedNode next = head.next;
        head.next = previous;
        return reverseList(next, head);
    }
}

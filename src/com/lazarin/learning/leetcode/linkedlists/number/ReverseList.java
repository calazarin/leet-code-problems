package com.lazarin.learning.leetcode.linkedlists.number;

public class ReverseList {

    public static void main(String ...args){

        var a = new LinkedNode(2);// i = 0
        var b = new LinkedNode(8);// i = 1
        var c = new LinkedNode(3);// i = 2
        var d = new LinkedNode(7);// i = 3

        a.next = b;
        b.next = c;
        c.next = d;

        //2 -> 8 -> 3 -> 7 -> null
        //7 -> 3 -> 8 -> 2 -> null
        var newHead = reverseList(a, null);
        System.out.print(newHead.value);
    }

    //current = 2
    //oldNext = 8
    //current.next = null
    //oldNext.next = 2

   /* public static LinkedNode reverseList(LinkedNode head){


        LinkedNode current = head;
        LinkedNode previous = null;

        while(current != null){
            LinkedNode next = current.next;
            current.next = previous;
            previous = current;
            //current next becomes new current
            current = next;
        }
        return previous;
    }*/

    public static LinkedNode reverseList(LinkedNode head, LinkedNode previous){

        if(head == null ) return previous;
        LinkedNode next = head.next;
        head.next = previous;
        return reverseList(next, head);
    }
}

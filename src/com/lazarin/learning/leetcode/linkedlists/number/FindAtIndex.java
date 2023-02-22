package com.lazarin.learning.linkedlists.number;

public class FindAtIndex {

    public static void main(String ...args){

        var a = new LinkedNode(2);// i = 0
        var b = new LinkedNode(8);// i = 1
        var c = new LinkedNode(3);// i = 2
        var d = new LinkedNode(7);// i = 3

        a.next = b;
        b.next = c;
        c.next = d;

        //2 -> 8 -> 3 -> 7 -> null
        System.out.print(findNodeAtIndex(a, 2));
    }

    private static Integer findNodeAtIndex(LinkedNode head, int target) {
        if(head == null) return null; //out of range return null
        if(target == 0) return head.value;
        return findNodeAtIndex(head.next, --target);
    }
}

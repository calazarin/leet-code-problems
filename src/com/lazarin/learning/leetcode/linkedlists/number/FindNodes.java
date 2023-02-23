package com.lazarin.learning.leetcode.linkedlists.number;

public class FindNodes {

    public static void main(String ...args){

        var a = new LinkedNode(2);
        var b = new LinkedNode(8);
        var c = new LinkedNode(3);
        var d = new LinkedNode(7);

        a.next = b;
        b.next = c;
        c.next = d;

        //2 -> 8 -> 3 -> 7 -> null
        System.out.print(findNode(a, 10));
    }

    //Time O(n)
    //Space O(n); iterative is O(1)
    private static boolean findNode(LinkedNode head, int target) {
        if(head == null) return false;
        if(head.value == target) return true;
        return findNode(head.next, target);
    }

}

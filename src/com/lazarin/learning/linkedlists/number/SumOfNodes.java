package com.lazarin.learning.linkedlists.number;

public class SumOfNodes {

    public static void main(String ...args){

        var a = new LinkedNode(2);
        var b = new LinkedNode(8);
        var c = new LinkedNode(3);
        var d = new LinkedNode(7);

        a.next = b;
        b.next = c;
        c.next = d;

        //2 -> 8 -> 3 -> 7 -> null
        System.out.print(sumOfNodes(a));
    }

    //Time O(n)
    //Space O(n); iterative is O(1)
    private static int sumOfNodes(LinkedNode head) {
        if(head == null) return 0;
        return head.value + sumOfNodes(head.next);
    }

}

package com.lazarin.learning.leetcode.linkedlists;

import java.util.ArrayList;
import java.util.List;

public class LinkedListMain {

    public static void main(String ...args){

        var a = new LinkedNode("A");
        var b = new LinkedNode("B");
        var c = new LinkedNode("C");
        var d = new LinkedNode("D");

        a.next = b;
        b.next = c;
        c.next = d;

        //A -> B -> C -> D -> null
        printLinkedList(a);
    }

    public static void printLinkedList(LinkedNode head){
        if(head == null) return;
        System.out.println(head.value);
        printLinkedList(head.next);
    }

    public static List<String> returnValues(LinkedNode head){
        List<String> returnData = new ArrayList<>();
        fillValues(head, returnData);
        return returnData;
    }

    private static void fillValues(LinkedNode head, List<String> returnData) {
        if(head == null) return; //base case
        returnData.add(head.value);
        fillValues(head.next, returnData);
    }

}

package com.lazarin.learning.recursion.linkedlist;

public class LinkedListMain {

    public static void main(String args[]){

        Node n1 = new Node(1);
        Node n2 = new Node(5);
        Node n3 = new Node(13);
        Node n4 = new Node(14);
        Node n5 = new Node(550);

        Node n1_1 = new Node(2);
        Node n2_2 = new Node(15);
        Node n3_3 = new Node(130);
        Node n4_4 = new Node(200);
        Node n5_5 = new Node(350);

        n1_1.setNext(n2_2);
        n2_2.setNext(n3_3);
        n3_3.setNext(n4_4);
        n4_4.setNext(n5_5);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        Node sortedMerge = mergeLits(n1, n1_1);
        printLinkedList(sortedMerge);

    }

    private static void printLinkedList(Node node) {
        Node tmp = node;
        while(tmp != null){
            System.out.print(tmp.getValue() + " ");
            tmp = tmp.getNext();
        }

    }

    public static Node mergeLits(Node l1, Node l2){
        if(l1 == null) return l2;

        if(l2 == null) return l1;


        if(l1.getValue() <= l2.getValue()){
            var newNext = mergeLits(l1.getNext(), l2);
            l1.setNext(newNext);
            return l1;
        } else {
            var newNext = mergeLits(l1, l2.getNext());
            l2.setNext(newNext);
            return l2;
        }
    }

}

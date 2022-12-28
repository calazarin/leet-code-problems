package com.lazarin.blindlistandmore.linkedlist.medium;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/copy-list-with-random-pointer/
public class CopyListWithRandomPointer {

    public static void main(String args[]){

    }

    //Solution:
    //With 2 passes - first copy existent nodes and add them into a map
    //Then pass again connecting the nodes and setting the random connection
    //T: O(N) = linear
    //S: O(N)
    public Node copyRandomList(Node head) {

        Map<Node,Node> oldToCopy = new HashMap();
        Node curr = head;
        while(curr != null){
            Node copy = new Node(curr.val);
            oldToCopy.put(curr, copy);
            curr = curr.next;
        }

        curr = head;
        while(curr != null){

            Node copy = oldToCopy.get(curr);
            //set the pointers now

            if(oldToCopy.containsKey(curr.next)){
                copy.next = oldToCopy.get(curr.next);
            }

            if(oldToCopy.containsKey(curr.random)){
                copy.random = oldToCopy.get(curr.random);
            }
            curr = curr.next;
        }

        return oldToCopy.get(head);
    }


    public Node copyRandomList2(Node head) {

        //create a dummy node to point to new head
        Node dummy = new Node(-1);
        dummy.next = new Node(head.val);
        Node current = head.next;
        Integer prevKey = head.val;

        Map<Integer, Node> created = new HashMap<>();
        created.put(dummy.next.val, dummy.next);

        while(current != null){

            Node newHead = new Node(current.val);
            created.put(newHead.val, newHead);

            created.get(prevKey).next = newHead;

            prevKey = current.val;
            current = current.next; //move pointer
            newHead = newHead.next; //move pointer
        }

        return dummy.next;
    }
}

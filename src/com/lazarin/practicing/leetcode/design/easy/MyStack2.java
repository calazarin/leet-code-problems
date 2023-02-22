package com.lazarin.practicing.leetcode.design.easy;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack2 {
    Queue<Integer> q;

    public MyStack2() {
        q = new LinkedList<>();
    }

    //T: O(N)
    //S: O(1)
    //adds the element in the back and reorder then, so the last added statys in the front
    public void push(int x) {
        q.add(x);
        int qSize = q.size();
        while (qSize > 1) { //we want to leave the last added in the front
            q.add(q.remove()); //remove from front and add back again
            qSize--;
        }
    }

    //T:O(1)
    //S:0(!)
    public int pop() {
        return q.remove();
    }

    //element is always positioned at the front of q1. Algorithm return it.
    //T:O(1)
    //S:O(1)
    public int top() {
        return q.peek();
    }

    //T: O(1)
    //S: O(1)
    public boolean empty() {
        return q.isEmpty();
    }
}

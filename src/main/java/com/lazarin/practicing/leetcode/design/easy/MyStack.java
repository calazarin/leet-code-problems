package com.lazarin.practicing.leetcode.design.easy;

import java.util.LinkedList;

public class MyStack {

    LinkedList<Integer> q;
    int top;

    public MyStack() {
        q = new LinkedList<>();
    }

    //T: O(1)
    //S: O(1)
    public void push(int x) {
        //when pushing, I need to push from the back, not in the front
        q.addLast(x);
        top = x;
    }

    public int pop() {
        return q.pollLast();
    }

    //T:O(1)
    public int top() {
        return top;
    }

    //T: O(1)
    //S: O(1)
    public boolean empty() {
        return q.isEmpty();
    }
}

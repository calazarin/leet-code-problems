package com.lazarin.practicing.leetcode.design.easy;

import java.util.Stack;

//Solution: 2 stacks
//Push - O(1) per operation
//Pop - amortized O(1) per operation
public class MyQueue {

    Stack<Integer> s1;
    Stack<Integer> s2;
    private int front;

    public MyQueue() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    //T: O(1) per operation
    //S: O(N)
    public void push(int x) {
        if(s1.isEmpty()){
            front = x;
        }
        // Push element x to the back of queue.
        s1.push(x);
    }


    public int pop() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    //T: O(1)
    //S: O(1)
    public int peek() {
        if (!s2.isEmpty()) {
            return s2.peek();
        }
        return front;
    }

    //T:O(1)
    //S:O(1)
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

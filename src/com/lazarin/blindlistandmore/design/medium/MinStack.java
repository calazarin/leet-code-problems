package com.lazarin.blindlistandmore.design.medium;

//TODO:check how to implement a stack (linked list or array)
//https://leetcode.com/problems/min-stack/

import java.util.Stack;

//The approach is to keep 2 stacks to track the current min until a given position
public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val){
        stack.push(val);
        val = Math.min(val, !minStack.isEmpty() ? minStack.peek() :val);
        minStack.push(val);
    }

    public void pop(){
        stack.pop();
        minStack.pop();
    }

    public int top(int val){
        return stack.peek();
    }

    public int getMin(int val){
        return minStack.peek();
    }
}

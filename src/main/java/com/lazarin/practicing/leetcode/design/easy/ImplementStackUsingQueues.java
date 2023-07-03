package com.lazarin.practicing.leetcode.design.easy;

//https://leetcode.com/problems/implement-stack-using-queues/
public class ImplementStackUsingQueues {

    public static void main(String args[]){

       /* Input
                ["MyStack", "push", "push", "top", "pop", "empty"]
                [[], [1], [2], [], [], []]
        Output
                [null, null, null, 2, 2, false]

        Explanation
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.top(); // return 2
        myStack.pop(); // return 2
        myStack.empty(); // return False*/

        //approach 1
        MyStack myStack  = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.top();
        myStack.pop();
        myStack.empty();
    }



}

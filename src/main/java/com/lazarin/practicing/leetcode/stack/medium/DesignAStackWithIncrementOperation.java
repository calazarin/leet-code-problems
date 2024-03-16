package com.lazarin.practicing.leetcode.stack.medium;

import java.util.Stack;

//https://leetcode.com/problems/design-a-stack-with-increment-operation/
public class DesignAStackWithIncrementOperation {

    class CustomStack {
        private int maxElements;
        private Stack<Integer> stack;

        public CustomStack(int maxSize) {
            this.maxElements = maxSize;
            this.stack = new Stack<>();
        }

        public void push(int x) {
            if(stack.size() < maxElements) {
                stack.push(x);
            }
        }

        public int pop() {
            if(stack.isEmpty()) return -1;
            return stack.pop();
        }

        public void increment(int k, int val) {
            int size = Math.min(k, stack.size());
            for (int i = 0; i < size; i++) {
                stack.set(i, stack.get(i) + val);
            }
        }
    }

    class CustomStack2 {

        int[] list;
        int idx;
        public CustomStack2(int maxSize) {
            list = new int[maxSize];
            idx=-1;
        }

        public void push(int x) {
            if(idx < list.length-1) list[++idx]=x;
        }

        public int pop() {
            if(idx == -1) return -1;
            return list[idx--];
        }

        public void increment(int k, int val) {
            int count = Math.min(k, list.length);
            while(count-- > 0) list[count] += val;
        }
    }
}

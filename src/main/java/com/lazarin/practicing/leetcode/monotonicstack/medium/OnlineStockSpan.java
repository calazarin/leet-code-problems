package com.lazarin.practicing.leetcode.monotonicstack.medium;

import java.util.Stack;

//https://leetcode.com/problems/online-stock-span
public class OnlineStockSpan {

    public class StockSpanner {

        private int currentDay;
        private Stack<int[]> stack;

        public StockSpanner() {
            currentDay = 0;
            stack = new Stack<>();
        }

        //Optimal - T: O(N); S:O(N) where N is the amount of prices in the stack
        public int next(int price) {
            currentDay = currentDay + 1;
            int span = 0;

            while (!stack.isEmpty() && stack.peek()[1] <= price){
                stack.pop();
            }

            if(stack.isEmpty()){
                stack.push(new int[]{currentDay, price});
                span = currentDay;
            }

            if(!stack.isEmpty() && stack.peek()[1] > price){
                span = currentDay - stack.peek()[0];
                stack.push(new int[]{currentDay, price});
            }
            return span;
        }
    }
}
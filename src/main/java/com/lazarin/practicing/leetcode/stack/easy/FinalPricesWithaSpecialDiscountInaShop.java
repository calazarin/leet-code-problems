package com.lazarin.practicing.leetcode.stack.easy;

import java.util.ArrayDeque;
import java.util.Stack;

//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
public class FinalPricesWithaSpecialDiscountInaShop {

    //approach - monotonic stack - find the next smaller element
    //T: O(N)
    //S: O(N)
    public int[] finalPrices(int[] prices) {

        int n = prices.length;
        int[] arr = new int[n];

        Stack<Integer> stack = new Stack<>();

        stack.push(prices[n - 1]);

        arr[n - 1] = prices[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() > prices[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                arr[i] = prices[i];
            } else {
                arr[i] = prices[i] - stack.peek();
            }
            stack.push(prices[i]);

        }
        return arr;
    }

    //approach 2 - without stack
    //T:O(N^2)
    public int[] finalPrices_2(int[] prices) {
        int arr[] = new int[prices.length];
        int i;
        int j;
        for(i = 0; i < prices.length; i++) {
            for(j = i + 1; j < prices.length; j++) {
                if(prices[j] <= prices[i]) {
                    arr[i] = prices[i] - prices[j];
                    break;
                }
            }
            if(j == prices.length) {
                arr[i] = prices[i];
            }
        }
        return arr;
    }
}

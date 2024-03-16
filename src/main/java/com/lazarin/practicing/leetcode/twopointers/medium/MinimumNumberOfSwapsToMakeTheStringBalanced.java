package com.lazarin.practicing.leetcode.twopointers.medium;

import java.util.Stack;

//https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/description/
public class MinimumNumberOfSwapsToMakeTheStringBalanced {

    //approach 1 - using stack
    //T: O(N); S: O(N)
    /**
     - 1st remove all balanced sub-portions using a stack
     */
    public int minSwaps(String s) {
        // remove the balanced part from the given string
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(ch == '[')
                stack.push(ch);
            else {
                if(!stack.isEmpty() && stack.peek() == '[')
                    stack.pop();
                else
                    stack.push(ch);
            }
        }
        int unb = stack.size()/2; // # of open or close bracket
        return (unb+1)/2;
    }

    //approach 2 - no stack
    //T: O(N); S: O(N1)
    public int minSwaps_2(String s) {
        int open = 0, unbalanced = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '[')
                open++;
            else {
                // check if we have found an open bracket before
                if(open > 0) {
                    // we have a proper pair
                    open--; // we used one open bracket for this pair
                }
                else unbalanced++;
            }
        }
        // add the remaining open bracket which are left out for a pair
        unbalanced += open;
        unbalanced /= 2; // # of open brackets or # of close brackets
        return (unbalanced+1)/2;
    }

}

package com.lazarin.practicing.leetcode.strings.medium;

import java.util.Stack;

//https://leetcode.com/problems/valid-parenthesis-string/
public class ValidParenthesisString {

    /**
     * approach - use 2 stacks to track the positions
     * T: O(N)
     * S: O(N)
     */
    public boolean checkValidString(String s) {

        Stack<Integer> openStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                openStack.push(i);
            } else if(s.charAt(i) == '*') {
                starStack.push(i);
            } else {
                if(!openStack.isEmpty()) {
                    openStack.pop();
                } else if(!starStack.isEmpty()){
                    starStack.pop();
                } else {
                    return false;
                }
            }
        }
        //process leftover opening brackets
        while(!openStack.isEmpty()){
           if(starStack.isEmpty()){
               return false;
           } else if(openStack.peek() < starStack.peek()){
               openStack.pop();
               starStack.pop();
           } else {
               return false; //start appears before '('
           }
        }

        return true;
    }

    /**
     * approach 2 - greedy
     */
    public boolean checkValidString_2(String s) {
        if(s.length() < 1) {
            return true;
        }

        int balance = 0; //the number of extra opened left brackets
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')'){
                balance--;
            } else {
                balance++;
            }
            if(balance < 0){ //s has more ')' and '(' and '*'s
                return false;
            }
        }

        if(balance == 0) {
            return true;
        }

        balance = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '('){
                balance--;
            } else {
                balance++;
            }
            if(balance < 0){ //s has more ')' and '(' and '*'s
                return false;
            }
        }

        return true;
    }
}

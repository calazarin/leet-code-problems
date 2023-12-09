package com.lazarin.practicing.leetcode.strings.easy;

import java.util.HashMap;
import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses
public class ValidParentheses {

    public boolean isValid(String s) {

        if(s.length() <= 1) return false;

        char[] allCharacters = s.toCharArray();

        HashMap<Character, Character> openToCloseMap = new HashMap<>();
        openToCloseMap.put(')','(');
        openToCloseMap.put(']','[');
        openToCloseMap.put('}','{');

        Stack<Character> stack = new Stack<>();

        for(char c : allCharacters){

            if(openToCloseMap.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == openToCloseMap.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }

        }

        return stack.isEmpty() ? true : false;
    }
}

package com.lazarin.practicing.leetcode.strings.medium;

import java.util.Stack;

//https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/
public class CheckIfaParenthesesStringCanBeValid {

    public boolean canBeValid(String s, String locked) {
        if(s.length() <= 1) return false;

        Stack<Character> stack = new Stack();

        for(int i = 0; i < s.length(); i++) {

            char curr = s.charAt(i);  // )
            if(curr == ')' && stack.isEmpty()){
                //invalid position; check if we can change it
                if(locked.charAt(i) != '0'){
                    break;
                }
                stack.push('('); //we changed it, we can push a (
            } else if(curr == ')' && !stack.isEmpty()) {
                int popCount = 1;  //1
                //pop until we find an opening
                while(stack.peek() != '(') {
                    stack.pop();
                    popCount++;
                }
                while(popCount > 0) {
                    stack.pop();
                    popCount--;
                }
            } else {
                stack.push(curr);
            }
        }
        return stack.isEmpty();
    }

    public boolean canBeValid_2(String inputString, String locked) {
        return inputString.length() % 2 == 0 &&
                validate(inputString, locked, '(') &&
                validate(inputString, locked, ')');
    }

    public boolean validate(String inputString, String locked, char op) {
        int bal = 0;
        int wild = 0;
        int inputStringSize = inputString.length();

        int start = op == '(' ? 0 : inputStringSize - 1;
        int dir = op == '(' ? 1 : -1;

        for (int i = start; i >= 0 && i < inputStringSize && wild + bal >= 0; i += dir) {
            if (locked.charAt(i) == '1') {
                bal += inputString.charAt(i) == op ? 1 : -1;
            } else {
                ++wild;
            }
        }
        return Math.abs(bal) <= wild;
    }
}

package com.lazarin.practicing.leetcode.arrays.medium;

import java.util.Stack;

//https://leetcode.com/problems/decode-string/
public class DecodeString {

    public String decodeString(String s) {

        Stack<String> strStack = new Stack<>();
        Stack<Integer> nStack = new Stack<>();
        int k = 0;

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                k = (k * 10) + (c - '0');
                continue;
            }

            if (c == '[') {
                nStack.push(k);
                k = 0;
                strStack.push(String.valueOf(c));
                continue;
            }

            if (c != ']') {
                strStack.push(String.valueOf(c));
                continue;
            }

            StringBuilder temp = new StringBuilder();
            while (!strStack.peek().equals("[")) {
                temp.insert(0, strStack.pop());
            }

            // remove the "["
            strStack.pop();

            // Get the new string
            StringBuilder replacement = new StringBuilder();
            int count = nStack.pop();
            for (int i = 0; i < count; i++) {
                replacement.append(temp);
            }
            // Add it to the stack
            strStack.push(replacement.toString());
        }

        StringBuilder result = new StringBuilder();
        while (!strStack.empty()) {
            result.insert(0, strStack.pop());
        }
        return result.toString();
    }
}
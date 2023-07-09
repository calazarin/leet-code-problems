package com.lazarin.practicing.leetcode.strings.medium;

import java.util.Stack;

//https://leetcode.com/problems/removing-stars-from-a-string
public class RemovingStarsFromString {

    //T: O(N) tranverse across the entire list
    //S: O(N) up to the size of our string
    public String removeStars(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '*' && !stack.isEmpty()){
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }

        return stringBuilder.reverse().toString();
    }

    /**
     * T: O(N)
     * S: O(N)
     */
    public String removeStars2(String s) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                answer.deleteCharAt(answer.length() - 1);
            } else {
                answer.append(s.charAt(i));
            }
        }
        return answer.toString();
    }
}
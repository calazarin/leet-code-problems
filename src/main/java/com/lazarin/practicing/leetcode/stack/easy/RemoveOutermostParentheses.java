package com.lazarin.practicing.leetcode.stack.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/remove-outermost-parentheses/
public class RemoveOutermostParentheses {

    //approach 1 - counting parentheses
    //T:O(N); S: O(N)
    public String removeOuterParentheses(String s) {

        int i = 0, j = 0,c = 0;

        List<String> primitives = new ArrayList<>();

        while(i < s.length()) {

            if(s.charAt(i) == '(') c++;
            if(s.charAt(i) == ')') c--;

            if(c == 0) {
                String s1 = s.substring(j, i + 1);
                primitives.add(s1);
                j = i + 1;
            }

            i++;
        }
        StringBuilder ans = new StringBuilder();
        if(!primitives.isEmpty()) {
            for(String p : primitives) {
                if(p.length() > 2){
                    ans.append(p.substring(1, p.length() - 1));
                }
            }
        }
        return ans.toString();
    }

    //approach 2 - using stacks
    public String removeOuterParentheses_2(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int prev = 0, curr = 0;
        for(char c : s.toCharArray()){
            if(c == '(') stack.push(c);
            if(c == ')') stack.pop();

            if(stack.isEmpty()){
                //new string deal with it
                String sub = s.substring(prev, curr + 1);
                if(sub.length() > 2) {
                    ans.append(sub.substring(1, sub.length() - 1));
                }
                prev =  curr + 1;
            }

            curr++;
        }
        return ans.toString();
    }
}

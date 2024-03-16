package com.lazarin.practicing.leetcode.stack.medium;

import java.util.Stack;

//https://leetcode.com/problems/construct-smallest-number-from-di-string/description/
public class ConstructSmallestNumberFromDIString {

    /**
     * approach 1 - using stack
     * if c is 'I', append into the result; save numbers to be in a decreasing order
     * in a stack to be added to result later
     */
    public String smallestNumber(String pattern) {

        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        st.push(count);
        for (char ch : pattern.toCharArray()) {
            if (ch == 'I') {
                while (!st.isEmpty()) {
                    sb.append(st.pop());
                }
                count++;
                st.push(count);
            } else { //if 'D', increment counter and push it to stack
                count++;
                st.push(count);
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.toString();
    }

    /**
     * approach 2 - StringBuilder
     * T:O(N); S:O(N)
     */
    public String smallestNumber_2(String pattern) {
        StringBuilder s = new StringBuilder("123456789".substring(0, pattern.length() + 1));
        int j = 0;

        for (int i = 0; i <= pattern.length(); i++) {
            if (i < pattern.length() && pattern.charAt(i) == 'D') {
                j++; //tracks the length of the decreasing sequence
                continue;
            }

            if (j > 0) { //reserve the substring now as we found a I meaning increasing subsequence
                StringBuilder ns = new StringBuilder(s.substring(i - j, i + 1));
                s.replace(i - j, i + 1, ns.reverse().toString());
            }

            j = 0;
        }

        return s.toString();
    }

}

package com.lazarin.practicing.leetcode.strings.easy;

import java.util.Stack;

//https://leetcode.com/problems/reverse-words-in-a-string
public class ReverseWordsInAString {

    //approach 1 - trim + split by regex
    public String reverseWords(String s) {
        String[] words = s.trim().split("\s+");
        StringBuilder result = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            result.append(words[i]);
            result.append(" ");
        }
        return result.toString().trim();
    }

    //approach 2 - 2 pointers
    public String reverseWords_2(String s) {
        String result = null;
        int i = 0, n = s.length();
        while(i < n){
            while(i < n && s.charAt(i) == ' '){
                i++;
            }
            if(i >= n) {
                break;
            }
            int j = i + 1;
            while(j < n && s.charAt(j) != ' '){
                j++;
            }
            String sub = s.substring(i, j);
            if(result == null){ //first word
                result = sub;
            } else{
                result = sub + " " + result;
            }
            i = j + 1;
        }
        return result;
    }

    //approach 3 - using stack
    public String reverseWords_3(String s) {
        Stack<String> st = new Stack<>();
        for (String a : s.trim().split("\s+")) {
            st.push(a);
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}

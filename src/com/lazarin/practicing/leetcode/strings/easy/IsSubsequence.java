package com.lazarin.practicing.leetcode.strings.easy;

//https://leetcode.com/problems/is-subsequence/
public class IsSubsequence {

    public static void main(String args[]){

        IsSubsequence is = new IsSubsequence();

       /* Input: s = "abc", t = "ahbgdc"
        Output: true*/
        System.out.println(is.isSubsequence("abc","ahbgdc"));

       /* Input: s = "axc", t = "ahbgdc"
        Output: false*/
        System.out.println(is.isSubsequence("axc","ahbgdc"));
    }

    //T: O(m+n)
    //S: O(1)
    public boolean isSubsequence(String s, String t) {

        var s_len = s.length();
        var t_len = t.length();

        if(t_len < s_len) return false;

        int i = 0, j = 0, positiveCounter = 0;
        while(i < s_len && j < t_len){

            if(s.charAt(i) == t.charAt(j)){
                i++;
                positiveCounter++;
            }
            j++;
        }

        return positiveCounter == s_len ? true : false;
    }
}

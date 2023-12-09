package com.lazarin.practicing.leetcode.strings.easy;

//https://leetcode.com/problems/repeated-substring-pattern/
public class RepeatedSubstringPattern {

    //approach 1 - brute force
    //T: O(N^2)
    // it also can be solved with KMP algorithm however it is not so easy
    public boolean repeatedSubstringPattern(String s) {

        int len = s.length();

        for(int i = len / 2; i >= 1; i--){

            if(len % i == 0){
                int num_repeats = len / i;
                String substring = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < num_repeats; j++){
                    sb.append(substring);
                }
                if(sb.toString().equals(s)){
                    return true;
                }
            }

        }
        return false;
    }
}

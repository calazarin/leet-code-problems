package com.lazarin.practicing.leetcode.strings.easy;

//https://leetcode.com/problems/valid-anagram
public class ValidAnagram {

    //T: O(n)
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] charCounter = new int[128];

        for(int i = 0; i < s.length(); i++){
            charCounter[s.charAt(i)]++;
        }

        for(int i = 0; i < t.length(); i++){
            charCounter[t.charAt(i)]--;
            if(charCounter[t.charAt(i)] < 0){
                return false;
            }
        }
        return true;
    }
}

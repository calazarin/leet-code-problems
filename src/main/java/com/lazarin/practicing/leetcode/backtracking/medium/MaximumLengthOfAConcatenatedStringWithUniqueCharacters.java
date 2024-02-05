package com.lazarin.practicing.leetcode.backtracking.medium;

import java.util.List;

//https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/description/
public class MaximumLengthOfAConcatenatedStringWithUniqueCharacters {

    //approach 1 - backtracking
    //T: O(2^n * m) where m is the average length of each word an n is the amount of words
    //in the input array
    public int maxLength(List<String> arr) {
        int[] result = new int[1];
        maxUnique(0, arr, "", result);
        return result[0];
    }

    private void maxUnique(int index, List<String> arr, String current, int[] result){
        if(index == arr.size() && uniqueCharCount(current) > result[0]){
            result[0] = current.length();
        }
        if(index == arr.size()) return;

        maxUnique(index + 1, arr, current, result);
        maxUnique(index + 1, arr, current + arr.get(index), result);
    }

    public int uniqueCharCount(String s) {
        int[] counts = new int[26];
        for(char c : s.toCharArray()) {
            if(counts[c - 'a']++ > 0) {
                return -1;
            }
        }
        return s.length();
    }
}

package com.lazarin.practicing.leetcode.strings.easy;

//https://leetcode.com/problems/merge-strings-alternately/
public class MergeStringsAlternately {

    //T: O(m + n)
    //S: O(1)
    public String mergeAlternately(String word1, String word2) {
        int w1l = word1.length(); //4
        int w2l = word2.length();  //2

        int i = 0;
        int limit = w1l <= w2l ? w1l : w2l; //2

        StringBuilder result = new StringBuilder();
        while(i < limit){ //i = 3
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            i++;
        }

        while(i < w1l){
            result.append(word1.charAt(i));
            i++;
        }

        while(i < w2l){
            result.append(word2.charAt(i));
            i++;
        }

        return result.toString();
    }

    //T: O(m + n)
    //S: O(1)
    public String mergeAlternately_2(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < m || j < n) {
            if (i < m) {
                result.append(word1.charAt(i++));
            }
            if (j < n) {
                result.append(word2.charAt(j++));
            }
        }

        return result.toString();
    }
}

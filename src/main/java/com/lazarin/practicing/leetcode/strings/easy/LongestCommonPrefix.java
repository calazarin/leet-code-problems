package com.lazarin.practicing.leetcode.strings.easy;

//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String commonPrefix = "";
        if(strs == null || strs.length == 1){
            return "";
        }

        for(int i  = 0; i < strs[0].length(); i++){
            for(String str : strs){
                if(i == str.length() || str.charAt(i) != strs[0].charAt(i)){
                    return commonPrefix;
                }
            }
            commonPrefix += strs[0].charAt(i);
        }
        return commonPrefix;
    }

    //T: O(n) where n is the number of characters of all strings together
    //O: O(1)
    public String longestCommonPrefix_2(String[] strs) {
        String longestCommonPrefix = "";
        if(strs == null || strs.length == 0){
            return longestCommonPrefix;
        }
        int index  = 0;
        for(char c : strs[0].toCharArray()){
            for(int i = 1; i < strs.length; i++){
                if(index >= strs[i].length() || c != strs[i].charAt(index)){
                    return longestCommonPrefix;
                }
            }
            longestCommonPrefix += c;
            index++;
        }
        return longestCommonPrefix;
    }
}

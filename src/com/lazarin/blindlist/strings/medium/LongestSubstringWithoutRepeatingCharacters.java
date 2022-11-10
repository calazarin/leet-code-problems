package com.lazarin.blindlist.strings.medium;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String args[]){

        /*Input: s = "abcabcbb"
        Output: 3*/
        System.out.println(lengthOfLongestSubstring2("abcabcbb"));

        /*Input: s = "bbbbb"
        Output: 1*/
        System.out.println(lengthOfLongestSubstring2("bbbbb"));

        /*Input: s = "pwwkew"
        Output: 3*/
        System.out.println(lengthOfLongestSubstring2("pwwkew"));

         /*Input: s = "aab"
        Output: 2*/
        System.out.println(lengthOfLongestSubstring2("aab"));

       /*Input: s = "dvdf"
        Output: 3*/
        System.out.println(lengthOfLongestSubstring2("dvdf"));
    }

    public static int lengthOfLongestSubstring2(String s) {
        Set<Character> charSet = new HashSet<>();
        int leftPointer = 0, result = 0;
        for(int rightPointer =0 ; rightPointer < s.length(); rightPointer++){
            while(charSet.contains(s.charAt(rightPointer))){
                charSet.remove(s.charAt(leftPointer));
                leftPointer++;
            }
            charSet.add(s.charAt(rightPointer));
            result = Math.max(result, charSet.size());
        }
        return result;
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxSeq = 0, tempSeq = 0;
        if(s == null || s.length() == 0){
            return maxSeq;
        }

        Set<Character> charSet = new HashSet<>();
        for(int i =0 ; i < s.length(); i++){
            var c = s.charAt(i);
            if(charSet.add(c)){
                tempSeq++;
            } else {
                charSet.clear();
                tempSeq = 0;
                charSet.add(c);
                tempSeq++;
            }
            if(tempSeq > maxSeq) maxSeq = tempSeq;
        }
        return maxSeq;
    }

}

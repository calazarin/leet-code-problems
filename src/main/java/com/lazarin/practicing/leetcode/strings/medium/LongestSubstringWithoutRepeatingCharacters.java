package com.lazarin.practicing.leetcode.strings.medium;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
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

}

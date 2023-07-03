package com.lazarin.practicing.leetcode.strings.medium;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-repeating-character-replacement/
public class LongestRepeatingCharacterReplacement {

    public static void main(String args[]) {

        /*  Input: s = "ABAB", k = 2
        Output: 4
        Explanation: Replace the two 'A's with two 'B's or vice versa.*/
      //  System.out.println(characterReplacement("ABAB", 2));

       /* Input: s = "AABABBA", k = 1
        Output: 4
        Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
                The substring "BBBB" has the longest repeating letters, which is 4.*/
        System.out.println(characterReplacement("AABABBA", 1));
    }

    //slide windown problem
    //O (26 * N) => O(N)
    public static int characterReplacement(String s, int k) {

        Map<Character, Integer> charMap = new HashMap<>();

        int l = 0, result = 0;

        for (int r = 0; r < s.length(); r++) {

            charMap.put(s.charAt(r), 1 + charMap.getOrDefault(s.charAt(r), 0));

            var maxCharacterCounter = charMap.values()
                    .stream()
                    .max(Integer::compare)
                    .get();

            while((getWindowSize(r,l) - maxCharacterCounter) > k){
                charMap.put(s.charAt(l), charMap.get(s.charAt(l)) - 1);
                l++;
            }
            result = Math.max(result,  getWindowSize(r,l));
        }
        return result;
    }

    private static int getWindowSize(int r, int l){
        var windowSize = r - l + 1;
        return windowSize;
    }
}

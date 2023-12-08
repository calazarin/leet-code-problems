package com.lazarin.practicing.leetcode.strings.medium;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-repeating-character-replacement/
public class LongestRepeatingCharacterReplacement {

    //slide window problem
    //O (26 * N) => O(N)
    public int characterReplacement(String s, int k) {

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

    private int getWindowSize(int r, int l){
        var windowSize = r - l + 1;
        return windowSize;
    }
}

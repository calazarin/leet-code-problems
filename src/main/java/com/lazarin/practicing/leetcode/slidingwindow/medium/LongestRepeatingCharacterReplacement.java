package com.lazarin.practicing.leetcode.slidingwindow.medium;

import java.util.HashMap;

//https://leetcode.com/problems/longest-repeating-character-replacement/description/
public class LongestRepeatingCharacterReplacement {

    //approach - sliding window -
    //T: O(N); S:O(1)
    public int characterReplacement(String s, int k) {
        // Initialising an empty array to store the count of the
        // characters in the given string s
        int[] arr = new int[26];
        int res = 0;
        int max = 0;

        // The left pointer for the sliding window is l AND r is the
        // right pointer
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            // Counting the number of each character in the string s
            arr[s.charAt(r) - 'A']++;

            // Checking the character with max number of occurrence
            max = Math.max(max, arr[s.charAt(r) - 'A']);

            // Now we check if our current window is valid or not
            if (r - l + 1 - max > k) {
                // this means the no. of replacements is more than
                // allowed (k)
                // Decrementing the count of the character which was
                // at l because it is no longer in the window
                arr[s.charAt(l) - 'A']--;
                l++;
            }

            // The max our window can be
            res = Math.max(res, r - l + 1);
        }

        return res;
    }

    //approach - sliding window second approach
    public int characterReplacement2(String s, int k) {

        HashMap<Character, Integer> counterMap = new HashMap<>();
        int res = 0, left = 0;

        for(int right = 0; right < s.length(); right++) {
            counterMap.putIfAbsent(s.charAt(right), 0);
            counterMap.put(s.charAt(right), counterMap.get(s.charAt(right)) + 1);

            int maxCount = counterMap.values().stream().max(Integer::compare).get();
            if(right - left + 1 - maxCount > k) {
                counterMap.put(s.charAt(left), counterMap.get(s.charAt(left)) - 1);
                left += 1;
            }
            res = Math.max(res, right - left + 1);

        }

        return res;
    }
}

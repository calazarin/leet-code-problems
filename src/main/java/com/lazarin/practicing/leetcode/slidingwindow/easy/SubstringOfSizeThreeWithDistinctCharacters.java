package com.lazarin.practicing.leetcode.slidingwindow.easy;

//https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
public class SubstringOfSizeThreeWithDistinctCharacters {

    /**
     * approach - sliding window
     * T: O(N)
     * S: O(1)
     */
    public int countGoodSubstrings(String s) {
        int ans = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length() - 2; i++) {
            if (chars[i] != chars[i + 1]
                    && chars[i] != chars[i + 2]
                    && chars[i + 1] != chars[i + 2]
            ) ans++;
        }
        return ans;
    }

}

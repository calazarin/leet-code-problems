package com.lazarin.practicing.leetcode.slidingwindow.medium;

//https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
public class NumberOfSubstringContainingAllThreeCharacters {

    //brute force?
    public int numberOfSubstrings(String s) {
        int[] countC = new int[26];
        int ans = 0;

        int left = 0;
        while(left <= s.length() - 1){
            int right = left;
            while(right <= s.length() - 1) {
                char curr = s.charAt(right);
                countC[curr - 'a'] += 1;
                if(isValid(countC)) ans++;
                right++;
            }
            countC[s.charAt(left) - 'a'] -= 1;
            left++;
            right--;
            while(left <= right) {
                countC[s.charAt(right) - 'a'] -= 1;
                right--;
            }
        }
        return ans;
    }

    private boolean isValid(int[] letters) {
        char[] cArr = new char[]{'a', 'b', 'c'};
        for(char c : cArr) {
            if(letters[c - 'a'] <= 0){
                return false;
            }
        }
        return true;
    }

    //sliding window - T:O(N)
    public int numberOfSubstrings_2(String s) {
        int n = s.length(), left = 0, right = 0, ans = 0;
        int[] letters = new int[3];
        while(right < n){
            letters[s.charAt(right) - 'a'] += 1;
            while (letters[0] > 0 && letters[1] > 0 && letters[2] > 0){
                ans += n - right;
                letters[s.charAt(left) - 'a'] -= 1;
                left++;
            }
            right++;
        }
        return ans;
    }
}

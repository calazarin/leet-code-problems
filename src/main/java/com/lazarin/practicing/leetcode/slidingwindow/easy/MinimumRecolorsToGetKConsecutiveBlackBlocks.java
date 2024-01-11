package com.lazarin.practicing.leetcode.slidingwindow.easy;

//https://leetcode.com/problems/longest-nice-substring/
public class MinimumRecolorsToGetKConsecutiveBlackBlocks {

    //approach - sliding window
    //T: O(N); S: O(1)
    public int minimumRecolors(String blocks, int k) {
        int currCount  = 0, minCount = Integer.MAX_VALUE, j = 0;

        for(int i = 0; i < blocks.length() - k + 1; i++){
            while(j < blocks.length() && j - i <= k - 1) {
                if(blocks.charAt(j) == 'W') {
                    currCount += 1;
                }
                j++;
            }
            minCount = Math.min(minCount, currCount);
            if(blocks.charAt(i) == 'W') currCount -= 1;
        }

        return minCount;
    }

    //approach 2 - sliding window but different code
    public int minimumRecolors_2(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        for (int lo = -1, hi = 0, white = 0; hi < blocks.length(); ++hi) {
            white += blocks.charAt(hi) == 'W' ? 1 : 0;
            if (hi - lo >= k) { // the window reaches size of k.
                min = Math.min(min, white); // update  minimum.
                // slide 1 step right the lower bound of the sliding
                // window and update the value of white count.
                white -= blocks.charAt(++lo) == 'W' ? 1 : 0;
            }
        }
        return min;
    }
}

package com.lazarin.practicing.leetcode.slidingwindow.medium;

//https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/
public class NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {

    //approach 1 - sliding window
    //T: O(N); S: O(1)
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0, j = k - 1, sum = 0, ansCount = 0;
        while(j <= arr.length - 1) {
            if(sum == 0) {
                for(int x = i; x < k; x++) {
                    sum += arr[x];
                }
                ansCount += checkAvg(sum, k, threshold);
            } else {
                sum -= arr[i - 1];
                sum += arr[j];
                ansCount += checkAvg(sum, k, threshold);
            }
            j += 1;
            i += 1;
        }
        return ansCount;
    }

    private int checkAvg(int sum, int k, int threshold) {
        return ((sum / k) >= threshold) ? 1 : 0;
    }

    //same approach, different implementation
    public int numOfSubarrays_2(int[] arr, int k, int threshold) {
        int n = arr.length;
        int res = 0;
        int sum = 0;

        // Calculate the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        // Slide the window of size 'k' across the array
        for (int i = k; i < n; i++) {
            // If the average of the current window is >= threshold, increment result
            if (sum / k >= threshold) {
                res++;
            }

            // Slide the window: subtract the element going out and add the incoming one
            sum -= arr[i - k];
            sum += arr[i];
        }

        // Check the last window after the loop
        if (sum / k >= threshold) {
            res++;
        }

        return res;
    }
}

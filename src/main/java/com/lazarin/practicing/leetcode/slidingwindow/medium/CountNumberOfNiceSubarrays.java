package com.lazarin.practicing.leetcode.slidingwindow.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

//https://leetcode.com/problems/count-number-of-nice-subarrays/description/
public class CountNumberOfNiceSubarrays {

    //approach 1 - sliding window
    //T: O(N)
    //S: O(1)
    public int numberOfSubarrays(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int oddCount = 0;
        int count = 0;
        int temp = 0;
        while (j < nums.length) {
            if (nums[j] % 2 == 1) {
                oddCount++;
                temp = 0;
            }
            while (oddCount == k) {
                temp++;
                if (nums[i] % 2 == 1) {
                    oddCount--;
                }
                i++;
            }
            count += temp;
            j++;
        }
        return count;
    }


    //approach 2 - prefix sum
    //T: O(n*k)
    public int numberOfSubarrays_2(int[] nums, int k) {
        return countKOddWindow(nums, k);
    }

    private int countKOddWindow(int []arr, int k){
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int ans = 0;
        for (int cur = 0; cur<n; cur++){
            if(arr[cur] % 2 != 0){
                sum++;
            }
            if(sum == k){
                ans++;
            }
            int req = sum - k;
            if(mp.containsKey(req)){
                ans += mp.get(req);
            }
            mp.put(sum, mp.getOrDefault(sum, 0)+1);
        }
        return ans;
    }

    //approach 3 - dequeue (linked list)
    //T:O(N); S:O(K) for the deque
    public int numberOfSubarrays_3(int[] nums, int k) {
        LinkedList<Integer> deq = new LinkedList();
        deq.add(-1);
        int res = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] % 2 == 1)
                deq.add(i);
            if (deq.size() > k + 1)
                deq.pop();
            if (deq.size() == k + 1)
                res += deq.get(1) - deq.get(0);
        }
        return res;
    }
}

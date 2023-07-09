package com.lazarin.practicing.leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/find-the-difference-of-two-arrays
public class FindTheDifferenceOfTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> answer = new ArrayList<>();
        Set<Integer> output2 = new HashSet<>();

        Set<Integer> n1_no_duplicates = new HashSet<>(); //S: O(n)
        Set<Integer> deleted = new HashSet<>(); //S:O(n)

        for(int n : nums1){ //O(n) where n is nums1 length
            n1_no_duplicates.add(n);
        }

        for(int n2: nums2){ //O(m) where m is the nums2 length

            if(n1_no_duplicates.contains(n2)){
                //exists in both; remove from nums1
                n1_no_duplicates.remove(n2); //O(1)
                deleted.add(n2); //O(1)
            } else if(!deleted.contains(n2)){
                output2.add(n2); //O(1)
            }

        }

        answer.add(new ArrayList<Integer>(n1_no_duplicates));
        answer.add(new ArrayList<Integer>(output2));

        return answer;
    }

    List<Integer> getElementsOnlyInFirstList(int[] nums1, int[] nums2) {
        Set<Integer> onlyInNums1 = new HashSet<> ();

        // Store nums2 elements in an unordered set.
        Set<Integer> existsInNums2 = new HashSet<> ();
        for (int num : nums2) { //O(N)
            existsInNums2.add(num);
        }

        // Iterate over each element in the list nums1.
        for (int num : nums1) {
            if (!existsInNums2.contains(num)) { //O(1)
                onlyInNums1.add(num);
            }
        }

        // Convert to vector.
        return new ArrayList<>(onlyInNums1);
    }

    /**
     * Approach 2
     * T:  O(N+M)
     * S: O(max(N,M))
     */
    public List<List<Integer>> findDifference2(int[] nums1, int[] nums2) {
        return Arrays.asList(getElementsOnlyInFirstList(nums1, nums2), getElementsOnlyInFirstList(nums2, nums1));
    }
}

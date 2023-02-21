package com.lazarin.blindlistandmore.arrays.easy;


import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

//https://leetcode.com/problems/third-maximum-number/
public class ThirdMaximumNumber {

    public static void main(String args[]){

        ThirdMaximumNumber tmxn = new ThirdMaximumNumber();

       /* Input: nums = [3,2,1]
        Output: 1
        Explanation:
        The first distinct maximum is 3.
        The second distinct maximum is 2.
        The third distinct maximum is 1.*/
        System.out.println(tmxn.thirdMax(new int[]{3,2,1}));

       /* Input: nums = [1,2]
        Output: 2
        Explanation:
        The first distinct maximum is 2.
        The second distinct maximum is 1.
        The third distinct maximum does not exist, so the maximum (2) is returned instead.*/
        System.out.println(tmxn.thirdMax(new int[]{1,2}));

       /* Input: nums = [2,2,3,1]
        Output: 1
        Explanation:
        The first distinct maximum is 3.
        The second distinct maximum is 2 (both 2's are counted together since they have the same value).
        The third distinct maximum is 1.*/
        System.out.println(tmxn.thirdMax(new int[]{2,2,3,1}));

    }

    //first approach
    //T: O(N)
    //S: O(N)
    public int thirdMax(int[] nums){

        Set<Integer> records = new HashSet<>();

        //max heap
        PriorityQueue<Integer> max_heap = new PriorityQueue<Integer>((a,b) -> b.compareTo(a));
        for(Integer i : nums){
            if(!records.contains(i)){
                max_heap.add(i);
                records.add(i);
            }
        }

        if(max_heap.size() < 3){
            return max_heap.peek();
        } else {
            int i = 1;
            while(i < 3){
                max_heap.poll();
                i++;
            }
            return max_heap.peek();
        }
    }

    //approach 2 - using a min heap instead
    // as we need to know the smallest number among all numbers in the heap
    //T: O(N)
    //S: O(1)
    public int thirdMax2(int[] nums){
        PriorityQueue<Integer> minHeap = new PriorityQueue();
        Set<Integer> taken = new HashSet<Integer>();

        for (int index = 0; index < nums.length; ++index) {
            // If current number was already taken, skip it.
            if (taken.contains(nums[index])) {
                continue;
            }

            // If min heap already has three numbers in it.
            // Pop the smallest if current number is bigger than it.
            if (minHeap.size() == 3) {
                if (minHeap.peek() < nums[index]) {
                    taken.remove(minHeap.poll());

                    minHeap.add(nums[index]);
                    taken.add(nums[index]);
                }
            }
            // If min heap does not have three number we can push it.
            else {
                minHeap.add(nums[index]);
                taken.add(nums[index]);
            }
        }

        // 'nums' has only one distinct element it will be the maximum.
        if (minHeap.size() == 1) {
            return minHeap.peek();
        }
        // 'nums' has two distinct elements.
        else if (minHeap.size() == 2) {
            int firstNum = minHeap.poll();
            return Math.max(firstNum, minHeap.peek());
        }

        return minHeap.peek();
    }
}

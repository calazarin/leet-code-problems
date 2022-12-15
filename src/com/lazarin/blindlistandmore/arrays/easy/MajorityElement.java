package com.lazarin.blindlistandmore.arrays.easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/majority-element/
public class MajorityElement {

    public static void main(String args[]){
        /*Input: nums = [3,2,3]
        Output: 3*/

       /* Input: nums = [2,2,1,1,1,2,2]
        Output: 2*/
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maj = 0, maxCounter = 0;
        for(int i = 0; i < nums.length; i++){
            int tmp;
            if(!map.containsKey(nums[i])){
                tmp = 1;
                map.put(nums[i], tmp);
            } else {
                Integer counter = map.get(nums[i]);
                counter++;
                tmp = counter;
                map.put(nums[i], tmp);
            }
            if(tmp > maxCounter){
                maj = nums[i];
                maxCounter = tmp;
            }
        }
        return maj;
    }

    //Brute force
    //T: O(n^2)
    //S: O(1) as it does not allocate extra memory
    public int majorityElement2(int[] nums) {
        int majorityCount = nums.length/2;

        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }

            if (count > majorityCount) {
                return num;
            }

        }

        return -1;
    }

    //Most optimal solution with Boyer - Moore
    //works only if we have a majority (it happens more than half of the time)
    //T: O(N)
    //S: O(1)
    public int majorityElement3(int[] nums) {

        int res = 0, count = 0;

        for(int n : nums){
            if(count == 0) {
                res = n;
            }
            count += n == res ? 1 : -1;
        }
        return res;
    }

}


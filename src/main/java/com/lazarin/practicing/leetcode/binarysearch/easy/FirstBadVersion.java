package com.lazarin.practicing.leetcode.binarysearch.easy;

//https://leetcode.com/problems/first-bad-version/
public class FirstBadVersion extends VersionControl{

    //approach 1 - most optimal with binary search
    //T: O(logn)
    //S: O(1)
    public int firstBadVersion(int n) {
        // 1,2,3,4,5,6,7,8
        //[g,g,g,g,b,b,b,b]
        int leftP = 1;
        int rightP = n;

        while(leftP < rightP){

            int mid = leftP + (rightP - leftP) / 2; //this technique avoids overflows

            if(!isBadVersion(mid)){ //all previous mid is good
                leftP = mid + 1;
            } else {
                rightP = mid; //mid might be or not the first bad version
            }

        }
        return leftP;
    }

    //approach 2 - linear search
    //T: O(N)
    //S: O(1)
    public int firstBadVersion2(int n) {
        for (int i = 1; i < n; i++) {
            if (isBadVersion(i)) {
                return i;
            }
        }
        return n;
    }
}

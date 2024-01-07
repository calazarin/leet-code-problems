package com.lazarin.practicing.leetcode.binarysearch.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
public class TheKWeakestRowInAMatrix {

    //approach - binary search + min heap
    //T: O(M * logN) + log(M) where M is the amount of rows
    //S: O(M)
    public int[] kWeakestRows(int[][] mat, int k) {


        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> {
               if(a[0] != b[0]){
                   return Integer.compare(a[0], b[0]);
               } else {
                   return Integer.compare(a[1], b[1]);
               }
        });

        for(int row = 0; row < mat.length; row++){
            int soldiersCount = bSearch(mat[row]);
            minHeap.offer(new int[]{soldiersCount,row});
        }

        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = minHeap.poll()[1];
        }

        return ans;
    }

    private int bSearch(int[] m){
        int l = 0, r = m.length - 1;
        while(l <= r) {
            int mid = (r + l) / 2;
            if(m[mid] == 1){
                l = mid + 1;;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    public int[] kWeakestRows_2(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        // Create an array to store the strength of each row
        int[] strength = new int[m];

        // Calculate the strength of each row
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    strength[i]++;
                } else {
                    break;
                }
            }
        }

        // Create a list of row indices and sort it based on strength
        List<Integer> rowIndices = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            rowIndices.add(i);
        }

        Collections.sort(rowIndices, (a, b) -> {
            if (strength[a] == strength[b]) {
                return a - b;
            }
            return strength[a] - strength[b];
        });

        // Get the first k elements from the sorted list
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rowIndices.get(i);
        }

        return result;
    }
}

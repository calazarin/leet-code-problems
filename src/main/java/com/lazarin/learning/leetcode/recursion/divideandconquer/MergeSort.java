package com.lazarin.learning.leetcode.recursion.divideandconquer;

public class MergeSort {

    public static void main(String args[]){
        int[] toBeSorted = new int[]{ -5, 10, 5, 59, 23, 100, 76, 14};
        mergeSort(toBeSorted, 0, toBeSorted.length - 1);
        for(int i = 0; i < toBeSorted.length; i++){
            System.out.print(toBeSorted[i]+ " - ");
        }
    }

    public static void mergeSort(int[]data, int start, int end){

        if(start < end){
            int mid = (start + end) / 2;
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
            merge(data, start, end, mid);
        }

    }

    private static void merge(int[] data, int start, int end, int mid) {
        //modify the original array to avoid changing the original one
        int[] temp = new int[end - start  + 1];

        int i = start, j = mid + 1, k = 0;
        //while both sub-arrays have values, then try and merge them in sorted order
        while(i <= mid && j <= end){
            if(data[i] <= data[j]){
                temp[k] = data[i];
                k++;
                i++;
            } else {
                temp[k] = data[j];
                k++;
                j++;
            }
        }

        //add the rest of the values from the left sub-array into result
        while(i <= mid){
            temp[k] = data[i];
            i++;
            k++;
        }

        //add the rest of values from right sub-array into result
        while(j <= end){
            temp[k] = data[j];
            k++;
            j++;
        }

        //copy phase
        for(i = start; i <= end; i++){
            data[i] = temp[i - start];
        }
    }

}

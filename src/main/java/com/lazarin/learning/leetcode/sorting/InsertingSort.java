package com.lazarin.learning.leetcode.sorting;

public class InsertingSort {

    public void insertionSort(int[] list){

        for(int i = 1; i < list.length; i++) {

            var jIndex = i - 1;

            for(int j = jIndex; j >= 0; j--){

                if(list[j] > list[j + 1]){
                    var temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }

            }
        }
    }

}

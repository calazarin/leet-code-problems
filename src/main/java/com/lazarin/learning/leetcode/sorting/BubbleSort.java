package com.lazarin.learning.leetcode.sorting;

public class BubbleSort {

    public void bubbleSort(int[] list){
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    var temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }

            }
        }
    }

}

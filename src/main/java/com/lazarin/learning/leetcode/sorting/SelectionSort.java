package com.lazarin.learning.leetcode.sorting;

//https://www.youtube.com/watch?v=l7-f9gS8VOs
public class SelectionSort {

    //approach 1
    public void selectionSort(int[] list){

        for(int i = 0; i < list.length; i++){

          var minValueIndex = i;

          for(int j = i+1; j < list.length; j++){

              if(list[j] < list[minValueIndex]){
                  minValueIndex = j;
              }

          }
          if(list[minValueIndex] < list[i]){
              var temp = list[i];
              list[i] = list[minValueIndex];
              list[minValueIndex] = temp;
          }
        }
    }

    //approach 2
    //T: O(n^2)
    public void selSort(int[] arr){
        //0-1-2-3-4-5
        //1-2-3-5-9-4

        for(int i = 0; i < arr.length - 1; i++){
            int minValue = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < minValue) {
                    minValue = arr[j];
                    swap(arr, i, j);
                }
            }

        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

package com.lazarin.learning.sorting;

import java.util.Arrays;
import java.util.Random;

public class SelectionSortMain {

    public static void main(String args[]){

        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before: ");
        System.out.println(Arrays.toString(numbers));

        selectionSort(numbers);

        System.out.println("After: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static int[] selectionSort(int[] list){

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

        return list;
    }

}

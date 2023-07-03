package com.lazarin.learning.leetcode.sorting;

import java.util.Arrays;
import java.util.Random;

public class InsertingSortMain {


    public static void main(String args[]){
        Random rand = new Random();
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before: ");
        System.out.println(Arrays.toString(numbers));

        insertionSort(numbers);

        System.out.println("After: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static int[] insertionSort(int[] list){

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

        return list;
    }

}

package com.lazarin.learning.leetcode.sorting.practice;

import java.util.Arrays;
import java.util.Random;

/**
 * selection sort always passes the minimum value to the fist position
 *
 */
public class SelectionSortTest {

    public static void main(String args[]){

        Random randonN = new Random();

        int[] input = new int[15];
        for(int i = 0; i < 15; i++){
            input[i] = randonN.nextInt(100);
        }

        selectionSort(input);
        System.out.println(Arrays.toString(input));
    }

    private static void selectionSort(int[] input) {

        for(int i = 0; i < input.length; i++){
            int minIndex = i;
            for(int j = i + 1; j < input.length; j++){
                if(input[j] < input[minIndex]){
                    minIndex = j;
                }
            }
            //swa
            var temp = input[i];
            input[i] = input[minIndex];
            input[minIndex] = temp;
        }

    }


}

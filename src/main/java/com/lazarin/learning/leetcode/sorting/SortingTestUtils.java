package com.lazarin.learning.leetcode.sorting;

import java.util.Arrays;
import java.util.Random;

public class SortingTestUtils {

    public static int[] generateRandomArray(){
        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }
        return numbers;
    }

    public static void printBefore(int[] array){
        System.out.println("Before: "+Arrays.toString(array));
    }

    public static void printAfter(int[] array){
        System.out.println("After: "+Arrays.toString(array));
    }
}

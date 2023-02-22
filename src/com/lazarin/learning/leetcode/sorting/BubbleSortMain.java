package com.lazarin.learning.sorting;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortMain {


    public static void main(String args[]){

        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before: ");
        System.out.println(Arrays.toString(numbers));

        bubbleSort(numbers);

        System.out.println("After: ");
        System.out.println(Arrays.toString(numbers));

    }

    private static int[] bubbleSort(int[] list){

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    var temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }

            }
        }
        return list;
    }

}

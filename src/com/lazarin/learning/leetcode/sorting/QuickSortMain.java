package com.lazarin.learning.sorting;

import java.util.Arrays;
import java.util.Random;

public class  QuickSortMain {


    public static void main(String args[]){

        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before: ");
        System.out.println(Arrays.toString(numbers));

        quickSort(numbers);


        System.out.println("After: ");
        System.out.println(Arrays.toString(numbers));

    }

    private static void quickSort(int[] numbers){

        //numbers, lower index, higher index
        quickSort(numbers, 0, numbers.length -1);
    }

    private static void quickSort(int[] numbers, int lowIndex, int highIndex) {

       /* if(lowIndex >= highIndex){
            return;
        }*/

        int leftPointer = partition(numbers, lowIndex, highIndex);

        if (lowIndex < leftPointer - 1){
            quickSort(numbers, lowIndex, leftPointer - 1);
        }

        //quickSort(numbers, lowIndex, leftPointer - 1);

        if(leftPointer < highIndex) {
            quickSort(numbers, leftPointer, highIndex);
        }

    }

    private static int partition(int[] numbers, int lowIndex, int highIndex) {

        int pivot = numbers[(highIndex + lowIndex) / 2];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer <= rightPointer){

            //try to find a number that is lower or equals to pivot
          //  while(numbers[leftPointer] <= pivot && leftPointer < rightPointer){
            while(numbers[leftPointer] < pivot){
                leftPointer++;
            }

            //try to find a number that is higher or equals to pivot
          //  while(numbers[rightPointer] >= pivot && leftPointer < rightPointer){
            while(numbers[rightPointer] > pivot){
                rightPointer--;
            }

            //swap
            //swap(numbers, leftPointer, rightPointer);
            if(leftPointer <= rightPointer){
                swap(numbers, leftPointer, rightPointer);
                leftPointer++;
                rightPointer--;
            }
        }

        //swap the pivot
        //swap(numbers, leftPointer, highIndex);
        return leftPointer;
    }

    private static void swap(int[] numbers, int a, int b){
        var temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }

}

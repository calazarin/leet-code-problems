package com.lazarin.learning.leetcode.sorting;

public class QuickSort {

    public void quickSort(int[] numbers){
        //numbers, lower index, higher index
        quickSort(numbers, 0, numbers.length -1);
    }

    private void quickSort(int[] numbers, int lowIndex, int highIndex) {
        int leftPointer = partition(numbers, lowIndex, highIndex);

        if (lowIndex < leftPointer - 1){
            quickSort(numbers, lowIndex, leftPointer - 1);
        }

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
            while(numbers[leftPointer] < pivot){
                leftPointer++;
            }

            //try to find a number that is higher or equals to pivot
            while(numbers[rightPointer] > pivot){
                rightPointer--;
            }

            //swap
            if(leftPointer <= rightPointer){
                swap(numbers, leftPointer, rightPointer);
                leftPointer++;
                rightPointer--;
            }
        }
        return leftPointer;
    }

    private static void swap(int[] numbers, int a, int b){
        var temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }

}

package com.lazarin.learning.leetcode.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static com.lazarin.learning.leetcode.sorting.SortingTestUtils.generateRandomArray;
import static com.lazarin.learning.leetcode.sorting.SortingTestUtils.printAfter;
import static com.lazarin.learning.leetcode.sorting.SortingTestUtils.printBefore;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link SelectionSort}
 */
public class SelectionSortTest {

    @Test
    public void shouldSortArrayApproach1(){

        int[] numbers = generateRandomArray();
        printBefore(numbers);

        int[] beforeSorting = numbers.clone();
        SelectionSort solution = new SelectionSort();
        solution.selSort(numbers);

        printAfter(numbers);

        assertThat(numbers, is(
            Arrays.stream(Arrays.stream(beforeSorting).toArray()).sorted().toArray())
        );
    }

    @Test
    public void shouldSortArrayApproach2(){

        int[] numbers = generateRandomArray();
        printBefore(numbers);

        int[] beforeSorting = numbers.clone();
        SelectionSort solution = new SelectionSort();
        solution.selectionSort(numbers);

        printAfter(numbers);

        assertThat(numbers, is(
            Arrays.stream(Arrays.stream(beforeSorting).toArray()).sorted().toArray())
        );
    }
}

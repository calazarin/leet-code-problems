package com.lazarin.learning.leetcode.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static com.lazarin.learning.leetcode.sorting.SortingTestUtils.generateRandomArray;
import static com.lazarin.learning.leetcode.sorting.SortingTestUtils.printAfter;
import static com.lazarin.learning.leetcode.sorting.SortingTestUtils.printBefore;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link BubbleSort}
 */
public class BubbleSortTest {

    @Test
    public void shouldSortArray(){

        int[] numbers = generateRandomArray();
        printBefore(numbers);

        int[] beforeSorting = numbers.clone();

        BubbleSort solution = new BubbleSort();
        solution.bubbleSort(numbers);

        printAfter(numbers);

        assertThat(numbers, is(
            Arrays.stream(Arrays.stream(beforeSorting).toArray()).sorted().toArray())
        );
    }

}

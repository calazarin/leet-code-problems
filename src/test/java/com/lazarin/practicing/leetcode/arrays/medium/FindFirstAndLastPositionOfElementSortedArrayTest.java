package com.lazarin.practicing.leetcode.arrays.medium;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link FindFirstAndLastPositionOfElementSortedArray}
 */
public class FindFirstAndLastPositionOfElementSortedArrayTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        FindFirstAndLastPositionOfElementSortedArray
                solution = new FindFirstAndLastPositionOfElementSortedArray();

        assertThat(solution.searchRange(new int[]{5,7,7,8,8,10}, 8), is(new int[]{3,4}));
        assertThat(solution.searchRange(new int[]{5,5,7,7,8,8,10}, 6), is(new int[]{-1,-1}));
        assertThat(solution.searchRange(new int[]{}, 0), is(new int[]{-1,-1}));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        FindFirstAndLastPositionOfElementSortedArray
                solution = new FindFirstAndLastPositionOfElementSortedArray();

        assertThat(solution.searchRange2(new int[]{5,7,7,8,8,10}, 8), is(new int[]{3,4}));
        assertThat(solution.searchRange2(new int[]{5,5,7,7,8,8,10}, 6), is(new int[]{-1,-1}));
        assertThat(solution.searchRange2(new int[]{}, 0), is(new int[]{-1,-1}));

    }
}

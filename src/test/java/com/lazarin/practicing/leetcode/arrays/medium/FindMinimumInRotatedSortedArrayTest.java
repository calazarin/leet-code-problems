package com.lazarin.practicing.leetcode.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link FindMinimumInRotatedSortedArray}
 */
public class FindMinimumInRotatedSortedArrayTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        FindMinimumInRotatedSortedArray
                solution = new FindMinimumInRotatedSortedArray();

        assertThat(solution.findMin(new int[]{3,4,5,1,2}), is(1));
        assertThat(solution.findMin(new int[]{4,5,6,7,0,1,2}), is(0));
        assertThat(solution.findMin(new int[]{11,13,15,17}), is(11));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        FindMinimumInRotatedSortedArray
                solution = new FindMinimumInRotatedSortedArray();

        assertThat(solution.findMin2(new int[]{3,4,5,1,2}), is(1));
        assertThat(solution.findMin2(new int[]{4,5,6,7,0,1,2}), is(0));
        assertThat(solution.findMin2(new int[]{11,13,15,17}), is(11));

    }
}

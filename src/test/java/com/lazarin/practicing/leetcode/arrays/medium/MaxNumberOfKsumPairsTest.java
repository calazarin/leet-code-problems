package com.lazarin.practicing.leetcode.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MaxNumberOfKsumPairs}
 */
public class MaxNumberOfKsumPairsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        MaxNumberOfKsumPairs
                solution = new MaxNumberOfKsumPairs();

        assertThat(solution.maxOperations(new int[]{3,1,3,4,3}, 6), is(1));
        assertThat(solution.maxOperations(new int[]{1,2,3,4}, 5), is(2));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        MaxNumberOfKsumPairs
                solution = new MaxNumberOfKsumPairs();

        assertThat(solution.maxOperations2(new int[]{3,1,3,4,3}, 6), is(1));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3(){

        MaxNumberOfKsumPairs
                solution = new MaxNumberOfKsumPairs();

        assertThat(solution.maxOperations3(new int[]{3,1,3,4,3}, 6), is(1));
        assertThat(solution.maxOperations3(new int[]{1,2,3,4}, 5), is(2));
    }
}

package com.lazarin.practicing.leetcode.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link KthLargestElementInArray}
 */
public class KthLargestElementInArrayTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        KthLargestElementInArray
                solution = new KthLargestElementInArray();

        assertThat(solution.findKthLargest(new int[]{3,2,1,5,6,4},2), is(5));
        assertThat(solution.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4), is(4));

    }
}

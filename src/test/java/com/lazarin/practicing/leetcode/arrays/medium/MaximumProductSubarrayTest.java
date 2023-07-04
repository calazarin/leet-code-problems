package com.lazarin.practicing.leetcode.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MaximumProductSubarray}
 */
public class MaximumProductSubarrayTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        MaximumProductSubarray
                solution = new MaximumProductSubarray();

        //Explanation: [2,3] has the largest product 6
        assertThat(solution.maxProduct(new int[]{2,3,-2,4}), is(6));
        // Explanation: The result cannot be 2, because [-2,-1] is not a subarray
        assertThat(solution.maxProduct(new int[]{-2,0,-1}), is(0));
    }
}

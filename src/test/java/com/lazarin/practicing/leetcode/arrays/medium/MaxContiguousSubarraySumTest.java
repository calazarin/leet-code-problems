package com.lazarin.practicing.leetcode.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MaxContiguousSubarraySum}
 */
public class MaxContiguousSubarraySumTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        MaxContiguousSubarraySum
                solution = new MaxContiguousSubarraySum();

        //Explanation: [4,-1,2,1] has the largest sum = 6.
        assertThat(solution.maxContiguousSubarraySum(new int[]{-2,1,-3,4,-1,2,1,-5,4}), is(6));

        assertThat(solution.maxContiguousSubarraySum(new int[]{1}), is(1));
        assertThat(solution.maxContiguousSubarraySum(new int[]{5,4,-1,7,8}), is(23));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        MaxContiguousSubarraySum
                solution = new MaxContiguousSubarraySum();

        //Explanation: [4,-1,2,1] has the largest sum = 6.
        assertThat(solution.maxContiguousSubarraySum2(new int[]{-2,1,-3,4,-1,2,1,-5,4}), is(6));

        assertThat(solution.maxContiguousSubarraySum2(new int[]{1}), is(1));
        assertThat(solution.maxContiguousSubarraySum2(new int[]{5,4,-1,7,8}), is(23));
    }
}

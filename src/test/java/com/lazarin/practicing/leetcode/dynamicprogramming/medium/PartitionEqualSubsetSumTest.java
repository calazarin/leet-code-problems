package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link PartitionEqualSubsetSum}
 */
public class PartitionEqualSubsetSumTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        PartitionEqualSubsetSum solution = new PartitionEqualSubsetSum();
        assertThat(solution.canPartition(new int[]{1,5,11,5}), is(true));
        assertThat(solution.canPartition(new int[]{1,2,3,5}), is(false));
    }
}

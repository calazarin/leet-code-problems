package com.lazarin.practicing.leetcode.greedy.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link MinimumSubsequenceInNonIncreasingOrder}
 */
public class MinimumSubsequenceInNonIncreasingOrderTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        MinimumSubsequenceInNonIncreasingOrder solution = new MinimumSubsequenceInNonIncreasingOrder();
        assertThat(solution.minSubsequence(new int[]{4,3,10,9,8}), is(Arrays.asList(10,9)));
        assertThat(solution.minSubsequence(new int[]{4,4,7,6,7}), is(Arrays.asList(7,7,6)));
    }

    public void shouldReturnExpectedAnswers_approach2() {
        MinimumSubsequenceInNonIncreasingOrder solution = new MinimumSubsequenceInNonIncreasingOrder();
        assertThat(solution.minSubsequence_2(new int[]{4,3,10,9,8}), is(Arrays.asList(10,9)));
        assertThat(solution.minSubsequence_2(new int[]{4,4,7,6,7}), is(Arrays.asList(7,7,6)));
    }
}

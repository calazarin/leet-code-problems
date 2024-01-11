package com.lazarin.practicing.leetcode.slidingwindow.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link LongestSubarrayOfOnesAfterDeletingOneElement}
 */
public class LongestSubarrayOfOnesAfterDeletingOneElementTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        LongestSubarrayOfOnesAfterDeletingOneElement solution = new LongestSubarrayOfOnesAfterDeletingOneElement();

        assertThat(solution.longestSubarray(new int[]{1,1,0,1}), is(3));
        assertThat(solution.longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}), is(5));
        assertThat(solution.longestSubarray(new int[]{1,1,1}), is(2));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        LongestSubarrayOfOnesAfterDeletingOneElement solution = new LongestSubarrayOfOnesAfterDeletingOneElement();

        assertThat(solution.longestSubarray2(new int[]{1,1,0,1}), is(3));
        assertThat(solution.longestSubarray2(new int[]{0,1,1,1,0,1,1,0,1}), is(5));
        assertThat(solution.longestSubarray2(new int[]{1,1,1}), is(2));
    }
}

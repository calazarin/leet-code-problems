package com.lazarin.practicing.leetcode.backtracking.medium;

import com.lazarin.practicing.leetcode.dynamicprogramming.medium.TargetSum;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link TargetSum}
 */
public class TargetSumTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        TargetSum targetSum = new TargetSum();
        assertThat(targetSum.findTargetSumWays_1(new int[]{1,1,1,1,1}, 3), is(5));
        assertThat(targetSum.findTargetSumWays_1(new int[]{1}, 1), is(1));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {
        TargetSum targetSum = new TargetSum();
        assertThat(targetSum.findTargetSumWays_2(new int[]{1,1,1,1,1}, 3), is(5));
        assertThat(targetSum.findTargetSumWays_2(new int[]{1}, 1), is(1));
    }

}

package com.lazarin.practicing.leetcode.twopointers.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MinimumNumberOfSwapsToMakeTheStringBalanced}
 */
public class MinimumNumberOfSwapsToMakeTheStringBalancedTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        MinimumNumberOfSwapsToMakeTheStringBalanced solution = new MinimumNumberOfSwapsToMakeTheStringBalanced();

        assertThat(solution.minSwaps("][]["), is(1));
        assertThat(solution.minSwaps("]]][[["), is(2));
        assertThat(solution.minSwaps("[]"), is(0));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        MinimumNumberOfSwapsToMakeTheStringBalanced solution = new MinimumNumberOfSwapsToMakeTheStringBalanced();

        assertThat(solution.minSwaps_2("][]["), is(1));
        assertThat(solution.minSwaps_2("]]][[["), is(2));
        assertThat(solution.minSwaps_2("[]"), is(0));
    }
}

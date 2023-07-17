package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link TwoSum}
 */
public class TwoSumTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        TwoSum solution = new TwoSum();

        assertThat(solution.twoSum(new int[]{2, 7, 11, 15}, 9), is(new int[]{0,1}));
        assertThat(solution.twoSum(new int[]{3, 2, 4}, 6), is(new int[]{1,2}));
        assertThat(solution.twoSum(new int[]{3,3}, 6), is(new int[]{0,1}));

    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        TwoSum solution = new TwoSum();

        assertThat(solution.twoSum2(new int[]{2, 7, 11, 15}, 9), is(new int[]{1,0}));
        assertThat(solution.twoSum2(new int[]{3, 2, 4}, 6), is(new int[]{2,1}));
        assertThat(solution.twoSum2(new int[]{3,3}, 6), is(new int[]{1,0}));

    }
}

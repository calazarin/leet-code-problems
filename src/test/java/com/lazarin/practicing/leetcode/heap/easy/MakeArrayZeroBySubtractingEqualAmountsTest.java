package com.lazarin.practicing.leetcode.heap.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link MakeArrayZeroBySubtractingEqualAmounts}
 */
public class MakeArrayZeroBySubtractingEqualAmountsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        MakeArrayZeroBySubtractingEqualAmounts solution = new MakeArrayZeroBySubtractingEqualAmounts();
        assertThat(solution.minimumOperations(new int[]{1,5,0,3,5}), is(3));
        assertThat(solution.minimumOperations(new int[0]), is(0));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        MakeArrayZeroBySubtractingEqualAmounts solution = new MakeArrayZeroBySubtractingEqualAmounts();
        assertThat(solution.minimumOperations_2(new int[]{1,5,0,3,5}), is(3));
        assertThat(solution.minimumOperations_2(new int[0]), is(0));
    }
}

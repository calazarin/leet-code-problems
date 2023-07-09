package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link ContainsDuplicate}
 */
public class ContainsDuplicateTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        ContainsDuplicate solution = new ContainsDuplicate();

        assertThat(solution.containsDuplicate(new int[]{1,2,3,1}), is(true));
        assertThat(solution.containsDuplicate(new int[]{ 1,2,3,4 }), is(false));
        assertThat(solution.containsDuplicate(new int[]{ 1,1,1,3,3,4,3,2,4,2 }), is(true));
    }
}

package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MaxConsecutiveOnes}
 */
public class MaxConsecutiveOnesTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();

        assertThat(solution.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}), is(3));
        assertThat(solution.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}), is(2));

    }
}

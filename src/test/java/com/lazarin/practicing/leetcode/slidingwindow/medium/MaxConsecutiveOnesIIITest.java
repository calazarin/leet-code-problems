package com.lazarin.practicing.leetcode.slidingwindow.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MaxConsecutiveOnesIII}
 */
public class MaxConsecutiveOnesIIITest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        MaxConsecutiveOnesIII solution = new MaxConsecutiveOnesIII();

        assertThat(solution.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2), is(6));
        assertThat(solution.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3), is(10));
        assertThat(solution.longestOnes(new int[]{0, 0, 1, 1, 1, 0, 0}, 0), is(3));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        MaxConsecutiveOnesIII solution = new MaxConsecutiveOnesIII();

        assertThat(solution.longestOnes2(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2), is(6));
        assertThat(solution.longestOnes2(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3), is(10));
        assertThat(solution.longestOnes2(new int[]{0, 0, 1, 1, 1, 0, 0}, 0), is(3));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3() {

        MaxConsecutiveOnesIII solution = new MaxConsecutiveOnesIII();

        assertThat(solution.longestOnes3(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2), is(6));
        assertThat(solution.longestOnes3(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3), is(10));
        assertThat(solution.longestOnes3(new int[]{0, 0, 1, 1, 1, 0, 0}, 0), is(3));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach4() {

        MaxConsecutiveOnesIII solution = new MaxConsecutiveOnesIII();

        assertThat(solution.longestOnes4(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2), is(6));
        assertThat(solution.longestOnes4(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3), is(10));
        assertThat(solution.longestOnes4(new int[]{0, 0, 1, 1, 1, 0, 0}, 0), is(3));
    }
}

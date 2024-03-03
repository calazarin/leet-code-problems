package com.lazarin.practicing.leetcode.twopointers.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link RearrangeArrayElementsBySign}
 */
public class RearrangeArrayElementsBySignTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        RearrangeArrayElementsBySign solution = new RearrangeArrayElementsBySign();

        assertThat(solution.rearrangeArray(new int[]{3,1,-2,-5,2,-4}), is(new int[]{3,-2,1,-5,2,-4}));
        assertThat(solution.rearrangeArray(new int[]{-1,1}), is(new int[]{1,-1}));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        RearrangeArrayElementsBySign solution = new RearrangeArrayElementsBySign();

        assertThat(solution.rearrangeArray_2(new int[]{3,1,-2,-5,2,-4}), is(new int[]{3,-2,1,-5,2,-4}));
        assertThat(solution.rearrangeArray_2(new int[]{-1,1}), is(new int[]{1,-1}));
    }
}

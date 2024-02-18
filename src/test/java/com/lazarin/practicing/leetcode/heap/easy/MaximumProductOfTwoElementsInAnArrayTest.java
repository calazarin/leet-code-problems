package com.lazarin.practicing.leetcode.heap.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link MaximumProductOfTwoElementsInAnArray}
 */
public class MaximumProductOfTwoElementsInAnArrayTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        MaximumProductOfTwoElementsInAnArray solution = new MaximumProductOfTwoElementsInAnArray();
        assertThat(solution.maxProduct(new int[]{3,4,5,2}), is(12));
        assertThat(solution.maxProduct(new int[]{1,5,4,5}), is(16));
        assertThat(solution.maxProduct(new int[]{3,7}), is(12));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        MaximumProductOfTwoElementsInAnArray solution = new MaximumProductOfTwoElementsInAnArray();
        assertThat(solution.maxProduct_2(new int[]{3,4,5,2}), is(12));
        assertThat(solution.maxProduct_2(new int[]{1,5,4,5}), is(16));
        assertThat(solution.maxProduct_2(new int[]{3,7}), is(12));
    }


    @Test
    public void shouldReturnExpectedAnswers_approach3() {

        MaximumProductOfTwoElementsInAnArray solution = new MaximumProductOfTwoElementsInAnArray();
        assertThat(solution.maxProduct_3(new int[]{3,4,5,2}), is(12));
        assertThat(solution.maxProduct_3(new int[]{1,5,4,5}), is(16));
        assertThat(solution.maxProduct_3(new int[]{3,7}), is(12));
    }
}

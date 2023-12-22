package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link NextGreaterElementI}
 */
public class NextGreaterElementITest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        NextGreaterElementI solution = new NextGreaterElementI();

        assertThat(solution.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2}),
                is(new int[]{-1,3,-1}));

        assertThat(solution.nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4}),
                is(new int[]{3,-1}));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {
        NextGreaterElementI solution = new NextGreaterElementI();

        assertThat(solution.nextGreaterElement_2(new int[]{4,1,2}, new int[]{1,3,4,2}),
                is(new int[]{-1,3,-1}));

        assertThat(solution.nextGreaterElement_2(new int[]{2,4}, new int[]{1,2,3,4}),
                is(new int[]{3,-1}));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3() {
        NextGreaterElementI solution = new NextGreaterElementI();

        assertThat(solution.nextGreaterElement_3(new int[]{4,1,2}, new int[]{1,3,4,2}),
                is(new int[]{-1,3,-1}));

        assertThat(solution.nextGreaterElement_3(new int[]{2,4}, new int[]{1,2,3,4}),
                is(new int[]{3,-1}));
    }
}

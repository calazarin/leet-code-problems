package com.lazarin.practicing.leetcode.bitmanipulation.easy;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link CountingBits}
 */
public class CountBitsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        CountingBits solution = new CountingBits();

        assertThat(solution.countBits(2), is(new int[]{0,1,1}));
        assertThat(solution.countBits(5), is(new int[]{0,1,1,2,1,2}));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        CountingBits solution = new CountingBits();

        assertThat(solution.countBits_2(2), is(new int[]{0,1,1}));
        assertThat(solution.countBits_2(5), is(new int[]{0,1,1,2,1,2}));
    }

}

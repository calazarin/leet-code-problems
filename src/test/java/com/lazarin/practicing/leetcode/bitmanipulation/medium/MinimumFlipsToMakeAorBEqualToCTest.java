package com.lazarin.practicing.leetcode.bitmanipulation.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link MinimumFlipsToMakeAorBEqualToC}
 */
public class MinimumFlipsToMakeAorBEqualToCTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        MinimumFlipsToMakeAorBEqualToC solution = new MinimumFlipsToMakeAorBEqualToC();
        assertThat(solution.minFlips(2,6,5), is(3));
        assertThat(solution.minFlips(4,2,7), is(1));
        assertThat(solution.minFlips(1,2,3), is(0));
    }
}

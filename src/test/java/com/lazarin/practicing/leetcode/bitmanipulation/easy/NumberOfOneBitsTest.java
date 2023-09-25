package com.lazarin.practicing.leetcode.bitmanipulation.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link NumberOfOneBits}
 */
public class NumberOfOneBitsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        NumberOfOneBits solution = new NumberOfOneBits();

        assertThat(solution.hammingWeight(00000000000000000000000000001011), is(3));
        assertThat(solution.hammingWeight(00000000000000000000000010000000), is(1));

    }
}

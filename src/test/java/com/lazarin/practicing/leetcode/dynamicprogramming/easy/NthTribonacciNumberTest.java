package com.lazarin.practicing.leetcode.dynamicprogramming.easy;

import com.lazarin.practicing.leetcode.dynamicprogramming.medium.CoinChange;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link NthTribonacciNumber}
 */
public class NthTribonacciNumberTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        NthTribonacciNumber solution = new NthTribonacciNumber();

        assertThat(solution.tribonacci(4), is(4));
        assertThat(solution.tribonacci(25), is(1389537));
        assertThat(solution.tribonacci(0), is(0));
    }

}

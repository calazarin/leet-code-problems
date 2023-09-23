package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
/**
 * {@link CoinChange}
 */
public class CoinChangeTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        CoinChange solution = new CoinChange();

        assertThat(solution.coinChange(new int[]{1,2,5}, 11), is(3));
        assertThat(solution.coinChange(new int[]{2}, 3), is(-1));
        assertThat(solution.coinChange(new int[]{1}, 0), is(0));
        assertThat(solution.coinChange(new int[]{2,3}, 5), is(2));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        CoinChange solution = new CoinChange();

        assertThat(solution.coinChange2(new int[]{1,2,5}, 11), is(3));
        assertThat(solution.coinChange2(new int[]{2}, 3), is(-1));
        assertThat(solution.coinChange2(new int[]{1}, 0), is(0));
        assertThat(solution.coinChange2(new int[]{2,3}, 5), is(2));
    }
}

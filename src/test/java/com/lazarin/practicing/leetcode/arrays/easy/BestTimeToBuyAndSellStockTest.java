package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link BestTimeToBuyAndSellStock}
 */
public class BestTimeToBuyAndSellStockTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        assertThat(solution.maxProfit(new int[]{ 7,1,5,3,6,4 }), is(5));
        assertThat(solution.maxProfit(new int[]{ 7,6,4,3,1 }), is(0));
    }
}

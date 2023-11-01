package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link BestTimeToBuyAndSellStockII}
 */
public class BestTImeToBuyAndSellStockIITest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();

        assertThat(solution.maxProfit(new int[]{7,1,5,3,6,4}), is(7));
        assertThat(solution.maxProfit(new int[]{1,2,3,4,5}), is(4));
        assertThat(solution.maxProfit(new int[]{7,6,4,3,1}), is(0));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();

        assertThat(solution.maxProfit_2(new int[]{7,1,5,3,6,4}), is(7));
        assertThat(solution.maxProfit_2(new int[]{1,2,3,4,5}), is(4));
        assertThat(solution.maxProfit_2(new int[]{7,6,4,3,1}), is(0));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3(){
        BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();

        assertThat(solution.maxProfit_3(new int[]{7,1,5,3,6,4}), is(7));
        assertThat(solution.maxProfit_3(new int[]{1,2,3,4,5}), is(4));
        assertThat(solution.maxProfit_3(new int[]{7,6,4,3,1}), is(0));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach4(){
        BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();

        assertThat(solution.maxProfit_4(new int[]{7,1,5,3,6,4}), is(7));
        assertThat(solution.maxProfit_4(new int[]{1,2,3,4,5}), is(4));
        assertThat(solution.maxProfit_4(new int[]{7,6,4,3,1}), is(0));
    }
}

package com.lazarin.practicing.leetcode.dynamicprogramming.hard;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link BestTimeToBuyAndSellStockIV}
 */
public class BestTimeToBuyAndSellStockIVTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        BestTimeToBuyAndSellStockIV solution = new BestTimeToBuyAndSellStockIV();

        assertThat(solution.maxProfit(2, new int[]{2,4,1}), is(2));
        assertThat(solution.maxProfit(2, new int[]{3,2,6,5,0,3}), is(7));
        assertThat(solution.maxProfit_2(2, new int[]{3,3,5,0,0,3,1,4}), is(6));
        assertThat(solution.maxProfit(2, new int[]{6,1,3,2,4,7}), is(7));
        assertThat(solution.maxProfit_2(4, new int[]{1,2,4,2,5,7,2,4,9,0}), is(15));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        BestTimeToBuyAndSellStockIV solution = new BestTimeToBuyAndSellStockIV();

        assertThat(solution.maxProfit_2(2, new int[]{2,4,1}), is(2));
        assertThat(solution.maxProfit_2(2, new int[]{3,2,6,5,0,3}), is(7));
        assertThat(solution.maxProfit_2(2, new int[]{3,3,5,0,0,3,1,4}), is(6));
        assertThat(solution.maxProfit_2(2, new int[]{6,1,3,2,4,7}), is(7));
        assertThat(solution.maxProfit_2(4, new int[]{1,2,4,2,5,7,2,4,9,0}), is(15));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3(){
        BestTimeToBuyAndSellStockIV solution = new BestTimeToBuyAndSellStockIV();

        assertThat(solution.maxProfit_3(2, new int[]{2,4,1}), is(2));
        assertThat(solution.maxProfit_3(2, new int[]{3,2,6,5,0,3}), is(7));
        assertThat(solution.maxProfit_3(2, new int[]{3,3,5,0,0,3,1,4}), is(6));
        assertThat(solution.maxProfit_3(2, new int[]{6,1,3,2,4,7}), is(7));
        assertThat(solution.maxProfit_3(4, new int[]{1,2,4,2,5,7,2,4,9,0}), is(15));
    }
}

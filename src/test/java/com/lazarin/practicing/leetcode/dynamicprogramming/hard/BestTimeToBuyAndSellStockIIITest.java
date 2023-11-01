package com.lazarin.practicing.leetcode.dynamicprogramming.hard;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @{link BestTimeToBuyAndSellStockIII}
 */
public class BestTimeToBuyAndSellStockIIITest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();

        assertThat(solution.maxProfit(new int[]{3,3,5,0,0,3,1,4}), is(6));
        assertThat(solution.maxProfit(new int[]{1,2,3,4,5}), is(4));
        assertThat(solution.maxProfit(new int[]{7,6,4,3,1}), is(0));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();

        assertThat(solution.maxProfit_2(new int[]{3,3,5,0,0,3,1,4}), is(6));
        assertThat(solution.maxProfit_2(new int[]{1,2,3,4,5}), is(4));
        assertThat(solution.maxProfit_2(new int[]{7,6,4,3,1}), is(0));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3(){
        BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();

        assertThat(solution.maxProfit_3(new int[]{3,3,5,0,0,3,1,4}), is(6));
        assertThat(solution.maxProfit_3(new int[]{1,2,3,4,5}), is(4));
        assertThat(solution.maxProfit_3(new int[]{7,6,4,3,1}), is(0));
    }
}

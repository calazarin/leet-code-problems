package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link BestTimeToBuyAndSellStockWithTransactionFee}
 */
public class BestTimeToBuyAndSellStockWithTransactionFeeTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        BestTimeToBuyAndSellStockWithTransactionFee solution = new BestTimeToBuyAndSellStockWithTransactionFee();

        assertThat(solution.maxProfit(new int[]{1,3,2,8,4,9}, 2), is(8));
        assertThat(solution.maxProfit(new int[]{1,3,7,5,10,3}, 3), is(6));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        BestTimeToBuyAndSellStockWithTransactionFee solution = new BestTimeToBuyAndSellStockWithTransactionFee();

        assertThat(solution.maxProfit_2(new int[]{1,3,2,8,4,9}, 2), is(8));
        assertThat(solution.maxProfit_2(new int[]{1,3,7,5,10,3}, 3), is(6));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3(){
        BestTimeToBuyAndSellStockWithTransactionFee solution = new BestTimeToBuyAndSellStockWithTransactionFee();

        assertThat(solution.maxProfit_3(new int[]{1,3,2,8,4,9}, 2), is(8));
        assertThat(solution.maxProfit_3(new int[]{1,3,7,5,10,3}, 3), is(6));
    }
}

package com.lazarin.practicing.leetcode.dynamicprogramming.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
public class BestTimeToBuyAndSellStockWithCooldownTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        BestTimeToBuyAndSellStockWithCooldown solution = new BestTimeToBuyAndSellStockWithCooldown();

        assertThat(solution.maxProfit(new int[]{1,2,3,0,2}), is(3));
        assertThat(solution.maxProfit(new int[]{1}), is(0));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){
        BestTimeToBuyAndSellStockWithCooldown solution = new BestTimeToBuyAndSellStockWithCooldown();

        assertThat(solution.maxProfit_2(new int[]{1,2,3,0,2}), is(3));
        assertThat(solution.maxProfit_2(new int[]{1}), is(0));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach3(){
        BestTimeToBuyAndSellStockWithCooldown solution = new BestTimeToBuyAndSellStockWithCooldown();

        assertThat(solution.maxProfit_3(new int[]{1,2,3,0,2}), is(3));
        assertThat(solution.maxProfit_3(new int[]{1}), is(0));
    }
}

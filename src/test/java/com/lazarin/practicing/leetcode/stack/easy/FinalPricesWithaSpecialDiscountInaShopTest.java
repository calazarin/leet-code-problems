package com.lazarin.practicing.leetcode.stack.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link FinalPricesWithaSpecialDiscountInaShop}
 */
public class FinalPricesWithaSpecialDiscountInaShopTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        FinalPricesWithaSpecialDiscountInaShop solution = new FinalPricesWithaSpecialDiscountInaShop();
        assertThat(solution.finalPrices(new int[]{8,4,6,2,3}), is(new int[]{4,2,4,2,3}));
        assertThat(solution.finalPrices(new int[]{1,2,3,4,5}), is(new int[]{1,2,3,4,5}));
        assertThat(solution.finalPrices(new int[]{10,1,1,6}), is(new int[]{9,0,1,6}));
        assertThat(solution.finalPrices(
                new int[]   {8,7,4,2,8,1,7,7,10,1}),
                is(new int[]{1,3,2,1,7,0,0,6,9,1}));
    }
}

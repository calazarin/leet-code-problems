package com.lazarin.practicing.leetcode.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link ProductOfArrayExceptSelf}
 */
public class ProductOfArrayExceptSelfTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        ProductOfArrayExceptSelf
                solution = new ProductOfArrayExceptSelf();

        assertThat(solution.productExceptSelf(new int[]{1,2,3,4}), is(new int[]{24,12,8,6}));
        assertThat(solution.productExceptSelf(new int[]{-1,1,0,-3,3}), is(new int[]{0,0,9,0,0}));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2(){

        ProductOfArrayExceptSelf
                solution = new ProductOfArrayExceptSelf();

        assertThat(solution.productExceptSelf(new int[]{1,2,3,4}), is(new int[]{24,12,8,6}));
        assertThat(solution.productExceptSelf(new int[]{-1,1,0,-3,3}), is(new int[]{0,0,9,0,0}));
    }
}

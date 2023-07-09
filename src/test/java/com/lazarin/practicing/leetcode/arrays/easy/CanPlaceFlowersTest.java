package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link CanPlaceFlowers}
 */
public class CanPlaceFlowersTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {
        CanPlaceFlowers solution = new CanPlaceFlowers();

         /*Input: flowerbed = [1,0,0,0,1], n = 1
        Output: true*/
        assertThat(solution.canPlaceFlowers(new int[]{1,0,0,0,1}, 1), is(true));

          /*  Input: flowerbed = [1,0,0,0,1], n = 2
        Output: false*/
        assertThat(solution.canPlaceFlowers(new int[]{1,0,0,0,1}, 2), is(false));

    }
}

package com.lazarin.practicing.leetcode.binarysearch.medium;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


/**
 * {@link SuccessfulPairsOfSpellsAndPotions}
 */
public class SuccessfulPairsOfSpellsAndPotionsTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        SuccessfulPairsOfSpellsAndPotions solution = new SuccessfulPairsOfSpellsAndPotions();

        assertThat(solution.successfulPairs(new int[]{5,1,3}, new int[]{1,2,3,4,5}, 7), is(new int[]{4,0,3}));
        assertThat(solution.successfulPairs(new int[]{3,1,2}, new int[]{8,5,8}, 16), is(new int[]{2,0,2}));

    }

}

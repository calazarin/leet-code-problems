package com.lazarin.practicing.leetcode.binarysearch.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link KokoEatingBananas}
 */
public class KokoEatingBananasTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        KokoEatingBananas solution = new KokoEatingBananas();

        assertThat(solution.minEatingSpeed(new int[]{3,6,7,11},8),is(4));
        assertThat(solution.minEatingSpeed(new int[]{30,11,23,4,20},5),is(30));
        assertThat(solution.minEatingSpeed(new int[]{30,11,23,4,20},6),is(23));
    }

}

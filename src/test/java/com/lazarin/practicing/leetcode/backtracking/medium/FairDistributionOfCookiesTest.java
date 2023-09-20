package com.lazarin.practicing.leetcode.backtracking.medium;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link FairDistributionOfCookies}
 */
public class FairDistributionOfCookiesTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        FairDistributionOfCookies solution = new FairDistributionOfCookies();

        assertThat(solution.distributeCookies(new int[]{8,15,10,20,8}, 2), is(31));
        assertThat(solution.distributeCookies(new int[]{6,1,3,2,2,4,1,2}, 3), is(7));

    }
}

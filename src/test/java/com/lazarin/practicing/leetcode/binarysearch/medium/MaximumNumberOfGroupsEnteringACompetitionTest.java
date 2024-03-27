package com.lazarin.practicing.leetcode.binarysearch.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link MaximumNumberOfGroupsEnteringACompetition}
 */
public class MaximumNumberOfGroupsEnteringACompetitionTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        MaximumNumberOfGroupsEnteringACompetition solution = new MaximumNumberOfGroupsEnteringACompetition();
        assertThat(solution.maximumGroups(new int[]{10,6,12,7,3,5}),is(3));
        assertThat(solution.maximumGroups(new int[]{8,8}),is(1));
    }
}

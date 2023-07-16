package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;

/**
 * {@link KidsWithTheGreatestNumberOfCandies}
 */
public class KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        KidsWithTheGreatestNumberOfCandies solution =
                new KidsWithTheGreatestNumberOfCandies();

        assertThat(solution.kidsWithCandies(new int[]{2,3,5,1,3}, 3), hasItems(
                true, true, true, false, true));

        assertThat(solution.kidsWithCandies(new int[]{4,2,1,1,2}, 1), hasItems(
                true, false, false, false, false));

        assertThat(solution.kidsWithCandies(new int[]{12,1,12}, 10), hasItems(
                true, false, true));
    }
}

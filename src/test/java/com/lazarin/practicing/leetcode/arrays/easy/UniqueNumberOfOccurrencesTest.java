package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link UniqueNumberOfOccurrences}
 */
public class UniqueNumberOfOccurrencesTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        UniqueNumberOfOccurrences solution =
                new UniqueNumberOfOccurrences();

        assertThat(solution.uniqueOccurrences(new int[]{1,2,2,1,1,3}), is(true));
        assertThat(solution.uniqueOccurrences(new int[]{1,2}), is(false));
        assertThat(solution.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}), is(true));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        UniqueNumberOfOccurrences solution =
                new UniqueNumberOfOccurrences();

        assertThat(solution.uniqueOccurrences2(new int[]{1,2,2,1,1,3}), is(true));
        assertThat(solution.uniqueOccurrences2(new int[]{1,2}), is(false));
        assertThat(solution.uniqueOccurrences2(new int[]{-3,0,1,-3,1,1,1,-3,10,0}), is(true));
    }
}

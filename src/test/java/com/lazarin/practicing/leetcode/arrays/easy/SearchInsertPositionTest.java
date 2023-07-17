package com.lazarin.practicing.leetcode.arrays.easy;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link SearchInsertPosition}
 */
public class SearchInsertPositionTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        SearchInsertPosition solution = new SearchInsertPosition();
        assertThat(solution.searchInsert(new int[]{1,3,5,6}, 5), is(2));
        assertThat(solution.searchInsert(new int[]{1,3,5,6}, 2), is(1));
        assertThat(solution.searchInsert(new int[]{1,3,5,6}, 7), is(4));

    }
}

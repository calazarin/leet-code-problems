package com.lazarin.practicing.leetcode.slidingwindow.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link SubstringOfSizeThreeWithDistinctCharacters}
 */
public class SubstringOfSizeThreeWithDistinctCharactersTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        SubstringOfSizeThreeWithDistinctCharacters solution = new SubstringOfSizeThreeWithDistinctCharacters();

        assertThat(solution.countGoodSubstrings("xyzzaz"), is(1));
        assertThat(solution.countGoodSubstrings("aababcabc"), is(4));
    }
}

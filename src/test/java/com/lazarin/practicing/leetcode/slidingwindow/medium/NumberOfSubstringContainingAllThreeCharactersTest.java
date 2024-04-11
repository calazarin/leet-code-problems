package com.lazarin.practicing.leetcode.slidingwindow.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link NumberOfSubstringContainingAllThreeCharacters}
 */
public class NumberOfSubstringContainingAllThreeCharactersTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        NumberOfSubstringContainingAllThreeCharacters solution = new NumberOfSubstringContainingAllThreeCharacters();

        assertThat(solution.numberOfSubstrings("abcabc"), is(10));
        assertThat(solution.numberOfSubstrings("aaacb"), is(3));
        assertThat(solution.numberOfSubstrings("abc"), is(1));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        NumberOfSubstringContainingAllThreeCharacters solution = new NumberOfSubstringContainingAllThreeCharacters();

        assertThat(solution.numberOfSubstrings_2("abcabc"), is(10));
        assertThat(solution.numberOfSubstrings_2("aaacb"), is(3));
        assertThat(solution.numberOfSubstrings_2("abc"), is(1));
    }
}

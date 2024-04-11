package com.lazarin.practicing.leetcode.slidingwindow.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link LongestRepeatingCharacterReplacement}
 */
public class LongestRepeatingCharacterReplacementTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1() {

        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();

        assertThat(solution.characterReplacement("ABAB", 2), is(4));
        assertThat(solution.characterReplacement("AABABBA", 1), is(4));
    }

    @Test
    public void shouldReturnExpectedAnswers_approach2() {

        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();

        assertThat(solution.characterReplacement2("ABAB", 2), is(4));
        assertThat(solution.characterReplacement2("AABABBA", 1), is(4));
    }
}

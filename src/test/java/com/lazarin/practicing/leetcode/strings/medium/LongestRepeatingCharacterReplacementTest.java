package com.lazarin.practicing.leetcode.strings.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link LongestRepeatingCharacterReplacement}
 */
public class LongestRepeatingCharacterReplacementTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        assertThat(solution.characterReplacement("ABAB", 2), is(4));
        assertThat(solution.characterReplacement("AABABBA", 1), is(4));
    }
}

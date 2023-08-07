package com.lazarin.practicing.leetcode.strings.medium;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link LongestSubstringWithoutRepeatingCharacters}
 */
public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void shouldReturnExpectedAnswers_approach1(){

        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

        assertThat(solution.lengthOfLongestSubstring("abcabcbb"), is(3));
        assertThat(solution.lengthOfLongestSubstring("bbbbb"), is(1));
        assertThat(solution.lengthOfLongestSubstring("pwwkew"), is(3));
        assertThat(solution.lengthOfLongestSubstring("aab"), is(2));
        assertThat(solution.lengthOfLongestSubstring("dvdf"), is(3));

    }

}
